/**
 * 6 kyu: Tank Truck
 * https://www.codewars.com/kata/55f3da49e83ca1ddae0000ad/train/java
 */
public class VolTank {
    public static int tankVol(int h, int d, int vt) {
        double radius = (double) d / 2;
        if (h == radius) {
            return vt / 2;
        }

        double deep = vt / (Math.PI * radius * radius);
        double height = h > radius ? radius - (d - h) : radius - h;
        double side = Math.sqrt(Math.pow(radius, 2) - Math.pow(height, 2));
        double theta = Math.toDegrees(Math.acos(height / radius));
        double remainVol = (360 - 2 * theta) / 360 * vt + side * height * deep;
        return (int) Math.floor(h > radius ? remainVol : vt - remainVol);
    }
}
