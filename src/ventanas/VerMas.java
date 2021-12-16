package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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

public class VerMas extends JFrame {

	private JPanel contentPane;

	
	

	/**
	 * Create the frame.
	 */
	public VerMas(Usuario u) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(68, 111, 391, 446);
		contentPane.add(list);
		
		JLabel lblTopTendencias = new JLabel("TOP TENDENCIAS");
		lblTopTendencias.setBounds(68, 16, 213, 35);
		contentPane.add(lblTopTendencias);
		
		DefaultListModel<Articulo> model = new DefaultListModel<Articulo>();
		ArrayList<Articulo> articulos = bd.SelectData.selectTendenciasArticulo1();
		for(Articulo a:articulos){
			model.addElement(a);
		}
		list.setModel(model);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Articulo a = (Articulo) list.getSelectedValue();
				ArticuloEspecifico ae = new ArticuloEspecifico(a,u);
				ae.setVisible(true);
				dispose();
				
			}
		});
		btnAceptar.setBounds(522, 476, 206, 29);
		contentPane.add(btnAceptar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p = new Principal(u);
				p.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(522, 521, 206, 35);
		contentPane.add(btnVolver);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tendencias", "Peliculas", "Series", "Documentales"}));
		comboBox.setBounds(522, 50, 213, 35);
		contentPane.add(comboBox);
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
			}
		});
		
		
		
		
	}
}
