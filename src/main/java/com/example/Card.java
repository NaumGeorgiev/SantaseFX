package com.example;

import java.util.ArrayList;

enum Rank {
    NINE,
    JACK,
    QUEEN,
    KING,
    TEN,
    ACE
}

enum Suit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES
}

public class Card {
    public Rank rank;
    public Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static ArrayList<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        Suit[] currentSuit = { Suit.CLUBS, Suit.DIAMONDS, Suit.HEARTS, Suit.SPADES };
        Rank[] currentRank = { Rank.NINE, Rank.JACK, Rank.QUEEN, Rank.KING, Rank.TEN, Rank.ACE };
        for (int i = 0; i < currentSuit.length; i++) {
            for (int j = 0; j < currentRank.length; j++) {
                deck.add(new Card(currentRank[j], currentSuit[i]));
            }
        }
        return deck;

    }

    public int getPoints() {
        switch (this.rank) {
            case NINE:
                return 0;
            case JACK:
                return 2;
            case QUEEN:
                return 3;
            case KING:
                return 4;
            case TEN:
                return 10;
            default:
                return 11;
        }
    }

    private static String toString(Rank rank) {
        switch (rank) {
            case NINE:
                return "NINE";
            case JACK:
                return "JACK";
            case QUEEN:
                return "QUEEN";
            case KING:
                return "KING";
            case TEN:
                return "TEN";
            default:
                return "ACE";
        }
    }

    private static String toString(Suit suit) {
        switch (suit) {
            case CLUBS:
                return "CLUBS";
            case DIAMONDS:
                return "DIAMONS";
            case HEARTS:
                return "HEARTS";
            default:
                return "SPADES";
        }
    }

    public String toString() {
        return toString(this.rank)+" "+toString(this.suit);
    }

    // public boolean isStronger(Card opponentCard){
    // if()
    // }
    public static void main(String[] args) {
        ArrayList<Card> deck = createDeck();

    }
}
