package exercise2;

public class Ellipsis extends Geometry2D{
    public double radiusMax;
    public double radiusMin;

    public Ellipsis(double radiusMax, double radiusMin) {
        this.radiusMax = radiusMax;
        this.radiusMin = radiusMin;
    }

    public double perimeter(){
        double res = (Math.pow(radiusMax, 2) + Math.pow(radiusMin, 2)) / 2;
        return 2 * Math.PI * Math.sqrt(res);
    }
    public double area(){
        return Math.PI * (radiusMax * radiusMin);
    }

    @Override
    public String toString() {
        return "Ellipsis{" +
                "radiusMax=" + radiusMax +
                ", radiusMin=" + radiusMin +
                '}';
    }

    public double getRadiusMax() {
        return radiusMax;
    }

    public void setRadiusMax(double radiusMax) {
        this.radiusMax = radiusMax;
    }

    public double getRadiusMin() {
        return radiusMin;
    }

    public void setRadiusMin(double radiusMin) {
        this.radiusMin = radiusMin;
    }
}
