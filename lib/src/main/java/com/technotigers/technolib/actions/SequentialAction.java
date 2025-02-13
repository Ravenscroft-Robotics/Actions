package com.technotigers.technolib.actions;

public class SequentialAction implements Action {
    private final Action[] actions;
    private int index = 0;

    public SequentialAction(Action... actions) {
        this.actions = actions;
    }

    public Action[] getActions() {
        return actions;
    }

    @Override
    public boolean run() {
        if (!actions[index].run()) index++;
        return index != actions.length;
    }
}