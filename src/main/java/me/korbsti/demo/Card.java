package me.korbsti.demo;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class Card {


    private String faceName;
    private String suit;

    private String colour;

    /**
     * Constructor
     * This is the construcotr, it eill create a new Card object in system memory, It will validate the suit and facename are found in
     * standard deck of cards.
     *
     * @param faceName "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"
     * @param suit     "hearts", "diamonds", "spades", "clubs"
     */
    public Card(String faceName, String suit) {
        setSuit(suit);
        setFaceName(faceName);
        setColor();
    }

    public static List<String> getValidSuits() {
        return Arrays.asList("hearts", "diamonds", "spades", "clubs");
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

        if (validFaceNames.contains(faceName)) {
            this.faceName = faceName;
        } else {
            throw new IllegalArgumentException("Invalid face ");
        }

    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();

        if (!suit.endsWith("s")) {
            suit += "s";
        }

        List<String> validSuits = Arrays.asList("hearts", "diamonds", "spades", "clubs");

        if (validSuits.contains(suit)) {
            this.suit = suit;
        } else {
            throw new IllegalArgumentException("Invalid suit");
        }

        this.suit = suit;
    }

    public String getColor() {
        if (suit.equals("hearts") || suit.equals("diamonds")) {
            return "red";
        } else {
            return "black";
        }
    }


    public void setColor() {
        if (suit.equals("hearts") || suit.equals("diamonds")) {
            this.colour = "red";
        } else {
            this.colour = "black";
        }
    }


    /**
     * This method will return a string representation of the card
     * index -> 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
     * faceName -> "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"
     * value -> 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
     */
    public int getCardValue() {
        int[] faceValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for (int i = 0; i < getFaceNames().size(); i++) {
            if (getFaceNames().get(i).equals(faceName)) {
                return faceValues[i];
            }
        }

        return -1;
    }

    public static List<String> getFaceNames() {
        return Arrays.asList("ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king");
    }

    @Override
    public String toString() {
        return "Card{" + "faceName='" + faceName + '\'' + ", suit='" + suit + '\'' + '}';
    }

    public Image getImage() {
        return new Image(Card.class.getResourceAsStream("images/" + faceName + "_of_" + suit + ".png"));
    }
}