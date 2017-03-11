import javax.swing.*;
import java.awt.event.*;

public class Main {
	JFrame chooseIt = new JFrame("The Quadratic Solver");
	JPanel cip = new JPanel();
	JLabel cil = new JLabel("Please pick the option to the right that specifies the quadratic you want to solve.");
	JButton nq = new JButton("Regular Quadratic");
	JButton nir = new JButton("Square Roots of Irrationals and Imaginaries");
	JButton uq = new JButton("U Substitution");

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
				initializeOptions();
			}
		});
	}

	private int initializeOptions() {
		cip.add(cil);
		cip.add(nq);
		cip.add(nir);
		cip.add(uq);
		chooseIt.add(cip);
		chooseIt.pack();
		chooseIt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chooseIt.setVisible(true);
	}
}
