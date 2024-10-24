package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.checkCard();
        System.out.println("-------------------");
        Card c = cd.draw();
        System.out.println(c);
        System.out.println("-------------------");
        Card c2 = cd.draw();
        cd.checkCard();

        while (true) {
            Card draw = cd.draw();
            if(draw == null) {
                break;
            }
            System.out.println(cd.draw());
        }
    }
}