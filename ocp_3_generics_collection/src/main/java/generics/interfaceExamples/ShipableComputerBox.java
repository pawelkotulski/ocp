package generics.interfaceExamples;

//interface have exact class generic type
public class ShipableComputerBox implements Shippable<Computer> {

    @Override
    public void send(Computer item) {

    }
}
