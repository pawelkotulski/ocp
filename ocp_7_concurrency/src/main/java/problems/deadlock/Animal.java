package problems.deadlock;

public class Animal {

    public void eatAndDrink(Distributor distributor) {
        System.out.println("Animal try to drinkAndEat" + Thread.currentThread().getName());
        distributor.eatAndDrink();
        System.out.println("Animal drinkAndEat end" + Thread.currentThread().getName());
    }
}
