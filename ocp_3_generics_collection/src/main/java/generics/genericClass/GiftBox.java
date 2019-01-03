package generics.genericClass;

import java.util.ArrayList;
import java.util.List;

public class GiftBox<T> {

    private List<T> items = new ArrayList<>();

    public T getElement(int index) {
        return items.get(index);
    }

    public void addElement(T element) {
        items.add(element);
    }

    public void packEachItem() {
        items.forEach(item -> System.out.println(item));
    }

    //ALL static methods when using generic must have defined this generic type this ex. <T>
    public static <T> void makeSmth(T param) {
    }

// this will not compile, there is no definition of generic type <T> after static keyword
//    public static void makeSmth(T param) {
//    }
}
