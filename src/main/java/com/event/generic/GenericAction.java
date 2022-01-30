package com.event.generic;

@FunctionalInterface
public interface GenericAction<T> {
    void run(T parameter);
}
