package ua.com.alevel.enums;

/**
 * @author Iehor Funtusov, created 16/10/2020 - 9:25 PM
 */

public enum PlanetEnum {

    MERCURY(1589430, "jfjhglhfds"),
    MARS(10, "hrtghtrgt"),
    SATURN(18, "jfdh;ksdf"),
    VENERA(2888, "kglhfd;ls"),
    NEPTUN(30, "g'lhfds;");

    private int index;
    private String pe;

    PlanetEnum(int index, String pe) {
        this.index = index;
        this.pe = pe;
    }

    public int getIndex() {
        return index;
    }

    public String getPe() {
        return pe;
    }
}
