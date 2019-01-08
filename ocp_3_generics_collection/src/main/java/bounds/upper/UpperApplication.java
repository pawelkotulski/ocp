package bounds.upper;

import java.util.ArrayList;
import java.util.List;

public class UpperApplication {

    static class A {
        @Override
        public String toString() {
            return "A";
        }
    }

    static class B extends A {
        @Override
        public String toString() {
            return "B";
        }
    }

    static class C extends B {
        @Override
        public String toString() {
            return "C";
        }
    }

    static class D extends C {
        @Override
        public String toString() {
            return "D";
        }
    }

    public static void main(String [] a) {
        List<A> listA = new ArrayList<>();
        listA.add(new A());
        //test(listA);

        List<B> listB = new ArrayList<>();
        listB.add(new B());
        //test(listB);

        List<C> listC = new ArrayList<>();
        listC.add(new C());
        test(listC);

        List<D> listD = new ArrayList<>();
        listD.add(new D());
        test(listD);
    }


    static void test(List<? extends C> elements) {
        //will not compile, upper bound are immutable
//        elements.add(new A());
//        elements.add(new B());
//        elements.add(new C());
//        elements.add(new D());

        System.out.println("List:");
        System.out.println(elements);

        //lower bounds will return specific type of object
        C c = elements.get(0);

        System.out.println("First element:");
        System.out.println(c);
    }
}
