package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import registro.Usuario;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaPeliculas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ListaPeliculas(Usuario a) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAlquilar = new JButton("Alquilar");
		btnAlquilar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (a == null){
					Login l = new Login();
					l.setVisible(true);
					dispose();
				}else{
					
				}
			}
		});
		btnAlquilar.setBounds(266, 199, 115, 29);
		contentPane.add(btnAlquilar);
	}
}
