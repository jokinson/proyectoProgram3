package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import registro.Usuario;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Principal extends JFrame {

	private JPanel contentPane;
	
	
	/*
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario Usuario = null;
					Principal frame = new Principal(Usuario);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Principal(Usuario a) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(223, 137, 466, 31);
		contentPane.add(menuBar);
		
		JButton btnNewButton = new JButton("PELICULAS");
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SERIES");
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DOCUMENTALES");
		menuBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ABOUT US");
		menuBar.add(btnNewButton_3);
	}
}
