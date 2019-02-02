package executroservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(getRunnable());

        try {
            System.out.println("Await: " + Thread.currentThread().getName());
            executorService.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Terminated: " + Thread.currentThread().getName());
            System.out.println("shutdown executor: " + Thread.currentThread().getName());
            executorService.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     static Runnable getRunnable() {
        return new Runnable() {
            public void run() {
                try {
                    System.out.println("Running task in thread: " + Thread.currentThread().getName());
                    System.out.println("Wait: " + Thread.currentThread().getName());
                    Thread.sleep(3000);
                    System.out.println("End Running task: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
