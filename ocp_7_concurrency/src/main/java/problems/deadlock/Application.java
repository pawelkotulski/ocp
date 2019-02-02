package problems.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Application {

    public static void main(String ... a) {
        WaterDistributor waterDistributor = new WaterDistributor();
        FoodDistributor foodDistributor = new FoodDistributor();

        Distributor distributor = new Distributor(waterDistributor, foodDistributor);

        Person person = new Person();
        Animal animal = new Animal();


        ExecutorService service = Executors.newFixedThreadPool(5);
        service.submit(() -> person.drinkAndEat(distributor));
        service.submit(() -> animal.eatAndDrink(distributor));

        service.shutdown();
    }




}
