package com.technotigers.actions;

public class SequentialAction implements Action {
    private Action[] actions;
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