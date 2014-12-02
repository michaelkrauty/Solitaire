package me.michaelkrauty.Solitaire;

import java.awt.event.MouseEvent;

/**
 * Created on 12/1/2014.
 *
 * @author michaelkrauty
 */
public class MouseListener implements java.awt.event.MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		Table table = Main.game.getTable();
		int cardSizeX = table.getCardSizeX();
		int cardSizeY = table.getCardSizeY();
		int x = e.getX();
		int y = e.getY();
		if (y >= 25 && y <=25+cardSizeY) {
			if (x >= 25 && x <= 25+cardSizeX) {
				table.drawNextCard();
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		Main.game.requestFocus();
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}
}
