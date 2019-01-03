package generics.staticMethod;

public class Box {

    public static <T> T getItem(T parameter) {
        return parameter;
    }

    public static <T> BoxItem<T> getBox(T parameter) {
        return new BoxItem<>();
    }

    public static <T> BoxItem getBoxObj(T parameter) {
        return new BoxItem<>();
    }

    static class BoxItem <S>{

    }
}

