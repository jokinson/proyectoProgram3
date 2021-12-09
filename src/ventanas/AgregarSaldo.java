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

public class AgregarSaldo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AgregarSaldo(Usuario u) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantidadDeSaldo = new JLabel("Cantidad de saldo para agregar (double) :");
		lblCantidadDeSaldo.setBounds(15, 39, 372, 20);
		contentPane.add(lblCantidadDeSaldo);
		
		textField = new JTextField();
		textField.setBounds(15, 103, 238, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n = textField.getText();
				double nuevoSaldo = Double.parseDouble(n);
				
				nuevoSaldo = nuevoSaldo + u.getSaldo();
				u.setSaldo(nuevoSaldo);
				Usuario usuarioNuevo = new Usuario(u.getCodUsuario(), u.getNombreCompleto(), u.getEdad(), u.getNombreUsuario(),u.getContrasena(),u.getSaldo(),u.getEsAdmin());
				bd.SelectData.insertUsuarioNuevo(usuarioNuevo);
				
			}
		});
		btnAceptar.setBounds(15, 162, 115, 29);
		contentPane.add(btnAceptar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		btnVolver.setBounds(191, 162, 115, 29);
		contentPane.add(btnVolver);
	}
}
