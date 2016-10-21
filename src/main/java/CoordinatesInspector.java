import java.awt.geom.Point2D;
import java.text.DecimalFormat;

/**
 * 6 kyu: Cartesian coordinates from degree angle
 * https://www.codewars.com/kata/cartesian-coordinates-from-degree-angle/train/java
 */
public class CoordinatesInspector {
    public Point2D coordinates(Double degrees, Double radius) {
        double radians = Math.toRadians(degrees);
        double x = Double.valueOf(new DecimalFormat("#.##########").format(Math.cos(radians) * radius));
        double y = Double.valueOf(new DecimalFormat("#.##########").format(Math.sin(radians) * radius));
        return new Point2D.Double(x, y);
    }
}
