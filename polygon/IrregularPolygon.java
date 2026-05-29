package polygon;

import java.awt.Point;
import java.awt.geom.*; // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*; // for DrawingTool

public class IrregularPolygon {
    private ArrayList<Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();

    // constructor
    public IrregularPolygon() {}

    // public methods
    public void add(Point2D.Double aPoint)
    {
        // TODO: Add a point to the IrregularPolygon.
    }

    public double perimeter() {
        // TODO: Calculate the perimeter.
        double totalPerimeter = 0.0;
        int n = vertices.size();

        if (n < 3) return 0.0;

        for (int i = 0; i < n; i++) {
            Point2D.Double current = vertices.get(i);
            Point2D.Double next = vertices.get((i+1) % n);

            totalPerimeter += current.distance(next)
        }
    }   

    public double area() {
        // TODO: Calculate the area.
        Double sum = 0.0;
        int n = vertices.size();

        if (n < 3) return 0.0;

        for (int i = 0; i < n; i++) {
            Point2D.Double current = vertices.get(i);
            Point2D.Double next = vertices.get((i+1) % n);

            sum += (current.getX() * next.getY()) - (current.getY() * next.getX());
        }
        return Math.abs(sum) * 0.5;
    }

    public void draw()
    {
        // Wrap the DrawingTool in a try/catch to allow development without need for graphics.
        try {
            // TODO: Draw the polygon.
            // Documents: https://pavao.org/compsci/gpdraw/html/gpdraw/DrawingTool.html
            //DrawingTool myDrawingTool = new DrawingTool(new SketchPad(500, 500));
            //myDrawingTool.move(50, 50);
            if (vertices.size() > 0) {
                DrawingTool myDrawingTool = new DrawingTool(new SketchPad(500, 500));

                Point2D.Double first = vertices.get(0);
                myDrawingTool.up();
                myDrawingTool.move(first.getX(), first.getY());

                myDrawingTool.down();

                for (int i = 1; i < vertices.size(); i++ {
                    Point2D.Double current = vertices.get(i);
                    myDrawingTool.move(current.getX(), current.getY());
                }

                myDrawingTool.move(first.getX(), first.getY());
            }
        } catch (java.awt.HeadlessException e) {
            System.out.println("Exception: No graphics support available.");
        }
    }

}
