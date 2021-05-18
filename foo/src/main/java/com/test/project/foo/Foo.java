package com.test.project.foo;

import com.test.project.common.PlusOne;

public class Foo {
    int doIt(int val) {
        PlusOne pone = new PlusOne();
        return pone.doIt(val);
    }
}
