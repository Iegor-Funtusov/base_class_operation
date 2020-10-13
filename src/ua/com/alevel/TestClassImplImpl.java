package ua.com.alevel;

import ua.com.alevel.a.InterfaceTestImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Iehor Funtusov, created 13/10/2020 - 9:13 PM
 */
public class TestClassImplImpl extends TestClassImpl {
    @Override
    public void testNotFinal() {

    }

    public TestClass getCurrentTestClass() {
        return new TestClass() {
            @Override
            public void testNotFinal() {

            }
        };
    }

    public InterfaceTest getInterfaceTest() {
        return new InterfaceTest() {
            @Override
            public void test() {

            }
        };
//        return impl;
//        InterfaceTestImpl impl = new InterfaceTestImpl();
//        return impl;

//        return new InterfaceTestImpl();
    }

    public Runnable start() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        runnable.run();
        return null;
    }

    public List<Integer>  sort(Integer[] ints) {
        List<Integer> integers = Arrays.asList(ints);
        return integers
                .stream()
                .distinct()
                .sorted()
                .filter(integer -> integer % 2 == 0)
                .filter(integer -> integer % 5 == 0)
                .filter(integer -> integer >= 10)
                .collect(Collectors.toList());
    }
}
