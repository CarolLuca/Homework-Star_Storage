public class House {
    private Kitchen kitchen;
    private Bathroom bathroom;
    private Livingroom livingroom;

    public House(Kitchen kitchen, Bathroom bathroom, Livingroom livingroom) {
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.livingroom = livingroom;
    }

    public House() {
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public Livingroom getLivingroom() {
        return livingroom;
    }

    public void setLivingroom(Livingroom livingroom) {
        this.livingroom = livingroom;
    }

    @Override
    public String toString() {
        return "House{" +
                "kitchen=" + kitchen +
                ", bathroom=" + bathroom +
                ", livingroom=" + livingroom +
                '}';
    }
}
