package virtualMethodInvocation;

public class App {
    public static void main(String ... args) {
        Animal animal = new Lion();
        animal.printName(); // print ???
        animal.feed(); // print Lion feed - virtual method invocation
        animal.nestedFeed(); // print Lion feed - virtual method invocation


        Lion lion = new Lion();
        //because virtual method invocation don't use fields, only methods!
        lion.printName(); // print ???
        lion.feed();// print Lion feed - virtual method invocation
        lion.nestedFeed();// print Lion feed - virtual method invocation
    }

    abstract static class Animal {
        String name = "???";

        public void printName() {
            System.out.println(name);
        }

        public void feed() {
            System.out.println("???");
        }

        public void nestedFeed() {
            feed();
        }
    }

    static class Lion extends Animal {
        String name = "Leo";

        public void feed() {
            System.out.println("Lion feed");
        }
    }
}
