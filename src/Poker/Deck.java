package Poker;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    static List<String> Unshuffled_Deck = new ArrayList<>();
    static List<String> Shuffled_Deck = new ArrayList<>();
    static boolean Full_House = true;
    static String CardToRemove;
    static int cardRemoveCounter = 0;


    public static void Unshuffled_Deck() {
        Unshuffled_Deck.add("Ace of Spades");
        Unshuffled_Deck.add("2 of Spades");
        Unshuffled_Deck.add("3 of Spades");
        Unshuffled_Deck.add("4 of Spades");
        Unshuffled_Deck.add("5 of Spades");
        Unshuffled_Deck.add("6 of Spades");
        Unshuffled_Deck.add("7 of Spades");
        Unshuffled_Deck.add("8 of Spades");
        Unshuffled_Deck.add("9 of Spades");
        Unshuffled_Deck.add("10 of Spades");
        Unshuffled_Deck.add("Jack of Spades");
        Unshuffled_Deck.add("Queen of Spades");
        Unshuffled_Deck.add("King of Spades");
        Unshuffled_Deck.add("Ace of Hearts");
        Unshuffled_Deck.add("2 of Hearts");
        Unshuffled_Deck.add("3 of Hearts");
        Unshuffled_Deck.add("4 of Hearts");
        Unshuffled_Deck.add("5 of Hearts");
        Unshuffled_Deck.add("6 of Hearts");
        Unshuffled_Deck.add("7 of Hearts");
        Unshuffled_Deck.add("8 of Hearts");
        Unshuffled_Deck.add("9 of Hearts");
        Unshuffled_Deck.add("10 of Hearts");
        Unshuffled_Deck.add("Jack of Hearts");
        Unshuffled_Deck.add("Queen of Hearts");
        Unshuffled_Deck.add("King of Hearts");
        Unshuffled_Deck.add("Ace of Diamonds");
        Unshuffled_Deck.add("2 of Diamonds");
        Unshuffled_Deck.add("3 of Diamonds");
        Unshuffled_Deck.add("4 of Diamonds");
        Unshuffled_Deck.add("5 of Diamonds");
        Unshuffled_Deck.add("6 of Diamonds");
        Unshuffled_Deck.add("7 of Diamonds");
        Unshuffled_Deck.add("8 of Diamonds");
        Unshuffled_Deck.add("9 of Diamonds");
        Unshuffled_Deck.add("10 of Diamonds");
        Unshuffled_Deck.add("Jack of Diamonds");
        Unshuffled_Deck.add("Queen of Diamonds");
        Unshuffled_Deck.add("King of Diamonds");
        Unshuffled_Deck.add("Ace of Clubs");
        Unshuffled_Deck.add("2 of Clubs");
        Unshuffled_Deck.add("3 of Clubs");
        Unshuffled_Deck.add("4 of Clubs");
        Unshuffled_Deck.add("5 of Clubs");
        Unshuffled_Deck.add("6 of Clubs");
        Unshuffled_Deck.add("7 of Clubs");
        Unshuffled_Deck.add("8 of Clubs");
        Unshuffled_Deck.add("9 of Clubs");
        Unshuffled_Deck.add("10 of Clubs");
        Unshuffled_Deck.add("Jack of Clubs");
        Unshuffled_Deck.add("Queen of Clubs");
        Unshuffled_Deck.add("King of Clubs");


    }

    public static void main(String[] args) {

        Unshuffled_Deck();
        for (int i = 0; i < 5; i++) {
            int Rand = new Random().nextInt(Unshuffled_Deck.size());
            Shuffled_Deck.add(Unshuffled_Deck.get(Rand));
            Unshuffled_Deck.remove(Rand);
        }
        Collections.sort(Shuffled_Deck);
        System.out.println(Shuffled_Deck);
        while (cardRemoveCounter < 2) {
            CardToRemove = JOptionPane.showInputDialog(null, "Enter the Number of the card you want to remove(Enter no to keep cards)", "Card Swap", JOptionPane.INFORMATION_MESSAGE);
            }
        int dropcard = JOptionPane.showOptionDialog(null, "Select Card to discard", "Poker",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                Shuffled_Deck.toArray(new String[0]), null);
        if (dropcard == 0)
        {
        }
            System.out.println(Shuffled_Deck);
            for (int k = 0; k < 5; k++) {
                if (!Shuffled_Deck.contains("Ace of Spades") || !Shuffled_Deck.contains("2 of Spades") || !Shuffled_Deck.contains("3 of Spades") || !Shuffled_Deck.contains("4 of Spades") || !Shuffled_Deck.contains("5 of Spades")) {
                    Full_House = false;
                }

            }
            System.out.println(Full_House);


        }


    }

