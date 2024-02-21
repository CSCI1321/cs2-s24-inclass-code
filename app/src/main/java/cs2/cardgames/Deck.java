package cs2.cardgames;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	//Fields
	private ArrayList<Card> cards;

	//Constructor
  /* This no-argument constructor creates an empty deck.
   */
	public Deck() {
		cards = new ArrayList<Card>();
	}

	//Factories
  /* This factory method creates a standard 52-card deck.
   * It can be invoked by calling Deck.standardDeck()
   */
	public static Deck standardDeck() {
		Deck result = new Deck();
		for(int s=0; s<=3; s++) { //Loop over all suits
			for(int r=1; r<=13; r++) { //Loop over all ranks
				result.cards.add(new Card(r, s)); //Create cards and add them to the deck
			}
		}
		return result;
	}

	//Methods
	public String toString() {
		String result = "[";
		for(int i=0; i<cards.size(); i++) {
			result += cards.get(i);
			if(i<cards.size()-1) result += ",";
		}
		result += "]";
		return result;
	}

  public void shuffle() {
    Collections.shuffle(cards); //The Collections class has a static shuffle method
  }

  public void add(Card c) {
    cards.add(c);
  }
  public Card getCard(int i) {
    return cards.get(i);
  }
  public Card deal() {
    return cards.remove(0);
  }
  public int size() {
    return cards.size();
  }

	//Main tester
	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.println(d);
		Deck std = Deck.standardDeck();
		System.out.println(std);
    std.shuffle();
    System.out.println(std);
	}

}



