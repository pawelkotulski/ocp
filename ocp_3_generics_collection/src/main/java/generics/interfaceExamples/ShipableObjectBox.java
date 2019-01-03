package generics.interfaceExamples;

//interface have no generic type, implemented method must have Object type as parameter
public class ShipableObjectBox implements Shippable {

    @Override
    public void send(Object item) {

    }
}
