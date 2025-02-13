package com.technotigers.technolib.actions;

public class ParallelAction implements Action{
    private final Action[] actions;
    private final boolean[] bools;

    public ParallelAction(Action... actions) {
        this.actions = actions;
        this.bools = new boolean[actions.length];
        for (int i = 0; i < actions.length; i++)
            bools[i] = true;
    }

    @Override
    public boolean run() {
        for (int i = 0; i < actions.length; i++)
            if (bools[i]) bools[i] = actions[i].run();
        for (boolean bool : bools)
            if (bool) return true;
        return false;
    }
}