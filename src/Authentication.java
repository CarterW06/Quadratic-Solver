import javax.swing.*;
import java.awt.event.*;

public class Authentication {
	static char[] c = {'c', 'w', 'e', 'i', 's', 's'};
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		JPasswordField jpf = new JPasswordField(30);
		JPanel jp = new JPanel();
		JButton jb = new JButton("OK");
		JFrame jf = new JFrame("Authentication");
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jpf.getText().equals("cweiss")) {
					new Main().start();
					jf.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(jf, "WRONG PASSWORD!!!");
					jf.setVisible(false);
					System.exit(0);
				}
			}
		});
		jp.add(jpf);
		jp.add(jb);
		jf.add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
}
