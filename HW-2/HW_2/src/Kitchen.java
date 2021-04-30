public class Kitchen {
    private double area;
    private boolean table;
    private boolean fridge;

    public Kitchen(double area, boolean table, boolean fridge) {
        this.area = area;
        this.table = table;
        this.fridge = fridge;
    }

    public Kitchen() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isTable() {
        return table;
    }

    public void setTable(boolean table) {
        this.table = table;
    }

    public boolean isFridge() {
        return fridge;
    }

    public void setFridge(boolean fridge) {
        this.fridge = fridge;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "area=" + area +
                ", table=" + table +
                ", fridge=" + fridge +
                '}';
    }
}
