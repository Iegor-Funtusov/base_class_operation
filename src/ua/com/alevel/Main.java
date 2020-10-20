package ua.com.alevel;

import ua.com.alevel.a.A;
import ua.com.alevel.a.AA;
import ua.com.alevel.a.b.B;
import ua.com.alevel.a.util.TestUtil;
import ua.com.alevel.enums.PlanetEnum;
import ua.com.alevel.nullable.Course;
import ua.com.alevel.nullable.Group;
import ua.com.alevel.nullable.Student;
import ua.com.alevel.planet.Mars;
import ua.com.alevel.planet.Planet;
import ua.com.alevel.planet.PlanetPrinter;
import ua.com.alevel.planet.Saturn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static  int errorCount = 0;

    private static void read2() {
        try {
            Integer i = Integer.parseInt(reader.readLine());
            Integer d = Integer.parseInt(reader.readLine());
            System.out.println("i = " + i);
            i = i / d;
            System.out.println("i = " + i);
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("e = " + e.getMessage());

            System.out.println("e = " + e.getMessage());
            System.out.println("e = " + e.getClass().getName());
            ++errorCount;
            System.out.println("You are stupied: please enter a correct value format");
            if (errorCount <= 3) {
                read2();
            } else {
                throw new NumberFormatException("You are fully stupied");
            }

            System.out.println("You are stupied: please enter a not sero value");
            read2();
        } finally {
            System.out.println("finally");
        }
    }

//    private static void read2() {
//        try {
//            Integer i = Integer.parseInt(reader.readLine());
//            Integer d = Integer.parseInt(reader.readLine());
//            System.out.println("i = " + i);
//            i = i / d;
//            System.out.println("i = " + i);
//        } catch (IOException e) {
//            System.out.println("e = " + e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("e = " + e.getMessage());
//            System.out.println("e = " + e.getClass().getName());
//            ++errorCount;
//            System.out.println("You are stupied: please enter a correct value format");
//            if (errorCount <= 3) {
//                read2();
//            } else {
//                throw new NumberFormatException("You are fully stupied");
//            }
//        } catch (ArithmeticException e) {
//            System.out.println("You are stupied: please enter a not sero value");
//            read2();
//        }
//    }

//    private static void read2() {
//
//        String s = null;
//        try {
//            s = reader.readLine();
//        } catch (IOException e) {
//            System.out.println("e = " + e.getMessage());
//        }
//
//        Integer i = null;
//        try {
//            i = Integer.parseInt(s);
//        } catch (Exception e) {
//            System.out.println("e = " + e.getMessage());
//            System.out.println("e = " + e.getClass().getName());
//            ++errorCount;
//            System.out.println("You are stupied: please enter a correct value format");
//            if (errorCount <= 3) {
//                read2();
//            } else {
//                throw new NumberFormatException("You are fully stupied");
//            }
//        }
//
//        if (i != null) {
//            System.out.println("i = " + i);
//        }
//    }

    private static void read1()  {

        read2();
    }

    public static void main(String[] args) {
        try {
            System.exit(1);
            int i = 10 / 0;
            System.out.println(" 1 ");
        } catch (Exception e) {
            System.out.println(" 2 ");
        } finally {
            System.out.println(" 3 ");
        }

//        read1();



//        List<Planet> planets = new ArrayList<>();
//        planets.add(new Mars());
//        planets.add(new Saturn());
//        for (int i = 0; i < planets.size(); i++) {
//            System.out.println("planet"
//                    + planets.get(i).getClass().getName()
//                    + " position = "
//                    + planets.get(i).position());
//        }

//        Mars mars1 = new Mars();
//        Mars mars1 = null;
//        try {
//            mars1.position();
//        } catch (NullPointerException e) {
//            System.out.println("e = " + e.getMessage());
//        }
//
//        Course course = new Course();
//        Group group = course.getGroup();
//        if (group != null) {
//            Student student = group.getStudent();
//            if (student != null) {
//                System.out.println("student = " + student.getName());
//            } else {
//                student = new Student();
//            }
//        }
//
//        group
//                .getStudentOptional()
//                .ifPresent(student -> student.getNameOptional()
//                        .ifPresent(s -> System.out.println(s)));
//
//
//        if (group.getStudentOptional().isPresent()) {
//
//        }
//
//        if (group.getStudent() != null) {
//
//        }



//        System.out.println("course = " + course.getGroup().getStudent().getName());
//        mars1.skyNlo();
//
//        Planet mars2 = new Mars();
//        mars2.position();
//
//        Planet saturn = new Saturn();
//
//        Singleton singleton = Singleton.getInstance();
//        Singleton singleton1 = Singleton.getInstance();
//
//        singleton.setI(10);
//        System.out.println("singleton1 = " + singleton1.getI());


//        System.out.println("PlanetEnum.MARS = " + PlanetEnum.valueOf("MARS"));
//        System.out.println("PlanetEnum.MARS = " + PlanetEnum.MARS.name());
//        for (PlanetEnum value : PlanetEnum.values()) {
//            System.out.println("value = " + value.name());
//            System.out.println("value = " + value.ordinal());
//            System.out.println("value = " + value.getIndex());
//            System.out.println("value = " + value.getPe());
//        }
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
