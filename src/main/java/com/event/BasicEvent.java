package com.event;

import java.util.ArrayList;
import java.util.List;

public class BasicEvent implements Event {
    private final List<Action> actions = new ArrayList<>();

    @Override
    public void invoke()
    {
        actions.forEach(Action::run);
    }

    @Override
    public void addAction(Action action)
    {
        actions.add(action);
    }

    @Override
    public void removeAction(Action action)
    {
        actions.remove(action);
    }
}
