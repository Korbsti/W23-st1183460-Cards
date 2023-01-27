package me.korbsti.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class CardViewController implements Initializable {

    @FXML
    private Label cardLabel;

    @FXML
    private ImageView imageView;

    private DeckOfCards deck;

    @FXML
    public void dealNextCard() {
        Card card = deck.dealTopCard();
        cardLabel.setText(card.toString());
        imageView.setImage(card.getImage());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deck = new DeckOfCards();
        deck.shuffle();
        dealNextCard();


    }
}
