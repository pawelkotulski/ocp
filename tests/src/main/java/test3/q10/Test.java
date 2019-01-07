package test3.q10;

interface Sellable {
    double getPrice();
}

public class Test {
    private static void printPrice(Sellable sellable) {
        System.out.println(sellable.getPrice());
    }

    public static void main(String[] args) {
        /*INSERT*/
        printPrice(null);
        printPrice(new Sellable() {
            @Override
            public double getPrice() {
                return 12.4;
            }
        });
    }
}
