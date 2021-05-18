package com.test.project.foo;

import java.util.concurrent.Callable;

public class FooApp implements Callable<Integer> {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.printf("Must specify a single integer argument\n");
            System.exit(1);
        }

        int argVal = -1;
        try {
            argVal = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.printf("Must specify a single integer argument\n");
            System.exit(1);
        }

        Foo foo = new Foo();
        int result = foo.doIt(argVal);
        System.out.printf("val = %d\n", result);
        System.exit(0);
    }

    @Override
    public Integer call() {
        return 0;
    }
}
