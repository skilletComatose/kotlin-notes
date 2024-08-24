package org.example.customthings;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface CustomStream<T> {

    <R> CustomStream<R> map(Function<? super T, ? extends R> mapper);
    CustomStream<T> filter(Predicate<? super T> predicate);

    void forEach(Consumer<? super T> consumer);
}
