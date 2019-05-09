package exercise2;

public class Square extends Rectangle {
    public double width;

    public Square(double width) {
        super(width, width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
