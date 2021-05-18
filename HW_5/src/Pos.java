import java.math.BigDecimal;
import java.util.ArrayList;

public class Pos {
    private ArrayList<BankAccount> bankAccounts;

    public void addKnownBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public void pay(BigDecimal amount, BankAccount bankAccount) {
        bankAccount.withDraw(amount);
    }

    public void pay(BigDecimal amount, Card card) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.findCardNumber(card.getCardNumber()) == true) {
                pay(amount, bankAccount);
                return;
            }
        }
        System.out.println("############################");
        System.out.println("The bank account was not recognised");
        System.out.println("############################");
    }
}
