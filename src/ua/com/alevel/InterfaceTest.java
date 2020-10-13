package ua.com.alevel;

public interface InterfaceTest {

    int G = 9;

    void test();

    default void test1() {
        System.out.println("InterfaceTest.test1");
    }
}
