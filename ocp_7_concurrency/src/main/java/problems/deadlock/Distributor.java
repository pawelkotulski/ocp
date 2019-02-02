package problems.deadlock;

public class Distributor {

    private final WaterDistributor waterDistributor;
    private final FoodDistributor foodDistributor;

    public Distributor(WaterDistributor waterDistributor, FoodDistributor foodDistributor) {
        this.foodDistributor = foodDistributor;
        this.waterDistributor = waterDistributor;
    }

    public void eatAndDrink() {

        synchronized (waterDistributor)  {
            waterDistributor.getWater();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }

            System.out.println("try to get food distributor");
            synchronized (foodDistributor) {
                foodDistributor.getFood();
            }
        }
    }

    public void drinkAndEat() {
        synchronized (foodDistributor) {
            foodDistributor.getFood();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println("try to get water distributor");
            synchronized (waterDistributor) {
                waterDistributor.getWater();
            }

        }
    }
}


