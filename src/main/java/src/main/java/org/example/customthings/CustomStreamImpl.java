package org.example.customthings;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class CustomStreamImpl<T> implements CustomStream<T>{
    private final Iterable<T> source;
    private final List<Function<Iterator<T>, Iterator<?>>> operations;

    public CustomStreamImpl(Iterable<T> source) {
        this.source = source;
        this.operations =  new ArrayList<>();
    }

    private CustomStreamImpl(Iterable<T> source, List<Function<Iterator<T>, Iterator<?>>> operations) {
        this.source = source;
        this.operations = operations;


    }

    @Override
    public <R> CustomStream<R> map(Function<? super T, ? extends R> mapper) {
        operations.add(tIterator ->  new Iterator<R>() {
                    @Override
                    public boolean hasNext() {
                        return tIterator.hasNext();
                    }

                    @Override
                    public R next() {
                        return mapper.apply(tIterator.next());
                    }
                }
        );
        return (CustomStream<R>) new CustomStreamImpl<>(source, operations);
    }

    @Override
    public CustomStream<T> filter(Predicate<? super T> predicate) {
        operations.add(iterator -> new Iterator<T>() {
            private T nextElement;
            private boolean hasNextComputed = false;

            @Override
            public boolean hasNext() {
                while (iterator.hasNext()) {
                    T element = iterator.next();
                    if (predicate.test(element)) {
                        nextElement = element;
                        hasNextComputed = true;
                        return true;
                    }
                }
                return false;
            }

            @Override
            public T next() {
                if (!hasNextComputed && !hasNext()) {
                    throw new NoSuchElementException();
                }
                hasNextComputed = false;
                return nextElement;
            }
        });
        return new CustomStreamImpl<>(source, operations);
    }


    @Override
    public void forEach(Consumer<? super T> action) {
        Iterator<T> iterator = applyOperations(source.iterator());
        while (iterator.hasNext()) {
            action.accept(iterator.next());
        }
    }

    private Iterator<T> applyOperations(Iterator<T> iterator) {
        for (Function<Iterator<T>, Iterator<?>> operation : operations) {
            iterator = (Iterator<T>) operation.apply(iterator);
        }
        return iterator;
    }
}
