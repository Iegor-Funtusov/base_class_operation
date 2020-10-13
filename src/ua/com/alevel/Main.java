package ua.com.alevel;

import ua.com.alevel.a.A;
import ua.com.alevel.a.AA;
import ua.com.alevel.a.b.B;
import ua.com.alevel.a.util.TestUtil;

public class Main {

    public static void main(String[] args) {
        B b = new B();
        TestUtil.A = 10;
        System.out.println("TestUtil.A = " + TestUtil.A);
        System.out.println("TestUtil.CURRENT_CLASS = " + TestUtil.CURRENT_CLASS);
        A a = new A(new AA());
        FinalClass.test();


    }
}
