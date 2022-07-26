package com.company;

@FunctionalInterface
public interface UnaryOperator<T> {
    T apply(T t);
}
