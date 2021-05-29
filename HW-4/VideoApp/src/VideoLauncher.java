import java.util.Scanner;

public class VideoLauncher {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        VideoStore videostore = new VideoStore();
        do {
            System.out.println("MAIN MENU \n");
            System.out.println("1. Add Videos:");
            System.out.println("2. Check Out Video:");
            System.out.println("3. Return Video:");
            System.out.println("4. Receive Rating:");
            System.out.println("5. List Inventory:");
            System.out.println("6. Exit:");
            System.out.print("Enter your choice(1..6): ");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the video you want to add: ");
                    videostore.addVideo(input.next());
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    videostore.doCheckout(input.next());
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return:");
                    videostore.doReturn(input.next());
                    ;
                    break;
                case 4:
                    System.out.println("Enter the name of the video you want to Rate: ");
                    videostore.receiveRating(input.next(), input.nextInt());
                    break;
                case 5:
                    videostore.listInventory();
                    break;
                case 6:
                    System.out.println("Thanks for using the application");
                    System.exit(0);
                    break;
            }
        }
        while (choice != 6);
        input.close();
    }
}   