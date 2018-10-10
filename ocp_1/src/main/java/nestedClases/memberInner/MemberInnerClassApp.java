package nestedClases.memberInner;

public class MemberInnerClassApp {

    public void test() {
        Outher outher = new Outher();
        Outher.Inner inner = outher.new Inner();
    }

    public class Outher {

        public class Inner {

        }
    }

}
