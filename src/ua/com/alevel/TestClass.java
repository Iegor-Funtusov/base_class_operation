package ua.com.alevel;

public abstract class TestClass {

    public TestClass() {}

    public final void testFinal() {
        int g = InterfaceTest.G;
    }

    public abstract void testNotFinal();
}
