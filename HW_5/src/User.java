import java.util.ArrayList;

public class User {
    private ArrayList<Card> cards;
    private ArrayList<BankAccount> bankAccounts;

    public void addCard(Card card) {
        cards.add(card);
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }
}
