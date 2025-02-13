package com.technotigers.technolib;

import com.technotigers.technolib.actions.Action;
import com.technotigers.technolib.actions.Actions;

public class Main {
    public static void main(String[] args) {
        Actions.runBlocking(test1(10));
    }

    public static Action test1(int start) {
        return new Action() {
            int s = start;
            @Override
            public boolean run() {
                s--;
                System.out.println(s);
                return s != 0;
            }
        };
    }
}
