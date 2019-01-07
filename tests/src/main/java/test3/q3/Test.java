package test3.q3;

class Point {
    private int x;
    private int y;

    Point(){
        //doesn't compile, constructor should be called by 'this' keyword
        //Point(10, 20);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + x + ", " + y + "}";
    }
}

public class Test {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p);
    }
}
