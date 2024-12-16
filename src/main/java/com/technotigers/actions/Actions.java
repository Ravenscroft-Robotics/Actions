package com.technotigers.actions;

public class Actions {
    private Actions() {}

    public static void runBlocking(Action action) {
        while (action.run());
    }
}