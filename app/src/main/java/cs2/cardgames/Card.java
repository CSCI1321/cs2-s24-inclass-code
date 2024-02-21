package cs2.cardgames;

public class Card {
	//Constants
	public static final int SPADE = 0;
	public static final int HEART = 1;
	public static final int DIAMOND = 2;
	public static final int CLUB = 3;
	private static final char[] suitSymbols = {'\u2660', '\u2665', '\u2666', '\u2663'}; 
  private static final String[] rankSymbols = {"ZERO","A","2","3","4","5","6","7","8","9","10","J","Q","K"};

	//Fields
	private int rank;
	private int suit;

	//Constructor
	public Card(int r, int s) {
		this.rank = r;
		this.suit = s;
	}

	//Methods
	public String toString() {
		return Card.rankSymbols[this.rank] + Card.suitSymbols[this.suit];
	}
	public boolean isFaceCard() {
		return this.rank > 10;
	}
	public int getValue() {
		if(this.isFaceCard()) return 10;
		else return this.rank;
	}
  public int getRank() {
    return this.rank;
  }

	public int compareTo(Card other) {
		if(this.rank < other.rank) return -1;
		else if(this.rank > other.rank) return 1;
		else return 0;
	}

	//Main tester
	public static void main(String[] args) {
		Card c = new Card(1, Card.SPADE);
		System.out.println(c.toString());
		Card d = new Card(12, Card.DIAMOND);
		Card f = new Card(4, Card.HEART);
		System.out.println(d.toString() + " -- " + f);
		System.out.println(c.isFaceCard());
		System.out.println(d.isFaceCard());
		System.out.println(c.getValue());
		System.out.println(d.getValue());

	}

}



