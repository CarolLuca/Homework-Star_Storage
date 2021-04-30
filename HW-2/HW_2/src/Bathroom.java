public class Bathroom {
    private double area;
    private boolean mirror;
    private boolean sink;

    public Bathroom(double area, boolean mirror, boolean sink) {
        this.area = area;
        this.mirror = mirror;
        this.sink = sink;
    }

    public Bathroom() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isMirror() {
        return mirror;
    }

    public void setMirror(boolean mirror) {
        this.mirror = mirror;
    }

    public boolean isSink() {
        return sink;
    }

    public void setSink(boolean sink) {
        this.sink = sink;
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "area=" + area +
                ", mirror=" + mirror +
                ", sink=" + sink +
                '}';
    }
}
