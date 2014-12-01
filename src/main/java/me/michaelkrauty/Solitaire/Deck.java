package me.michaelkrauty.Solitaire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created on 11/30/2014.
 *
 * @author michaelkrauty
 */
public class Deck {

	private final ArrayList<Card> cards = new ArrayList<Card>();
	int index = 0;

	public Deck(boolean shuffle) {
		for (Card.Suit suit : Card.Suit.values()) {
			for (Card.Type type : Card.Type.values()) {
				cards.add(new Card(suit, type, false));
			}
		}
		if (shuffle)
			shuffle();
	}

	public Deck() {
		this(false);
	}

	public Card getCard(int place) {
		return cards.get(place);
	}

	public Card getRandomCard() {
		return cards.get(new Random().nextInt(cards.size()));
	}

	public Card[] getCards() {
		return cards.toArray(new Card[cards.size()]);
	}

	public void shuffle() {
		Collections.shuffle(cards, new Random(System.nanoTime()));
	}

	public Card getNextCard() {
		index++;
		if (index < cards.size())
			return cards.get(index);
		else
			return null;
	}
}
