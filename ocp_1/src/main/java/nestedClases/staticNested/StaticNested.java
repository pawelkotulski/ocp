package nestedClases.staticNested;

public class StaticNested {
    static class InnerStatic {
        private int counter =  12;
    }

    public void tedtNested() {
        InnerStatic innerStatic = new InnerStatic();
        System.out.println("Private field from static nested class: " + innerStatic.counter) ;
    }
}
