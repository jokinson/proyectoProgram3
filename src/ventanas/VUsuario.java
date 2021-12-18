package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objetos.Articulo;
import registro.Usuario;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class VUsuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VUsuario(Usuario u, Articulo art) {
		setTitle("Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 577);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreUsuario = new JLabel("Nombre Usuario:");
		lblNombreUsuario.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		lblNombreUsuario.setForeground(new Color(204, 204, 51));
		lblNombreUsuario.setBounds(179, 42, 162, 20);
		contentPane.add(lblNombreUsuario);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\usuario1.png"));
		label.setBounds(0, 256, 206, 137);
		contentPane.add(label);
		
		JList list = new JList();
		list.setBounds(478, 78, 304, 315);
		contentPane.add(list);
		
		JLabel lblPeliculasDeUsuario = new JLabel("Articulos de "+u.getNombreCompleto());
		lblPeliculasDeUsuario.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		lblPeliculasDeUsuario.setForeground(new Color(204, 204, 51));
		lblPeliculasDeUsuario.setBounds(541, 42, 173, 20);
		contentPane.add(lblPeliculasDeUsuario);
		
		JLabel lblNewLabel = new JLabel("Saldo:");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		lblNewLabel.setForeground(new Color(204, 204, 51));
		lblNewLabel.setBounds(174, 216, 69, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnDevolverArticulo = new JButton("Devolver Articulo");
		btnDevolverArticulo.setBackground(new Color(0, 0, 0));
		btnDevolverArticulo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		btnDevolverArticulo.setForeground(new Color(204, 204, 51));
		btnDevolverArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Articulo a = (Articulo) list.getSelectedValue();
				
				bd.DeleteData.actualizar(u, a);
				
				DefaultListModel<Articulo> model = new DefaultListModel<Articulo>();
				ArrayList<Articulo> articulos = bd.SelectData.selectArticulosUsuario(u);
				for(Articulo art : articulos){
					model.addElement(art);
				}
				
				list.setModel(model);
				
			}
		});
		btnDevolverArticulo.setBounds(509, 416, 240, 29);
		contentPane.add(btnDevolverArticulo);
		
		JButton btnAgregarSaldo = new JButton("Agregar Saldo");
		btnAgregarSaldo.setBackground(new Color(0, 0, 0));
		btnAgregarSaldo.setForeground(new Color(204, 204, 51));
		btnAgregarSaldo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		btnAgregarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AgregarSaldo ag = new AgregarSaldo(u, VUsuario.this, art);
				ag.setVisible(true);
				

				
			}
		});
		btnAgregarSaldo.setBounds(179, 295, 240, 29);
		contentPane.add(btnAgregarSaldo);
		
		JButton btnVolver = new JButton("Volver ");
		btnVolver.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		btnVolver.setForeground(new Color(204, 204, 51));
		btnVolver.setBackground(new Color(0, 0, 0));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p = new Principal(u);
				p.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(509, 461, 240, 29);
		contentPane.add(btnVolver);
		
		
		DefaultListModel<Articulo> model = new DefaultListModel<Articulo>();
		ArrayList<Articulo> articulosUsu = bd.SelectData.selectArticulosUsuario(u);
		
		for(Articulo a: articulosUsu){
			model.addElement(a);
		}
	
		list.setModel(model);
		
		JLabel lblLaTuki = new JLabel(u.getNombreUsuario()+"");
		lblLaTuki.setForeground(new Color(204, 204, 51));
		lblLaTuki.setBackground(new Color(240, 240, 240));
		lblLaTuki.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblLaTuki.setBounds(208, 78, 206, 56);
		contentPane.add(lblLaTuki);
		
		JLabel lblTuki = new JLabel(u.getSaldo()+"");
		lblTuki.setForeground(new Color(204, 204, 51));
		lblTuki.setFont(new Font("Mongolian Baiti", Font.PLAIN, 35));
		lblTuki.setBounds(179, 252, 240, 38);
		contentPane.add(lblTuki);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\logo.PNG"));
		lblNewLabel_1.setBounds(0, 367, 187, 154);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("@");
		lblNewLabel_2_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_2_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(179, 88, 38, 44);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\usuario1.png"));
		btnNewButton.setBounds(15, 29, 139, 121);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("@KapitalFilms_");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo Insta.jpg"));
		lblNewLabel_2.setForeground(new Color(204, 204, 51));
		lblNewLabel_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(232, 418, 147, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo twitter.png"));
		lblNewLabel_1_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(232, 454, 147, 20);
		contentPane.add(lblNewLabel_1_1);
	}
}
