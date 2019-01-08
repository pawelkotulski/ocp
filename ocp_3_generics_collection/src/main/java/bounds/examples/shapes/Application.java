package bounds.examples.shapes;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String [] a) {
        List<Circle> circleList = new ArrayList<>();
        List<Rectangle> rectangles = new ArrayList<>();
        List<Shape> shapes = new ArrayList<>();
        List<SmoothShape> smoothShapes = new ArrayList<>();


        Canvas canvas = new Canvas();

        //this doesn't compile, argument must be only Shape list
        //canvas.drawAllOnlyShape(circleList);
        //canvas.drawAllOnlyShape(circleList);

        //method use upper bound <? extends Shape> which means that list of any Shape and any extend shape object is ok
        canvas.drawAll(circleList);
        canvas.drawAll(rectangles);

        //will not compile, it must be list of shapes or something that inherit from shape
//        canvas.addSomethingToListOfShapes(circleList);
//        canvas.addSomethingToListOfShapes(rectangles);
        canvas.addSomethingToListOfShapes(shapes);
    }
}
