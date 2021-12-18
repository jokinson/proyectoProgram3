package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objetos.Articulo;
import objetos.Documental;
import objetos.Pelicula;
import objetos.Serie;
import registro.Usuario;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ListaPeliculas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ListaPeliculas(Usuario u, String nombre) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 624);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		list.setBounds(40, 75, 272, 292);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(227, 154, 271, 292);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(list);
		if(nombre == "PELICULAS"){
			DefaultListModel<String> peliculas = new DefaultListModel<String>();
			ArrayList<Pelicula> pe = bd.SelectData.selectPelicula();
			for(Pelicula p : pe){
				peliculas.addElement(p.getNombreArticulo());
			}
			list.setModel(peliculas);
			
		}
		if(nombre == "SERIES"){
			DefaultListModel<String> series = new DefaultListModel<String>();
			ArrayList<Serie> se = bd.SelectData.selectSerie();
			for(Serie p : se){
				series.addElement(p.getNombreArticulo());
			}
			list.setModel(series);
		}
		if(nombre == "DOCUMENTALES"){
			DefaultListModel<String> documentales = new DefaultListModel<String>();
			ArrayList<Documental> de = bd.SelectData.selectDocumental();
			for(Documental p : de){
				documentales.addElement(p.getNombreArticulo());
			}
			list.setModel(documentales);
		}
		
		
		JButton btnAlquilar = new JButton("ALQUILAR");
		btnAlquilar.setBackground(new Color(0, 0, 0));
		btnAlquilar.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		btnAlquilar.setForeground(new Color(204, 204, 51));
		btnAlquilar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (u == null){
					
					JOptionPane.showMessageDialog(ListaPeliculas.this, "Debes iniciar sesión");
					ArrayList<Articulo> arts = bd.SelectData.selectArticulosDeArticulos();
					Articulo articulo = null;
					for (Articulo art : arts){
						if(art.getNombreArticulo().equals(list.getSelectedValue())){
							articulo = art;
						}
					}
					Login l = new Login(articulo);
					l.setVisible(true);
					
					dispose();
				}else{
					if(nombre == "PELICULAS"){
						
						ArrayList<Pelicula> pe = bd.SelectData.selectPelicula();
						Pelicula peli = null;
						for (Pelicula pp : pe){
							if(pp.getNombreArticulo().equals(list.getSelectedValue())){
								peli = pp;
							}
						}
						
						ArticuloEspecifico ae = new ArticuloEspecifico(peli, u);
						ae.setVisible(true);
						dispose();
						
					}
					if(nombre == "SERIES"){
						ArrayList<Serie> se = bd.SelectData.selectSerie();
						Serie serie = null;
						for ( Serie ss : se){
							if(ss.getNombreArticulo().equals(list.getSelectedValue())){
								serie=ss;
							}
						}
						ArticuloEspecifico ae = new ArticuloEspecifico(serie, u);
						ae.setVisible(true);
						dispose();
					}
					if(nombre == "DOCUMENTALES"){
						ArrayList<Documental> de = bd.SelectData.selectDocumental();
						Documental documental = null;
						for ( Documental dd : de){
							if ( dd.getNombreArticulo().equals(list.getSelectedValue())){
								documental = dd;
							}
						}
						ArticuloEspecifico ae = new ArticuloEspecifico(documental, u);
						ae.setVisible(true);
						dispose();
						
					}
					
					
				}
			}
		});
		btnAlquilar.setBounds(292, 474, 142, 29);
		contentPane.add(btnAlquilar);
		
		JLabel lblKapitalfilms = new JLabel("KAPITAL-FILMS");
		lblKapitalfilms.setForeground(new Color(204, 204, 51));
		lblKapitalfilms.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 58));
		lblKapitalfilms.setBackground(SystemColor.menu);
		lblKapitalfilms.setBounds(95, 0, 535, 68);
		contentPane.add(lblKapitalfilms);
		
		JLabel lblNewLabel = new JLabel(nombre);
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(204, 204, 51));
		lblNewLabel.setBounds(261, 97, 263, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\logo.PNG"));
		lblNewLabel_1.setBounds(19, 239, 193, 98);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("@KapitalFilms_");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo Insta.jpg"));
		lblNewLabel_2.setForeground(new Color(204, 204, 51));
		lblNewLabel_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(551, 254, 147, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo twitter.png"));
		lblNewLabel_1_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(551, 290, 147, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p =new Principal(u);
				p.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBackground(new Color(0, 0, 0));
		btnVolver.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		btnVolver.setForeground(new Color(204, 204, 51));
		btnVolver.setBounds(292, 519, 142, 29);
		contentPane.add(btnVolver);
		
		
		
		
		
	
		
		
		
		
	}
}
