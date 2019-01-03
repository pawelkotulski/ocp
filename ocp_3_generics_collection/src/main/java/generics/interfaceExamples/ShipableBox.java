package generics.interfaceExamples;

//Interface have same generic type as class
public class ShipableBox <T> implements Shippable<T> {

    @Override
    public void send(T item) {

    }
}
