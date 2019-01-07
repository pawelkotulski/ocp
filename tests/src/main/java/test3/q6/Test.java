package test3.q6;

class Outer {
    class Inner {
        public void m() {
            System.out.println("WELCOME!");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        //Insert statement here to print WELCOME

        Outer.Inner inner = new Outer().new Inner();

        Outer outer = new Outer();
        Outer.Inner inner2 = outer.new Inner();
    }
}
