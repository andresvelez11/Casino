package Interfaces;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jugar {

	JFrame frame;

	/**
	 * Create the application.
	 */
	public Jugar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception a) {
					a.printStackTrace();
				}
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(26, 28, 171, 41);
		frame.getContentPane().add(btnBack);
	}

}
