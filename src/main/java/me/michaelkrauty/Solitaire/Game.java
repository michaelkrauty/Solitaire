package me.michaelkrauty.Solitaire;

/**
 * Created on 11/29/2014.
 *
 * @author michaelkrauty
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This panel implements a simple arcade game in which the user tries to blow up
 * a "submarine" (a black oval) by dropping "depth charges" (a red disk) from a
 * "boat" (a blue roundrect). The user moves the boat with the left- and
 * right-arrow keys and drops the depth charge with the down-arrow key. The sub
 * moves left and right erratically along the bottom of the panel. This class
 * contains a main() routine to allow it to be run as a program.
 */
public class Game extends JPanel {

	private Timer timer;

	private int width, height;

	private Table table = new Table();

	public Game() {

		setBackground(new Color(0, 200, 0));

		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				// *.updateForNewFrame();
				repaint();
			}
		};
		timer = new Timer(30, action); // Fires every 30 milliseconds.

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				requestFocus();
			}
		});

		addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent evt) {
				timer.start();
				repaint();
			}

			public void focusLost(FocusEvent evt) {
				timer.stop();
				repaint();
			}
		});

	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g); // Fill panel with background color, green.

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		// init game objects
		width = getWidth();
		height = getHeight();

		g.drawRect(0, 0, width - 1, height - 1); // Draw a 3-pixel border.
		g.drawRect(1, 1, width - 3, height - 3);
		g.drawRect(2, 2, width - 5, height - 5);

		table.draw(this, g);

	}

}
