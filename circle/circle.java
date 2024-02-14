public class circle {
private double radius;
public static final double pi = 3.14;

public circle (double radiusIn) {
        radius = radiusIn;
}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radiusIn) {
        radius = radiusIn;
    }

public double calculateArea() {
        return pi * Math.pow(radius, 2);
}

public double calculateCircumference() {
        return 2 * pi * radius;
}
}
