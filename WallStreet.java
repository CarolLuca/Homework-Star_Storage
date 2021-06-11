import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class WallStreet {
    static Trader raoul = new Trader("Raoul", "Cambridge");

    static Trader mario = new Trader("Mario", "Milan");

    static Trader alan = new Trader("Alan", "Cambridge");

    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    /**
     * 1. Find all transactions in the year 2011 and sort them by value (small to high).
     * 2. What are all the unique cities where the traders work?
     * 3. Find all traders from Cambridge and sort them by name.
     * 4. Return a string of all traders’ names sorted alphabetically.
     * 5. Are any traders based in Milan?
     * 6. Print all transactions’ values from the traders living in Cambridge.
     * 7. What’s the highest value of all the transactions?
     * 8. Find the transaction with the smallest value.
     */
    public static void main(String[] args) {
        // 1.
        transactions.stream()
                .sorted((Transaction t1, Transaction t2) -> (t1.getValue() - t2.getValue()))
                .forEach(System.out::println);

        // 2.
        List<Trader> traders = List.of(raoul, brian, alan, mario);
        traders.stream()
                .map((Trader t) -> t.getCity())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // 3.
        traders.stream()
                .filter((Trader t) -> t.getCity().equals("Cambridge"))
                .sorted((Trader t1, Trader t2) -> (t1.getName().compareTo(t2.getName())))
                .forEach((Trader t) -> System.out.println(t.getName()));

        // 4.
        traders.stream()
                .map((Trader t) -> t.getName())
                .sorted()
                .forEach(System.out::println);

        // 5.
        Stream<Trader> sTraders = traders.stream();
        boolean answer = sTraders.anyMatch((Trader t) -> t.getCity().equals("Milan"));

        // 6.
        transactions.stream()
                .filter((Transaction t) -> t.getTrader().getCity().equals("Cambridge"))
                .forEach((Transaction t) -> System.out.println(t.getTrader().getName() + " " + t.getValue()));

        // 7.
        transactions.stream()
                .sorted((Transaction t1, Transaction t2) -> t2.getValue() - t1.getValue())
                .limit(1)
                .forEach((Transaction t) -> System.out.println(t.getValue()));

        // 8.
        transactions.stream()
                .sorted((Transaction t1, Transaction t2) -> t1.getValue() - t2.getValue())
                .limit(1)
                .forEach((Transaction t) -> System.out.println(t.getTrader().getName() + " "
                        + t.getValue() + " " + t.getYear()));
        
    }
}