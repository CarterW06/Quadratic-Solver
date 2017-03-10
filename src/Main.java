import javax.swing.*;
import java.awt.event.*;

public class Main {
	public void start() {
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
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showOptionDialog(mainMenu, "Which of the following things do you want to solve?", "The Quadratic Solver", , messageType, icon, options, initialValue)
			}
		});
	}
}
