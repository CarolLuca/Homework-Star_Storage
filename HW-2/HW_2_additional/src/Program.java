import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Burger myBurger = new Burger("Chicken burger", "White seasame bread");
        myBurger.addAdditions(true, true, false, false);
        System.out.println(myBurger.calculatePrice());
        myBurger.additionalPrice();
        System.out.println("##############");

        HealthyBurger newBurger = new HealthyBurger();
        newBurger.addAdditions(true, true, false, true, false, true);
        System.out.println(newBurger.calculatePrice());
        newBurger.additionalPrice();
        System.out.println("##############");

        DeluxeBurger lastBurger = new DeluxeBurger();
        lastBurger.addAdditions(false, true);
        System.out.println(lastBurger.calculatePrice());
        lastBurger.additionalPrice();
    }

}