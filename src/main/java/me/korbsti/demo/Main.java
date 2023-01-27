package me.korbsti.demo;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        /*
        System.out.println(card1.toString());

        System.out.println(card1.getCardValue());*/
        ArrayList<Card> player1Hand = new ArrayList<Card>();
        ArrayList<Card> player2Hand = new ArrayList<Card>();
        ArrayList<Card> player3Hand = new ArrayList<Card>();
        ArrayList<Card> player4Hand = new ArrayList<Card>();

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        System.out.println(deck.toString());

        for(int i = 0; i < 5; i++) {
            player1Hand.add(deck.dealTopCard());
            player2Hand.add(deck.dealTopCard());
            player3Hand.add(deck.dealTopCard());
            player4Hand.add(deck.dealTopCard());
        }

        System.out.println("Player 1 hand: " + player1Hand.toString());
        System.out.println("Player 2 hand: " + player2Hand.toString());
        System.out.println("Player 3 hand: " + player3Hand.toString());
        System.out.println("Player 4 hand: " + player4Hand.toString());

        System.out.println("Cards left in deck: " + deck.getNumOfCards());

    }
}
