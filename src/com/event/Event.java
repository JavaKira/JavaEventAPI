package com.event;

public interface Event {
    void invoke();

    void addAction(Action action);

    void removeAction(Action action);
}
