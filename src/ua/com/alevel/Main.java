package ua.com.alevel;

import ua.com.alevel.a.A;
import ua.com.alevel.a.AA;
import ua.com.alevel.a.b.B;
import ua.com.alevel.a.util.TestUtil;
import ua.com.alevel.enums.PlanetEnum;
import ua.com.alevel.planet.Mars;
import ua.com.alevel.planet.Planet;
import ua.com.alevel.planet.PlanetPrinter;
import ua.com.alevel.planet.Saturn;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Planet> planets = new ArrayList<>();
        planets.add(new Mars());
        planets.add(new Saturn());
//        for (int i = 0; i < planets.size(); i++) {
//            System.out.println("planet"
//                    + planets.get(i).getClass().getName()
//                    + " position = "
//                    + planets.get(i).position());
//        }

        Mars mars1 = new Mars();
        mars1.position();
        mars1.skyNlo();

        Planet mars2 = new Mars();
        mars2.position();

        Planet saturn = new Saturn();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        singleton.setI(10);
//        System.out.println("singleton1 = " + singleton1.getI());


//        System.out.println("PlanetEnum.MARS = " + PlanetEnum.valueOf("MARS"));
//        System.out.println("PlanetEnum.MARS = " + PlanetEnum.MARS.name());
        for (PlanetEnum value : PlanetEnum.values()) {
            System.out.println("value = " + value.name());
            System.out.println("value = " + value.ordinal());
            System.out.println("value = " + value.getIndex());
            System.out.println("value = " + value.getPe());
        }
        //        mars1.setCurrentPlanet(saturn);

//        PlanetPrinter printer1 = new PlanetPrinter(mars1);
//        printer1.print();
//        System.out.println("printer1 = " + printer1.getPlanet());
//        PlanetPrinter printer2 = new PlanetPrinter(saturn);
//        printer2.print();
//        System.out.println("printer2 = " + printer2.getPlanet());


//        B b = new B();
//        TestUtil.A = 10;
//        System.out.println("TestUtil.A = " + TestUtil.A);
//        System.out.println("TestUtil.CURRENT_CLASS = " + TestUtil.CURRENT_CLASS);
//        A a = new A(new AA());
//        FinalClass.test();


//        long l = Long.MAX_VALUE;
//        System.out.println("l = " + l);
//        int i = (int) l;
//        System.out.println("i = " + i);
//        System.out.println("Integer.toBinaryString(i) = " + Integer.toBinaryString(i));
//        System.out.println("i in long = " + Long.toBinaryString(i));
//        System.out.println("-1 in long = " + Long.toBinaryString(-1L));
//        System.out.println("i = " + Integer.toBinaryString(Integer.MAX_VALUE));
//        System.out.println("i = " + Integer.MAX_VALUE);
    }
}
