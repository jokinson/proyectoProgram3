package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class AboutUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AboutUs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 778);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKapitalfilms = new JLabel("KAPITAL-FILMS");
		lblKapitalfilms.setForeground(new Color(204, 204, 51));
		lblKapitalfilms.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 58));
		lblKapitalfilms.setBackground(SystemColor.menu);
		lblKapitalfilms.setBounds(181, 16, 558, 98);
		contentPane.add(lblKapitalfilms);
		
		JLabel lblNewLabel = new JLabel("\u00BFQui\u00E9nes somos?");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(204, 204, 51));
		lblNewLabel.setBounds(99, 140, 199, 49);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrSomosUnaPlataforma = new JTextArea();
		txtrSomosUnaPlataforma.setBackground(new Color(0, 0, 0));
		txtrSomosUnaPlataforma.setForeground(new Color(204, 204, 51));
		txtrSomosUnaPlataforma.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtrSomosUnaPlataforma.setText("Somos una plataforma de entretenimiento visual que opera \r\nen Espa\u00F1a desde 2010 dirigida a aquellos amantes del cine, \r\nseries e incluso documentales de car\u00E1cter lectivo que buscan \r\nuna forma m\u00E1s moderna de disfrutar de dicho entretenimiento \r\nen cualquier lugar y en cualquier momento.");
		txtrSomosUnaPlataforma.setBounds(91, 205, 445, 157);
		contentPane.add(txtrSomosUnaPlataforma);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\logo.PNG"));
		lblNewLabel_2.setBounds(623, 205, 193, 98);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblFundadores = new JLabel("Contactanos");
		lblFundadores.setForeground(new Color(204, 204, 51));
		lblFundadores.setFont(new Font("Mongolian Baiti", Font.PLAIN, 25));
		lblFundadores.setBounds(99, 368, 199, 49);
		contentPane.add(lblFundadores);
		
		JTextArea txtrActualmenteKapitalfilmsEs = new JTextArea();
		txtrActualmenteKapitalfilmsEs.setText("Actualmente KapitalFilms es una de las plataformas de entretenimiento \r\nvisual m\u00E1s utilizadas del momento en el Pa\u00EDs Vasco, a pesar de llegar a \r\ntanta gente, somos una empresa que se preocupa mucho por la \r\nsatisfacci\u00F3n de nuestros clientes y ofrecemosun trato personal a aquellos \r\nque lo requieran. \r\nSiguiendo ejemplo de lo anterior, puede contactar con nosotros mediante\r\nnuestro instagram, twitter, correo electr\u00F3nico o llamando al n\u00FAmero que \r\naparece en pantalla.");
		txtrActualmenteKapitalfilmsEs.setForeground(new Color(204, 204, 51));
		txtrActualmenteKapitalfilmsEs.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		txtrActualmenteKapitalfilmsEs.setBackground(Color.BLACK);
		txtrActualmenteKapitalfilmsEs.setBounds(91, 433, 542, 180);
		contentPane.add(txtrActualmenteKapitalfilmsEs);
		
		JLabel lblNewLabel_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo Insta.jpg"));
		lblNewLabel_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(99, 640, 147, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo twitter.png"));
		lblNewLabel_1_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(244, 640, 147, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tlf: 943 901 936");
		lblNewLabel_1_1_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(267, 676, 124, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("kapitalfilms@gmail.com");
		lblNewLabel_1_1_2.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\gmail.png"));
		lblNewLabel_1_1_2.setForeground(new Color(204, 204, 51));
		lblNewLabel_1_1_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1_1_2.setBounds(407, 640, 193, 20);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\contactanos.png"));
		lblNewLabel_3.setBounds(670, 456, 199, 109);
		contentPane.add(lblNewLabel_3);
	}
}
