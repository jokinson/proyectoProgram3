package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.SelectData;
import registro.Usuario;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 347);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(87, 88, 422, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(87, 150, 422, 35);
		contentPane.add(passwordField);
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String textoUsuario = textField.getText();
				String passwordTexto= passwordField.getText();
				
				ArrayList<Usuario> u = SelectData.selectUsuario();
				for(Usuario a : u){
					if(textoUsuario.equals(a.getNombreUsuario())&& passwordTexto.equals(a.getContrasena())){
						
						Principal principal = new Principal(a);
						principal.setVisible(true);
						dispose();
					}else{
						Login login = new Login();
						JOptionPane.showMessageDialog(login, "El usuario o la contraseña son incorrectos");
					}
					
				}
				
			}
		});
		btnIniciarSesin.setBounds(87, 214, 163, 29);
		contentPane.add(btnIniciarSesin);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Registro registro = new Registro();
				registro.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(290, 214, 163, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setForeground(Color.WHITE);
		lblNombreDeUsuario.setBounds(87, 52, 206, 20);
		contentPane.add(lblNombreDeUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(87, 125, 163, 20);
		contentPane.add(lblContrasea);
	}
}
