package exercise2;

public class Circle extends Ellipsis {
    public double radius_max;
    public double radius_min;

    public Circle(double radiusMax, double radiusMin) {
        super(radiusMax, radiusMin);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radiusMax=" + radiusMax +
                ", radiusMin=" + radiusMin +
                '}';
    }

    public double getRadius_max() {
        return radius_max;
    }

    public void setRadius_max(double radius_max) {
        this.radius_max = radius_max;
    }

    public double getRadius_min() {
        return radius_min;
    }

    public void setRadius_min(double radius_min) {
        this.radius_min = radius_min;
    }
}
