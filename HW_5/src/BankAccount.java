import java.math.BigDecimal;
import java.util.ArrayList;

public class BankAccount {
    private String iban;
    private BigDecimal balance;
    private ArrayList<String> attachedCardNumbers;

    public BankAccount(String iban) {
        this.iban = iban;
        balance = balance.ZERO;
        attachedCardNumbers.clear();
    }

    public void addMoney(BigDecimal amount) {
        System.out.println("############################");
        System.out.println("You added " + amount + "$ to your bank account");
        balance.add(amount);
        System.out.println("Current balance: " + balance);
        System.out.println("############################");
    }

    public void withDraw(BigDecimal amount) {
        System.out.println("############################");
        if (amount.compareTo(balance) > 0) {
            System.out.println("Could not withdraw " + amount + "$");
            System.out.println("Insufficient funds");
        } else {
            System.out.println("You withdraw " + amount + "$ from your bank account");
            balance.subtract(amount);
        }
        System.out.println("Current balance: " + balance + "$");
        System.out.println("############################");
    }

    public void attachCardNumber(String cardNumber) {
        attachedCardNumbers.add(cardNumber);
    }

    public boolean findCardNumber(String fCardNumber){
        for(String cardNumber:attachedCardNumbers){
            if(fCardNumber.equals(cardNumber)){
                return true;
            }
        }
        return false;
    }
}
