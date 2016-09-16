package com.peter.codewarstest;

import com.peter.codewars.CoordinatesInspector;
import org.junit.Test;

import java.awt.geom.Point2D;

import static org.junit.Assert.assertEquals;

public class CoordinatesInspectorTest {
    @Test public void test_1() {
        Point2D result = new CoordinatesInspector().coordinates(45.0,1.0);
        assertEquals("Incorrect coordinates", new Point2D.Double(0.7071067812, 0.7071067812), result);
        Point2D result2 = new CoordinatesInspector().coordinates(90.0,1.0);
        assertEquals("Incorrect coordinates", new Point2D.Double(0.0, 1.0), result2);
    }
}
