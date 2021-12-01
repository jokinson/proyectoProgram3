package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import registro.Usuario;
import javax.swing.JMenuBar;

public class Principal extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public Principal(Usuario a) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 647);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("PELICULAS\r\nSERIES \r\nDOCUMENTALES");
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
