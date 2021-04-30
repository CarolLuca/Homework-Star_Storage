public class Livingroom {
    private double area;
    private boolean couch;
    private boolean television;

    public Livingroom(double area, boolean couch, boolean television) {
        this.area = area;
        this.couch = couch;
        this.television = television;
    }

    public Livingroom() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isCouch() {
        return couch;
    }

    public void setCouch(boolean couch) {
        this.couch = couch;
    }

    public boolean isTelevision() {
        return television;
    }

    public void setTelevision(boolean television) {
        this.television = television;
    }

    @Override
    public String toString() {
        return "Livingroom{" +
                "area=" + area +
                ", couch=" + couch +
                ", television=" + television +
                '}';
    }
}
