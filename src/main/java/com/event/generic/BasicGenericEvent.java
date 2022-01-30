package com.event.generic;

import java.util.ArrayList;
import java.util.List;

public class BasicGenericEvent<T> implements GenericEvent<T> {
    private final List<GenericAction<T>> actions = new ArrayList<>();

    @Override
    public void invoke(T parameter)
    {
        actions.forEach(action -> action.run(parameter));
    }

    @Override
    public void addAction(GenericAction<T> action)
    {
        actions.add(action);
    }

    @Override
    public void removeAction(GenericAction<T> action)
    {
        actions.remove(action);
    }
}
