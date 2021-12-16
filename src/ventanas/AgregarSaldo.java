package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import registro.Usuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class AgregarSaldo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AgregarSaldo(Usuario u, VUsuario v) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 419);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantidadDeSaldo = new JLabel("Cantidad de saldo para agregar (double) :");
		lblCantidadDeSaldo.setForeground(new Color(204, 204, 51));
		lblCantidadDeSaldo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		lblCantidadDeSaldo.setBounds(45, 102, 372, 20);
		contentPane.add(lblCantidadDeSaldo);
		
		textField = new JTextField();
		textField.setBounds(45, 138, 265, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(0, 0, 0));
		btnAceptar.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		btnAceptar.setForeground(new Color(204, 204, 51));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n = textField.getText();
				double nuevoSaldo = Double.parseDouble(n);
				
				nuevoSaldo = nuevoSaldo + u.getSaldo();
				u.setSaldo(nuevoSaldo);
				Usuario usuarioNuevo = new Usuario(u.getCodUsuario(), u.getNombreCompleto(), u.getEdad(), u.getNombreUsuario(),u.getContrasena(),u.getSaldo(),u.getEsAdmin());
				bd.SelectData.insertUsuarioNuevo(usuarioNuevo);
				v.dispose();
				VUsuario vu = new VUsuario(u);
				vu.setVisible(true);
				dispose();
			}
		});
		btnAceptar.setBounds(55, 180, 115, 29);
		contentPane.add(btnAceptar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBackground(new Color(0, 0, 0));
		btnVolver.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		btnVolver.setForeground(new Color(204, 204, 51));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				dispose();
			}
		});
		btnVolver.setBounds(195, 180, 115, 29);
		contentPane.add(btnVolver);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
		lblSaldo.setForeground(new Color(204, 204, 51));
		lblSaldo.setBounds(270, 45, 69, 20);
		contentPane.add(lblSaldo);
		
		JLabel label = new JLabel(u.getSaldo()+"");
		label.setForeground(new Color(204, 204, 51));
		label.setBounds(329, 45, 38, 20);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("@KapitalFilms_");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo Insta.jpg"));
		lblNewLabel.setForeground(new Color(204, 204, 51));
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel.setBounds(210, 277, 147, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo twitter.png"));
		lblNewLabel_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(210, 317, 147, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(u.getNombreUsuario()+"");
		lblNewLabel_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(new Color(204, 204, 51));
		lblNewLabel_2.setBounds(45, 29, 253, 44);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("@");
		lblNewLabel_2_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_2_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(15, 29, 38, 44);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\logo.PNG"));
		lblNewLabel_3.setBounds(0, 245, 195, 114);
		contentPane.add(lblNewLabel_3);
		
		
	}
}
