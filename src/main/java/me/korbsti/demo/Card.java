package me.korbsti.demo;

import java.util.Arrays;
import java.util.List;

public class Card {


    private String faceName;
    private String suit;

    /**
     * Constructor
     * This is the construcotr, it eill create a new Card object in system memory, It will validate the suit and facename are found in
     * standard deck of cards.
     * @param faceName "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"
     * @param suit "hearts", "diamonds", "spades", "clubs"
     */
    public Card(String faceName, String suit) {
        setSuit(suit);
        setFaceName(faceName);
    }


    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();

        List<String> validFaceNames = Arrays.asList("ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king");

        if(faceName.charAt(faceName.length()) != 's'){
            faceName += "s";
        }

        if(validFaceNames.contains(faceName)) {
            this.faceName = faceName;
        } else {
            throw new IllegalArgumentException("Invalid face ");
        }

    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();

        if(suit.charAt(suit.length()) != 's'){
            suit += "s";
        }

        List<String> validSuits = Arrays.asList("hearts", "diamonds", "spades", "clubs");

        if(validSuits.contains(suit)) {
            this.suit = suit;
        } else {
            throw new IllegalArgumentException("Invalid suit");
        }

        this.suit = suit;
    }





    @Override
    public String toString() {
        return "Card{" +
                "faceName='" + faceName + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}