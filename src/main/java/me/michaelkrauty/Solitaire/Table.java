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
	private ArrayList<ArrayList<Card>> stacks = new ArrayList<ArrayList<Card>>();
	private ArrayList<Card> up1 = new ArrayList<Card>();
	private ArrayList<Card> up2 = new ArrayList<Card>();
	private ArrayList<Card> up3 = new ArrayList<Card>();
	private ArrayList<Card> up4 = new ArrayList<Card>();

	public Table() {

		for (int stack = 0; stack < 7; stack++) {
			boolean faceUp = true;
			ArrayList<Card> cards = new ArrayList<Card>();
			for (int i = 0; i < stack+1; i++) {
				cards.add(deck.getNextCard().setFaceUp(faceUp));
				faceUp = false;
			}
			stacks.add(cards);
		}
	}

	public void draw(Game game, Graphics g) {
		Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
		Image img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");

		if (!drawPile.isEmpty())
			g.drawImage(img, 25, 25, cardSizeX, cardSizeY, game);

		for (int stack = 0; stack < 7; stack++) {
			ArrayList<Card> cards = stacks.get(stack);
			for (int i = cards.size()-1; i>=0; i--) {
				Card card = cards.get(i);
				if (!card.isFaceUp())
					img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
				else
					img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
				g.drawImage(img, 25+(stack*150), 250+((stacks.get(stack).size()*30)-(i*30)), cardSizeX, cardSizeY, game);
			}
		}
	}
}
