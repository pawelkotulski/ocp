package problems.deadlock;

import java.util.LinkedList;

class WaterDistributor {

    private LinkedList<Water> waters = new LinkedList<>();

    {
        waters.add(new Water());
        waters.add(new Water());
        waters.add(new Water());
        waters.add(new Water());
        waters.add(new Water());
    }


    public synchronized Water getWater() {
        System.out.println("Water Distributor Getting water");
        return waters.poll();
    }
}
