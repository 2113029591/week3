/**
 * 3.24 挑一张牌
 */
public class example8 {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King"};
        int cardNumber = (int)(Math.random() * 52);
        String suit = suits[cardNumber / 13];
        String rank = ranks[cardNumber % 13];
        System.out.println("Card number " + (cardNumber + 1) + " : "+ rank + " of " + suit);
    }
}
