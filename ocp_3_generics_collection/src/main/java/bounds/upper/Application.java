package bounds.upper;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String [] a) {
        List<Circle> circleList = new ArrayList<>();
        List<Rectangle> rectangles = new ArrayList<>();


        Canvas canvas = new Canvas();

        //this doesn't compile, argument must be only Shape list
        //canvas.drawAllOnlyShape(circleList);
        //canvas.drawAllOnlyShape(circleList);

        //method use upper bound <? extends Shape> which means that list of any Shape and any extend shape object is ok
        canvas.drawAll(circleList);
        canvas.drawAll(rectangles);
    }
}
