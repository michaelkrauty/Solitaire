package me.michaelkrauty.Solitaire;

/**
 * Created on 11/30/2014.
 *
 * @author michaelkrauty
 */
public class Card {

	private final Suit suit;
	private final Type type;
	private boolean faceUp;

	public Card(Suit suit, Type type, boolean faceUp) {
		this.suit = suit;
		this.type = type;
		this.faceUp = faceUp;
	}

	public boolean isFaceUp() {
		return this.faceUp;
	}

	public Card setFaceUp(boolean faceUp) {
		this.faceUp = faceUp;
		return this;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public Type getType() {
		return this.type;
	}

	public enum Suit {
		HEARTS,
		DIAMONDS,
		CLUBS,
		SPADES
	}

	public enum Type {
		KING,
		QUEEN,
		JACK,
		ACE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
	}
}
