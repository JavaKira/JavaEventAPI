package com.event.generic;

public interface GenericEvent<T> {
    void invoke(T parameter);

    void addAction(GenericAction<T> action);

    void removeAction(GenericAction<T> action);
}
