import javax.swing.*;
import java.awt.event.*;

public class Main {
	public static void main(String[] args) {
		JFrame mainMenu = new JFrame("The Quadratic Solver");
		JPanel panel = new JPanel();
		mainMenu.add(panel);
		JLabel label = new JLabel("Welcome to the Quadratic Solver, by Carter Weiss.");
		JButton startButton = new JButton("Start \u2192");
		panel.add(label);
		panel.add(startButton);
		mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainMenu.setVisible(true);
		mainMenu.pack();
	}
}
