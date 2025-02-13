package com.technotigers.technolib.actions;

public class TimeoutAction implements Action {

    long end;
    Action action;

    public TimeoutAction(Action action, int millis) {
        this.action = action;
        this.end = now() + millis;
    }

    @Override
    public boolean run() {
        if (now() >= end) return false;
        return action.run();
    }

    private long now() { return System.currentTimeMillis(); }
}
