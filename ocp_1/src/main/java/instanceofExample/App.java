package instanceofExample;

public class App {
    public static void main(String ... args) {
        Animal animal = new Hippo();

        System.out.println(animal instanceof Animal); // true
        System.out.println(animal instanceof Hippo); // true
        System.out.println(animal instanceof Elephant); // false
        System.out.println(animal instanceof Mother); // false

        System.out.println(animal instanceof Object); // true

        Hippo nullHippo = null;
        System.out.println(nullHippo instanceof Object); // false
        //System.out.println(nullHippo instanceof Elephant); // doesn't compile - different types
        System.out.println(nullHippo instanceof Mother); // false


    }

    static class Animal{

    }

    static class Hippo extends Animal{

    }

    static class Elephant extends Animal{

    }

    static interface Mother{

    }
}
