package cards;

import java.util.Random;


public class Deck {
   private Card[] deck;
   private int top; // Index of the next card to be drawn


   /**
    * Constructs a deck of 52 cards in default order.
    */
   public Deck() {
       deck = new Card[52];
       top = 0;
       int cardIndex = 0;


       // Create cards: 4 suits * 13 values
       for (int s = 0; s < 4; s++) {
           for (int v = 0; v < 13; v++) {
               deck[cardIndex] = new Card(s, v);
               cardIndex++;
           }
       }
   }


   /**
    * Randomizes the order of the deck using Fisher-Yates shuffle.
    */
   public void shuffle() {
       Random rand = new Random();
      
       // Fisher-Yates algorithm
       for (int i = deck.length - 1; i > 0; i--) {
           int j = rand.nextInt(i + 1); // Random index from 0 to i
          
           // Swap deck[i] and deck[j]
           Card temp = deck[i];
           deck[i] = deck[j];
           deck[j] = temp;
       }
       top = 0; // Reset top after shuffling, assuming shuffle means a new game starts
   }


   /**
    * Moves cards from the top of the deck (up to, but not including, index)
    * to the end of the deck. Works only on a complete deck (top == 0).
    * @param index The number of cards to cut from the top (0 to 51).
    */
   public void cut(int index) {
       // Must be a complete deck, and index must be valid
       if (top != 0 || index <= 0 || index >= 52) {
           return;
       }


       Card[] newDeck = new Card[52];
       int currentSize = 52;
       int newIdx = 0;


       // 1. Copy the "bottom" part (from index to end) to the start of newDeck
       // Elements from deck[index] to deck[51]
       for (int i = index; i < currentSize; i++) {
           newDeck[newIdx] = deck[i];
           newIdx++;
       }


       // 2. Copy the "top" part (from 0 up to index-1) to the end of newDeck
       // Elements from deck[0] to deck[index-1]
       for (int i = 0; i < index; i++) {
           newDeck[newIdx] = deck[i];
           newIdx++;
       }


       // 3. Update the deck reference
       deck = newDeck;
   }


   /**
    * Returns the card at the top of the deck and increments the top index.
    * Returns null if the deck is empty (top >= 52).
    * @return The next Card object, or null.
    */
   public Card draw() {
       // Bonus point fix: check if we are out of bounds
       if (top >= deck.length) {
           System.out.println("Deck is empty. Cannot draw.");
           return null;
       }
      
       Card card = deck[top];
       top++;
       return card;
   }


   /**
    * Prints string representations of the number of cards from the current draw position.
    * @param numCards The number of cards to print.
    */
   public void print(int numCards) {
       StringBuilder output = new StringBuilder();
       int cardsPrinted = 0;
      
       // Start printing from the current top index
       for (int i = top; i < deck.length && cardsPrinted < numCards; i++) {
           output.append(deck[i].toString());
           cardsPrinted++;
           if (cardsPrinted < numCards && i < deck.length - 1) {
               output.append(" ");
           }
       }
       System.out.println(output.toString());
   }
}
