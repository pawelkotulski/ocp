package bounds.upper;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

    private List<Shape> shapes = new ArrayList<>();

    public void draw(Shape s) {
        s.draw(this);
    }

    public void drawAll(List<? extends Shape> shapes) {
        for (Shape s: shapes) {
            s.draw(this);
        }
    }

    public void drawAllOnlyShape(List<Shape> shapes) {
        for (Shape s: shapes) {
            s.draw(this);
        }
    }

    public void addRectangle(List<? extends Shape> shapes) {
        // Compile-time error - upper bound don't allow to run methods
        //shapes.add(0, new Rectangle());
    }
}
