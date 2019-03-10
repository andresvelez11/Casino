package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gerente {

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Gerente() {
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
		
		JLabel lblPerdidas = new JLabel("Perdidas:");
		lblPerdidas.setBounds(74, 69, 115, 33);
		frame.getContentPane().add(lblPerdidas);
		
		JLabel lblGanancias = new JLabel("Ganancias:");
		lblGanancias.setBounds(74, 115, 174, 33);
		frame.getContentPane().add(lblGanancias);
		
		textField = new JTextField();
		textField.setBounds(74, 176, 711, 415);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(742, 176, 43, 415);
		frame.getContentPane().add(scrollBar);
		
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
