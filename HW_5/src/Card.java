import java.util.Date;

public class Card {
    private Date expirationDate;
    private String ownerName;
    private String cardNumber;

    public Card(Date expirationDate, String ownerName, String cardNumber) {
        this.expirationDate = expirationDate;
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
    }

    public String getCardNumber(){
        return cardNumber;
    }
}
