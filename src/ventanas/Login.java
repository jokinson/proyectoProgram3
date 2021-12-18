package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.SelectData;
import objetos.Articulo;
import registro.Usuario;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	Articulo a;
	/**
	 * Create the frame.
	 */
	public Login(Articulo articulo) {
		this.a = articulo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		textField.setForeground(new Color(204, 204, 51));
		textField.setBackground(new Color(51, 51, 51));
		textField.setBounds(131, 141, 422, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		passwordField.setBackground(new Color(51, 51, 51));
		passwordField.setForeground(new Color(204, 204, 51));
		passwordField.setBounds(131, 228, 422, 35);
		contentPane.add(passwordField);
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		btnIniciarSesin.setBackground(new Color(0, 0, 0));
		btnIniciarSesin.setForeground(new Color(204, 204, 51));
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String textoUsuario = textField.getText();
				String passwordTexto= passwordField.getText();
				
				ArrayList<Usuario> u = SelectData.selectUsuario();
				boolean esFalso=true;
				
				for(Usuario a : u){
					if(textoUsuario.equals(a.getNombreUsuario())&& passwordTexto.equals(a.getContrasena())){
						esFalso=false;
						if(a.getEsAdmin() == 1){
							Admin admin = new Admin();
							admin.setVisible(true);
							dispose();
						}else{
							if(articulo==null){
								Principal principal = new Principal(a);
								principal.setVisible(true);
								dispose();
							}else{
								ArticuloEspecifico ae = new ArticuloEspecifico(articulo, a);
								ae.setVisible(true);
								dispose();
							}
							
						}
						
					}
					
					
				}if (esFalso==true){
					JOptionPane.showMessageDialog(Login.this, "El usuario o la contraseña son incorrectos");
				}
				
			}
		});
		btnIniciarSesin.setBounds(147, 298, 163, 29);
		contentPane.add(btnIniciarSesin);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(204, 204, 51));
		btnNewButton.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Registro registro = new Registro();
				registro.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(361, 298, 163, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		lblNombreDeUsuario.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		lblNombreDeUsuario.setBackground(new Color(0, 0, 0));
		lblNombreDeUsuario.setForeground(new Color(204, 204, 51));
		lblNombreDeUsuario.setBounds(128, 105, 206, 20);
		contentPane.add(lblNombreDeUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		lblContrasea.setForeground(new Color(204, 204, 51));
		lblContrasea.setBounds(130, 192, 163, 20);
		contentPane.add(lblContrasea);
		
		JLabel lblKapitalfilms = new JLabel("KAPITAL-FILMS");
		lblKapitalfilms.setForeground(new Color(204, 204, 51));
		lblKapitalfilms.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 58));
		lblKapitalfilms.setBackground(SystemColor.menu);
		lblKapitalfilms.setBounds(105, 0, 558, 98);
		contentPane.add(lblKapitalfilms);
		
		JLabel lblNewLabel = new JLabel("@KapitalFilms_");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo Insta.jpg"));
		lblNewLabel.setForeground(new Color(204, 204, 51));
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel.setBounds(261, 350, 147, 20);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo twitter.png"));
		lblNewLabel_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(261, 386, 147, 20);
		contentPane.add(lblNewLabel_1);
		
	}
	
}
