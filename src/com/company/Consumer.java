package com.company;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T x);
}
