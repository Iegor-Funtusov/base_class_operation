package ua.com.alevel.a;

import ua.com.alevel.a.util.TestUtil;

public class A {

    private int anInt;
    private final AA aa;

    public A(AA aa) {
        this.aa = aa;
    }

    public A() {
        this.aa = new AA();
    }

    public void init() {

        int b = TestUtil.A;
        b = TestUtil.test();

        TestUtil util = new TestUtil();
        b = util.b;
    }
}
