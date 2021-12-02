package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JButton;

public class Usuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
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
	public Usuario(Usuario u) {
		setTitle("Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreUsuario = new JLabel("Nombre Usuario:");
		lblNombreUsuario.setBounds(201, 52, 162, 20);
		contentPane.add(lblNombreUsuario);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\usuario1.png"));
		label.setBounds(15, 16, 206, 137);
		contentPane.add(label);
		
		JList list = new JList();
		list.setBounds(422, 78, 304, 315);
		contentPane.add(list);
		
		JLabel lblPeliculasDeUsuario = new JLabel("Articulos de Usuario");
		lblPeliculasDeUsuario.setBounds(487, 42, 162, 20);
		contentPane.add(lblPeliculasDeUsuario);
		
		JLabel lblNewLabel = new JLabel("Saldo:");
		lblNewLabel.setBounds(65, 200, 69, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnDevolverArticulo = new JButton("Devolver Articulo");
		btnDevolverArticulo.setBounds(457, 416, 240, 29);
		contentPane.add(btnDevolverArticulo);
		
		JButton btnAgregarSaldo = new JButton("Agregar Saldo");
		btnAgregarSaldo.setBounds(65, 312, 240, 29);
		contentPane.add(btnAgregarSaldo);
		
		JButton btnVolver = new JButton("Volver ");
		btnVolver.setBounds(15, 416, 240, 29);
		contentPane.add(btnVolver);
	}
}
