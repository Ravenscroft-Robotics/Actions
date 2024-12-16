package com.technotigers.actions;

public class InstantAction implements Action {
    private InstantFunction f;

    public InstantAction(InstantFunction f) {
        this.f = f;
    }

    @Override
    public boolean run() {
        f.run();
        return false;
    }   
}