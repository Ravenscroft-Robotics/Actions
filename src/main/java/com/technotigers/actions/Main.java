package com.technotigers.actions;

public class Main {
    private static int var = 10;
    private static int var2 = 10;
    private static int var3 = 10;
    public static void main(String[] args) {
    }

    public static Action a() {
        return new Action() {
            @Override
            public boolean run() {
                var--;
                System.out.println(var);
                return var != 0;
            }
        };
    }

    public static Action b() {
        return new Action() {
            @Override
            public boolean run() {
                var2--;
                System.out.println("bob");
                return var2 != 0;
            }
        };
    }

    public static Action c() {
        return new Action() {
            @Override
            public boolean run() {
                var3--;
                System.out.println("test");
                return var3 != 0;
            }
        };
    }
}