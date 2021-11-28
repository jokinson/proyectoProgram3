package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.SelectData;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;


	/**
	 * Create the frame.
	 */
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(71, 77, 299, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(71, 147, 299, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(71, 216, 299, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(71, 285, 299, 31);
		contentPane.add(passwordField);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String nombreC = textField.getText();
				String ed = textField_1.getText();
				int eda = Integer.parseInt(ed);
				String nombreUsu = textField_2.getText();
				String contra = passwordField.getText();
				
				SelectData.insertUsuario(nombreC, eda, nombreUsu, contra);
				
				Login login = new Login();
				login.setVisible(true);
				dispose();
				
				JOptionPane.showMessageDialog(login, "Te has registrado!");
				
			}
		});
		btnRegistrar.setBounds(153, 352, 115, 29);
		contentPane.add(btnRegistrar);
		
		JLabel lblNombrecompleto = new JLabel("NombreCompleto");
		lblNombrecompleto.setBounds(69, 41, 125, 20);
		contentPane.add(lblNombrecompleto);
		
		JLabel lblNewLabel = new JLabel("Edad");
		lblNewLabel.setBounds(71, 124, 69, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreusuario = new JLabel("NombreUsuario");
		lblNombreusuario.setBounds(71, 180, 162, 20);
		contentPane.add(lblNombreusuario);
		
		JLabel lblContrasena = new JLabel("contrasena");
		lblContrasena.setBounds(71, 263, 123, 20);
		contentPane.add(lblContrasena);
		
		
	}
}
