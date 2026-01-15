package coe318.lab5;

import java.util.ArrayList;

public class CardPile {

    private ArrayList<Card> cards = new ArrayList<Card>();

    public CardPile() {
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public Card removeRandom() {
        int num = (int)(Math.random()*this.cards.size());
        return (this.cards.remove(num));
    }

    @Override
    public String toString() {
        String cardList = "\n";
        for (Card card : this.cards){
            cardList += card.toString() + "\n";
        }
        return cardList;
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }
    public static void main(String[] args) {
        CardPile p = new CardPile();
        p.add(new Card(2, 1, true));
        p.add(new Card(3, 2, true));
        p.add(new Card(4, 3, false));
        p.add(new Card(14, 1, true));
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("");
        CardPile deck = new CardPile();
        for(int i = 2; i < 15; i++) {
            for(int j = 0; j < 4; j++) {
                deck.add(new Card(i, j, true));
            }
        }
        for (int i = 0; i < 52; i++) {
            System.out.println((i+1) + ": " + deck.removeRandom());

        }
    }
}
