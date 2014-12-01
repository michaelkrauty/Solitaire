package me.michaelkrauty.Solitaire;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created on 11/30/2014.
 *
 * @author michaelkrauty
 */
public class Table {

	private final int cardSizeX = 125;
	private final int cardSizeY = 182;

	private final Deck deck = new Deck(true);
	private ArrayList<Card> drawPile = new ArrayList<Card>();
	private ArrayList<Card> faceUpPile = new ArrayList<Card>();
	private ArrayList<Stack> stacks = new ArrayList<Stack>();
	private Stack up1 = new Stack();
	private Stack up2 = new Stack();
	private Stack up3 = new Stack();
	private Stack up4 = new Stack();

	public Table() {

		for (int stack = 1; stack <= 7; stack++) {
			stacks.add(new Stack(deck, stack));
		}

		Card card;
		while ((card = deck.getACardThatHasNotBeenGottenBefore()) != null)
			drawPile.add(card);
	}

	public void draw(Game game, Graphics g) {
		Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
		Image img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");

		if (!drawPile.isEmpty())
			g.drawImage(img, 25, 25, cardSizeX, cardSizeY, game);
		else
			g.drawRect(25, 25, cardSizeX, cardSizeY);

		if (!faceUpPile.isEmpty())
			g.drawImage(img, 175, 25, cardSizeX, cardSizeY, game);
		else
			g.drawRect(175, 25, cardSizeX, cardSizeY);

		if (!up1.isEmpty()) {
			Card card = up1.getTopCard();
			img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
			g.drawImage(img, 475, 25, cardSizeX, cardSizeY, game);
		} else {
			g.drawRect(475, 25, cardSizeX, cardSizeY);
		}

		if (!up2.isEmpty()) {
			Card card = up2.getTopCard();
			img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
			g.drawImage(img, 625, 25, cardSizeX, cardSizeY, game);
		} else {
			g.drawRect(625, 25, cardSizeX, cardSizeY);
		}

		if (!up3.isEmpty()) {
			Card card = up3.getTopCard();
			img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
			g.drawImage(img, 775, 25, cardSizeX, cardSizeY, game);
		} else {
			g.drawRect(775, 25, cardSizeX, cardSizeY);
		}

		if (!up4.isEmpty()) {
			Card card = up4.getTopCard();
			img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
			g.drawImage(img, 925, 25, cardSizeX, cardSizeY, game);
		} else {
			g.drawRect(925, 25, cardSizeX, cardSizeY);
		}

		for (int i = 0; i < 7; i++) {
			Stack stack = stacks.get(i);
			if (!stack.isEmpty()) {
				for (int c = stack.getCards().length - 1; c >= 0; c--) {
					Card card = stack.getCard(c);
					if (!card.isFaceUp())
						img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
					else
						img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
					g.drawImage(img, 25 + (i * 150), 250 + ((stack.getCards().length * 30) - (c * 30)), cardSizeX, cardSizeY, game);
				}
			}
		}
	}
}
