package problems.deadlock;


import java.util.LinkedList;

class FoodDistributor {

    private LinkedList<Food> foods = new LinkedList<Food>();

    {
        foods.add(new Food());
        foods.add(new Food());
        foods.add(new Food());
        foods.add(new Food());
        foods.add(new Food());
    }

    public synchronized Food getFood() {
        System.out.println("Food Distributor Getting food");
        return foods.poll();
    }
}