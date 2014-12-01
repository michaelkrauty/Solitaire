package me.michaelkrauty.Solitaire;

import javax.swing.*;

/**
 * Created on 11/30/2014.
 *
 * @author michaelkrauty
 */
public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame("Solitaire");
		Game content = new Game();
		window.setContentPane(content);
		window.setSize(1280, 720);
		window.setLocation(100, 100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setVisible(true);
	}
}
