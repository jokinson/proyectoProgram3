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
	public VUsuario(Usuario u) {
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
		btnDevolverArticulo.setBounds(457, 416, 240, 29);
		contentPane.add(btnDevolverArticulo);
		
		JButton btnAgregarSaldo = new JButton("Agregar Saldo");
		btnAgregarSaldo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAgregarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AgregarSaldo ag = new AgregarSaldo(u);
				ag.setVisible(true);

				
			}
		});
		btnAgregarSaldo.setBounds(65, 312, 240, 29);
		contentPane.add(btnAgregarSaldo);
		
		JButton btnVolver = new JButton("Volver ");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p = new Principal(u);
				p.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(15, 416, 240, 29);
		contentPane.add(btnVolver);
		
		
		DefaultListModel<Articulo> model = new DefaultListModel<Articulo>();
		ArrayList<Articulo> articulosUsu = bd.SelectData.selectArticulosUsuario(u);
		
		for(Articulo a: articulosUsu){
			model.addElement(a);
		}
	
		list.setModel(model);
		
		JLabel lblLaTuki = new JLabel(u.getNombreUsuario()+"");
		lblLaTuki.setBackground(new Color(240, 240, 240));
		lblLaTuki.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblLaTuki.setBounds(201, 101, 173, 29);
		contentPane.add(lblLaTuki);
		
		JLabel lblTuki = new JLabel(u.getSaldo()+"");
		lblTuki.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblTuki.setBounds(65, 238, 240, 38);
		contentPane.add(lblTuki);
	}
}
