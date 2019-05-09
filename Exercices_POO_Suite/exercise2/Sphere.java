package exercise2;

public class Sphere extends Geometry3D{
    public double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double area(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double volume(){
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
