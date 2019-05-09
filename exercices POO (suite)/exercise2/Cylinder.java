package exercise2;

public class Cylinder extends Geometry3D{
    public double radius;
    public double height;

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * 2 * radius * height;
    }

    public double volume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
