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
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

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
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKapitalfilms = new JLabel("KAPITAL-FILMS");
		lblKapitalfilms.setBackground(new Color(240, 240, 240));
		lblKapitalfilms.setForeground(new Color(204, 204, 102));
		lblKapitalfilms.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 55));
		lblKapitalfilms.setBounds(239, 16, 414, 88);
		contentPane.add(lblKapitalfilms);
		
		JButton btnNewButton = new JButton("PELICULAS");
		btnNewButton.setForeground(new Color(204, 204, 102));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(57, 130, 208, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("ABOUT US");
		btnNewButton_3.setForeground(new Color(204, 204, 102));
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setBounds(678, 130, 157, 46);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("SERIES");
		btnNewButton_1.setForeground(new Color(204, 204, 102));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(264, 130, 208, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DOCUMENTALES");
		btnNewButton_2.setForeground(new Color(204, 204, 102));
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(476, 130, 200, 46);
		contentPane.add(btnNewButton_2);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.DARK_GRAY);
		desktopPane.setBounds(82, 235, 695, 272);
		contentPane.add(desktopPane);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\descarga (1).jpg"));
		btnNewButton_4.setBounds(0, 0, 169, 236);
		desktopPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\descarga (2).jpg"));
		btnNewButton_4_1.setBounds(171, 0, 184, 236);
		desktopPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("");
		btnNewButton_4_1_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\descarga (3).jpg"));
		btnNewButton_4_1_1.setBounds(356, 0, 177, 236);
		desktopPane.add(btnNewButton_4_1_1);
		
		JButton button = new JButton("");
		button.setBackground(Color.DARK_GRAY);
		button.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\usuario1.png"));
		button.setBounds(702, 0, 135, 129);
		contentPane.add(button);
	}
}
