package me.korbsti.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private ArrayList<Card> deck;


    public DeckOfCards() {
        deck = new ArrayList<Card>();
        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getFaceNames();

        for(int i = 0; i < suits.size(); i++) {
            for(int j = 0; j < faceNames.size(); j++) {
                deck.add(new Card(faceNames.get(j), suits.get(i)));
            }
        }
    }


    public Card dealTopCard() {
        if(deck.size() > 0) {
            return deck.remove(0);
        }
        return null;
    }


    @Override
    public String toString() {
        String output = "DeckOfCards{";
        for (int i = 0; i < deck.size(); i++) {
            output += deck.get(i).toString() + ", ";
        }
        output += "}";
        return output;
    }


    public void shuffle(){
        Collections.shuffle(deck);
    }
    public int getNumOfCards() {
        return deck.size();
    }

}
