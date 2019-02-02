package problems.deadlock;

public class Person {


    public void drinkAndEat(Distributor distributor) {
        System.out.println("Person try to drinkAndEat" + Thread.currentThread().getName());
        distributor.drinkAndEat();
        System.out.println("Person drinkAndEat end" + Thread.currentThread().getName());
    }
}
