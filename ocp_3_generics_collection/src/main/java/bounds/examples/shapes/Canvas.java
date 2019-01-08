package bounds.examples.shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

    private List<Shape> shapes = new ArrayList<>();

    public void draw(Shape s) {
        s.draw(this);
    }

    public void drawAll(List<? extends Shape> shapes) {
        for (Shape s : shapes) {
            s.draw(this);
        }
    }

    public void addSomethingToListOfShapes(List<? super Shape> shapes) {
        shapes.add(new Rectangle());
        shapes.add(new Circle());
    }

    public void incorrectAddSomethingToListOfShapes(List<? extends Shape> shapes) {
        // Compile-time error - upper bound don't allow to run methods
        //shapes.add(new Rectangle());
    }

    public void drawAllOnlyShape(List<Shape> shapes) {
        for (Shape s : shapes) {
            s.draw(this);
        }
    }


}
