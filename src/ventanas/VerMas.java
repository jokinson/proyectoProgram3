package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logic.Sorting;

import objetos.Articulo;
import objetos.Documental;
import objetos.Pelicula;
import objetos.Serie;
import registro.Usuario;

import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class VerMas extends JFrame {

	private JPanel contentPane;

	
	

	/**
	 * Create the frame.
	 */
	public VerMas(Usuario u) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 798);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(66, 182, 391, 446);
		
		
		JLabel lblTopTendencias = new JLabel("TOP TENDENCIAS");
		lblTopTendencias.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		lblTopTendencias.setForeground(new Color(204, 204, 51));
		lblTopTendencias.setBounds(66, 131, 213, 35);
		contentPane.add(lblTopTendencias);
		
		DefaultListModel<Articulo> model = new DefaultListModel<Articulo>();
		ArrayList<Articulo> articulos = bd.SelectData.selectTendenciasArticulo1();
		for(Articulo a:articulos){
			model.addElement(a);
		}
		list.setModel(model);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBackground(new Color(0, 0, 0));
		btnAceptar.setForeground(new Color(204, 204, 51));
		btnAceptar.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Articulo a = (Articulo) list.getSelectedValue();
				ArticuloEspecifico ae = new ArticuloEspecifico(a,u);
				ae.setVisible(true);
				dispose();
				
			}
		});
		btnAceptar.setBounds(66, 664, 179, 35);
		contentPane.add(btnAceptar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBackground(new Color(0, 0, 0));
		btnVolver.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		btnVolver.setForeground(new Color(204, 204, 51));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p = new Principal(u);
				p.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(287, 664, 170, 35);
		contentPane.add(btnVolver);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		comboBox.setForeground(new Color(204, 204, 51));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tendencias", "Precio", "Peliculas", "Series", "Documentales"}));
		comboBox.setBounds(522, 199, 213, 35);
		contentPane.add(comboBox);
		
		JLabel lblKapitalfilms = new JLabel("KAPITAL-FILMS");
		lblKapitalfilms.setForeground(new Color(204, 204, 51));
		lblKapitalfilms.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 58));
		lblKapitalfilms.setBackground(SystemColor.menu);
		lblKapitalfilms.setBounds(135, 17, 558, 98);
		contentPane.add(lblKapitalfilms);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\logo.PNG"));
		lblNewLabel_2.setBounds(542, 468, 193, 98);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("@KapitalFilms_");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo Insta.jpg"));
		lblNewLabel.setForeground(new Color(204, 204, 51));
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel.setBounds(579, 582, 147, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo twitter.png"));
		lblNewLabel_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(579, 618, 147, 20);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 182, 391, 446);
		contentPane.add(scrollPane);

		scrollPane.setViewportView(list);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() == "Tendencias"){
					DefaultListModel<Articulo> model1 = new DefaultListModel<Articulo>();
					ArrayList<Articulo> articulos1 = bd.SelectData.selectTendenciasArticulo1();
					for(Articulo a:articulos){
						model1.addElement(a);
					}
					list.setModel(model1);
				}
				if(comboBox.getSelectedItem() == "Peliculas"){
					DefaultListModel<Pelicula> model2 = new DefaultListModel<Pelicula>();
					ArrayList<Pelicula> articulos2 = bd.SelectData.selectPelicula();
					for(Pelicula a:articulos2){
						model2.addElement(a);
					}
					list.setModel(model2);
				}
				if(comboBox.getSelectedItem() == "Series"){
					DefaultListModel<Serie> model3 = new DefaultListModel<Serie>();
					ArrayList<Serie> articulos3 = bd.SelectData.selectSerie();
					for(Serie a:articulos3){
						model3.addElement(a);
					}
					list.setModel(model3);
				}
				if(comboBox.getSelectedItem() == "Documentales"){
					DefaultListModel<Documental> model4 = new DefaultListModel<Documental>();
					ArrayList<Documental> articulos4 = bd.SelectData.selectDocumental();
					for(Documental a:articulos4){
						model4.addElement(a);
					}
					list.setModel(model4);
				}
				if(comboBox.getSelectedItem() == "Precio"){
					DefaultListModel<Articulo> model5 = new DefaultListModel<Articulo>();
					ArrayList<Articulo> arts = bd.SelectData.selectArticulosDeArticulos();
					for (Articulo a: arts){
						System.out.println(a);
					}
					ArrayList<Articulo> articulos5 =new ArrayList<Articulo>();
					articulos5= logic.Sorting.mergeSortNum(arts);
					for(Articulo a:articulos5){
						model5.addElement(a);
					}
					list.setModel(model5);
				}
			}
		});
		
		
		
		
	}
}
