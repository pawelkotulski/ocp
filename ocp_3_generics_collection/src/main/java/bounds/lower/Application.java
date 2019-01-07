package bounds.lower;

import java.util.List;

public class Application {

    class A {

    }

    class B extends A {

    }

    class C extends B {

    }

    class Test {
        //will not compile, B is declared as generic type not class and we cannot create new instance B (new B())
//        <B extends A> B method(List<B> list) {
//            return new B();
//        }

        //will not compile, mixed method specific type with wildcard (List<X super B>)
//        <X> void someMethod(List<X super B> list) {
//
//        }

        <Z extends C> B method(List<Z> list) {
            return new B();
        }
    }

    public static void main(String [] a ) {

    }
}
