import java.util.Scanner;

public class Video {
    private String videoName;
    private boolean checkout;
    private int rating;
    private boolean Avail;

    public Video(String name) {
        videoName = name;
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        System.out.println("Video " + '"' + getName() + '"' + " checked out successfully.");
    }

    public void doReturn() {
        checkout = true;
        System.out.println("Video " + '"' + getName() + '"' + " returned successfully.");

    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}