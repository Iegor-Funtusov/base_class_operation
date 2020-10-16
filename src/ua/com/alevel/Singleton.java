package ua.com.alevel;

/**
 * @author Iehor Funtusov, created 16/10/2020 - 9:13 PM
 */

public class Singleton {

    private static Singleton instance;

    private int i;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
