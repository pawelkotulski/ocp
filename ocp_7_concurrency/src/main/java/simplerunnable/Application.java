package simplerunnable;

public class Application {

    public static void main(String [] args) {
        System.out.println("Main application thread name: " + Thread.currentThread().getName());

        runThreadFromConstructor();
        runThreadByExtendThreadClass();
    }

    private static void runThreadByExtendThreadClass() {
        new ThreadTask().start();
    }

    private static void runThreadFromConstructor() {
        Thread thread = new Thread(new Task());
        thread.start();
    }

    static class Task implements Runnable {
        public void run() {
            System.out.println("Task running with thread name: " + Thread.currentThread().getName());
        }
    }

    static class ThreadTask extends Thread {
        public void run() {
            System.out.println("ThreadTask running with thread name: " + Thread.currentThread().getName());
        }
    }
}
