package com.technotigers.technolib.actions;

public class SleepAction implements Action {
    private double beginTs = -1;
    private final double dt;

    public SleepAction(double dt) {
        this.dt = dt;
    }

    @Override
    public boolean run() {
        double t;
        if (beginTs < 0) {
            beginTs = now();
            t = 0;
        } else {
            t = now() - beginTs;
        }
        return t < dt;
    }

    private double now() {
        return System.nanoTime() * 1e-9;
    }
    
}
