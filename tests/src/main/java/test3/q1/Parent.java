package test3.q1;

class Parent {
    public void m() {
        System.out.println("Parent");
    }


}

//doesn't compile, public class should be in separate file, it is not inner class

//public abstract class Child extends Parent { //Line 9
//    public static void main(String [] args) { //Line 10
//        new Parent().m(); //Line 11
//    }
//}
