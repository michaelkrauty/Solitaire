package me.michaelkrauty.Solitaire;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created on 11/30/2014.
 *
 * @author michaelkrauty
 */
public class Table {

	private final int XRES = 500;
	private final int YRES = 726;

	private final Deck deck = new Deck(true);
	private ArrayList<Card> drawPile = new ArrayList<Card>();
	private ArrayList<Card> faceUpPile = new ArrayList<Card>();
	private ArrayList<ArrayList<Card>> stacks = new ArrayList<ArrayList<Card>>();
	private ArrayList<Card> up1 = new ArrayList<Card>();
	private ArrayList<Card> up2 = new ArrayList<Card>();
	private ArrayList<Card> up3 = new ArrayList<Card>();
	private ArrayList<Card> up4 = new ArrayList<Card>();
	private ArrayList<Card> place1 = new ArrayList<Card>();
	private ArrayList<Card> place2 = new ArrayList<Card>();
	private ArrayList<Card> place3 = new ArrayList<Card>();
	private ArrayList<Card> place4 = new ArrayList<Card>();
	private ArrayList<Card> place5 = new ArrayList<Card>();
	private ArrayList<Card> place6 = new ArrayList<Card>();
	private ArrayList<Card> place7 = new ArrayList<Card>();

	public Table() {


		Card[] cardList = deck.getCards();
		for (int stack = 1; stack <= 7; stack++) {
			ArrayList<Card> cards = new ArrayList<Card>();
			for (int i = 0; i < stack; i++) {

			}
		}






		place1.add(deck.getCard(0).setFaceUp(true));
		place2.add(deck.getCard(1).setFaceUp(false));
		place2.add(deck.getCard(2).setFaceUp(true));

		for (int i = 3; i <= 5; i++) {
			boolean faceUp = false;
			if (i == 5)
				faceUp = true;
			place3.add(deck.getCard(i).setFaceUp(faceUp));
		}

		for (int i = 6; i <= 9; i++) {
			boolean faceUp = false;
			if (i == 9)
				faceUp = true;
			place4.add(deck.getCard(i).setFaceUp(faceUp));
		}

		for (int i = 10; i <= 14; i++) {
			boolean faceUp = false;
			if (i == 14)
				faceUp = true;
			place5.add(deck.getCard(i).setFaceUp(faceUp));
		}

		for (int i = 15; i <= 20; i++) {
			boolean faceUp = false;
			if (i == 20)
				faceUp = true;
			place6.add(deck.getCard(i).setFaceUp(faceUp));
		}

		for (int i = 21; i <= 27; i++) {
			boolean faceUp = false;
			if (i == 27)
				faceUp = true;
			place7.add(deck.getCard(i).setFaceUp(faceUp));
		}

		for (int i = 28; i < deck.getCards().length; i++) {
			drawPile.add(deck.getCard(i).setFaceUp(false));
		}
	}

	public void draw(Game game, Graphics g) {
		Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
		Image img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");

		int scaleDown = 4;

		if (!drawPile.isEmpty())
			g.drawImage(img, 25, 25, XRES / scaleDown, YRES / scaleDown, game);

		for (int i = 0; i < place1.size(); i++) {
			Card card = place1.get(i);
			if (!card.isFaceUp())
				img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
			else
				img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
			g.drawImage(img, 25, 250+(i*30), XRES / scaleDown, YRES / scaleDown, game);
		}

		for (int i = 0; i < place2.size(); i++) {
			Card card = place2.get(i);
			if (!card.isFaceUp())
				img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
			else
				img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
			g.drawImage(img, 25+150, 250+(i*30), XRES / scaleDown, YRES / scaleDown, game);
		}

		for (int i = 0; i < place3.size(); i++) {
			Card card = place3.get(i);
			if (!card.isFaceUp())
				img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
			else
				img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
			g.drawImage(img, 25+300, 250+(i*30), XRES / scaleDown, YRES / scaleDown, game);
		}

		for (int i = 0; i < place4.size(); i++) {
			Card card = place4.get(i);
			if (!card.isFaceUp())
				img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
			else
				img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
			g.drawImage(img, 25+450, 250+(i*30), XRES / scaleDown, YRES / scaleDown, game);
		}

		for (int i = 0; i < place5.size(); i++) {
			Card card = place5.get(i);
			if (!card.isFaceUp())
				img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
			else
				img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
			g.drawImage(img, 25+600, 250+(i*30), XRES / scaleDown, YRES / scaleDown, game);
		}

		for (int i = 0; i < place6.size(); i++) {
			Card card = place6.get(i);
			if (!card.isFaceUp())
				img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
			else
				img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
			g.drawImage(img, 25+750, 250+(i*30), XRES / scaleDown, YRES / scaleDown, game);
		}

		for (int i = 0; i < place7.size(); i++) {
			Card card = place7.get(i);
			if (!card.isFaceUp())
				img = Toolkit.getDefaultToolkit().getImage("cards/facedown.png");
			else
				img = Toolkit.getDefaultToolkit().getImage("cards/" + card.getSuit().toString() + "/" + card.getType().toString() + ".png");
			g.drawImage(img, 25+900, 250+(i*30), XRES / scaleDown, YRES / scaleDown, game);
		}
	}
}
