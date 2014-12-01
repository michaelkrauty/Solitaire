package me.michaelkrauty.Solitaire;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created on 12/1/2014.
 *
 * @author michaelkrauty
 */
public class Stack {

	private final ArrayList<Card> cards = new ArrayList<Card>();

	public Stack(Deck deck, int cards) {
		this.cards.add(deck.getACardThatHasNotBeenGottenBefore().setFaceUp(true));
		if (cards > 1) {
			for (int i = 0; i < cards - 1; i++) {
				this.cards.add(deck.getACardThatHasNotBeenGottenBefore().setFaceUp(false));
			}
		}
	}

	public Stack(Deck deck) {
		this(deck, 0);
	}

	public Stack() {

	}

	public Card getTopCard() {
		return cards.get(0);
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

	public boolean isEmpty() {
		return cards.isEmpty();
	}
}
