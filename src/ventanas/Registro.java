package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.SelectData;
import registro.Usuario;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	Usuario u = null;
	/**
	 * Create the frame.
	 */
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 659);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(204, 204, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(114, 135, 305, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(114, 208, 305, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 291, 305, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(114, 372, 305, 31);
		contentPane.add(passwordField);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBackground(new Color(0, 0, 0));
		btnRegistrar.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		btnRegistrar.setForeground(new Color(204, 204, 51));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String nombreC = textField.getText();
				String ed = textField_1.getText();
				int eda = Integer.parseInt(ed);
				String nombreUsu = textField_2.getText();
				String contra = passwordField.getText();
				
				SelectData.insertUsuario(nombreC, eda, nombreUsu, contra);
				
				Login login = new Login(null);
				login.setVisible(true);
				dispose();
				
				JOptionPane.showMessageDialog(login, "Te has registrado!");
				
			}
		});
		btnRegistrar.setBounds(114, 443, 148, 29);
		contentPane.add(btnRegistrar);
		
		JLabel lblNombrecompleto = new JLabel("NombreCompleto");
		lblNombrecompleto.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		lblNombrecompleto.setForeground(new Color(204, 204, 51));
		lblNombrecompleto.setBounds(112, 99, 139, 20);
		contentPane.add(lblNombrecompleto);
		
		JLabel lblNewLabel = new JLabel("Edad");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		lblNewLabel.setForeground(new Color(204, 204, 51));
		lblNewLabel.setBounds(114, 182, 69, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreusuario = new JLabel("NombreUsuario");
		lblNombreusuario.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		lblNombreusuario.setForeground(new Color(204, 204, 51));
		lblNombreusuario.setBounds(114, 255, 162, 20);
		contentPane.add(lblNombreusuario);
		
		JLabel lblContrasena = new JLabel("Contrasena");
		lblContrasena.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		lblContrasena.setForeground(new Color(204, 204, 51));
		lblContrasena.setBounds(114, 338, 123, 20);
		contentPane.add(lblContrasena);
		
		JLabel lblKapitalfilms = new JLabel("KAPITAL-FILMS");
		lblKapitalfilms.setForeground(new Color(204, 204, 51));
		lblKapitalfilms.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 58));
		lblKapitalfilms.setBackground(SystemColor.menu);
		lblKapitalfilms.setBounds(47, 0, 558, 98);
		contentPane.add(lblKapitalfilms);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\logo.PNG"));
		lblNewLabel_2.setBounds(76, 495, 193, 98);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo Insta.jpg"));
		lblNewLabel_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(309, 516, 147, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo twitter.png"));
		lblNewLabel_1_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(309, 552, 147, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p =new Principal(u);
				p.setVisible(true);
				dispose();
			}
		});
		btnVolver.setForeground(new Color(204, 204, 51));
		btnVolver.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		btnVolver.setBackground(Color.BLACK);
		btnVolver.setBounds(277, 443, 142, 29);
		contentPane.add(btnVolver);
		
		
	}
}
