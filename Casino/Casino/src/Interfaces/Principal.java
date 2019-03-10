package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGerente = new JButton("Gerente");
		btnGerente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gerente window = new Gerente();
					window.frame.setVisible(true);
				} catch (Exception a) {
					a.printStackTrace();
				}
				frame.setVisible(false);
			}
		});
		btnGerente.setBounds(311, 450, 171, 41);
		frame.getContentPane().add(btnGerente);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Jugar window = new Jugar();
					window.frame.setVisible(true);
				} catch (Exception a) {
					a.printStackTrace();
				}
				frame.setVisible(false);
			}
		});
		btnJugar.setBounds(732, 450, 171, 41);
		frame.getContentPane().add(btnJugar);
	}
}
