package test3.q8;

class Outer {
    public static void sayHello() {}
    static {
        class Inner {
            //Which of the following options can replace /*INSERT*/ such that on executing TestOuter class, "HELLO" is printed in the output?

            /*INSERT*/

// Inner class cannot have static methods or fields
//            static {
//
//            }
            {
                System.out.println("HELLO");
            }


            Inner() {
                System.out.println("HELLO");
            }
        }
        new Inner();
    }
}

public class Test {
    public static void main(String[] args) {
        Outer.sayHello();
    }
}
