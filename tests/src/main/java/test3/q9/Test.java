package test3.q9;

class Message {
    public void printMessage() {
        System.out.println("Hello!");
    }
}

public class Test {
    public static void main(String[] args) {
        Message msg = new Message() {
            //annotation will not compile, method have different name
            //@Override
            public void PrintMessage() {
                System.out.println("HELLO!");
            }
        };
        msg.printMessage();
    }
}
