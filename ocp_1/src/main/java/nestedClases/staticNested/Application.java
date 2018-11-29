package nestedClases.staticNested;

import nestedClases.staticNested.StaticNested.InnerStatic;

public class Application {
    public static void main(String[] a) {
        InnerStatic innerStatic = new InnerStatic(); //static nested class cane be instantieted without enclosing class instance
        //innerStatic.counter; - counter if private and is not accesible here
        StaticNested staticNested = new StaticNested();
        staticNested.tedtNested();
    }
}
