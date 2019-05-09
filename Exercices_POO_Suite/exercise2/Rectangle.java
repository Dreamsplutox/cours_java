package exercise2;

public class Rectangle extends Geometry2D{
    //public double surface;
    //public double perimeter;
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width) {
        this.width = width;
        this.height = width;
    }

    public double perimeter(){
        return 2 * (width + height);
    }

    public double area(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
