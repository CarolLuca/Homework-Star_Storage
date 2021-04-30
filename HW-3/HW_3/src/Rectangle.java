public class Rectangle { // am inversat length-ul cu width-ul
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = Math.max(length, 0.);
        this.width = Math.max(width, 0.);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = Math.max(length, 0.);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, 0.);
    }

    public double getArea() {
        return length * width;
    }
}
