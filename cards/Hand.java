package cards;
public class Hand {
    private Card[] cards;
    private int currentLength;
    public Hand(int maxCards) {
        cards = new Card[maxCards];
        currentLength = 0;
    }
    public void add(Card card) {
        if (currentLength < cards.length) {
            cards[currentLength] = card;
            currentLength++;
        }
 	}
    public int length() {
	    return currentLength;
    }
    public Card get(int index) {
        if (index >= 0 && index < currentLength) {
            return cards[index];
        }
        return null;
    }
    public Card remove(int index) {
        if (index >= 0 && index < currentLength) {
            Card removedCard = cards[index];
            System.arraycopy(cards, index+1, cards, index, currentLength-index-1); cards[currentLength-1] = null;
            currentLength--;
            return removedCard;
        }
        return null;
    }
    public String toString() {
        String[] cardStrings = new String[currentLength];
        for (int i = 0; i < currentLength; i++) {
            cardStrings[i] = cards[i].toString();
        }
        return String.join("", cardStrings);
    }
}
