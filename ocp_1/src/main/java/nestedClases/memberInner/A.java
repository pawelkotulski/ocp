package nestedClases.memberInner;

public class A {
    private int x = 1;

    class B {
        private int x = 2;

        class C {
            private int x = 3;

            public void printAll() {
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(B.this.x);
                System.out.println(A.this.x);
            }
        }
    }


    public static void main(String... args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.printAll();
    }

}
