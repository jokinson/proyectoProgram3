package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objetos.Articulo;
import objetos.Pelicula;
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
	public ListaPeliculas(Usuario u) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 588);
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
		
		DefaultListModel<String> peliculas = new DefaultListModel<String>();
		ArrayList<Pelicula> pe = bd.SelectData.selectPelicula();
		for(Pelicula p : pe){
			peliculas.addElement(p.getNombreArticulo());
		}
		list.setModel(peliculas);
		
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
		
		JLabel lblNewLabel = new JLabel("PEL\u00CDCULAS:");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(204, 204, 51));
		lblNewLabel.setBounds(292, 97, 170, 41);
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
		
		
		
	
		
		
		
		
	}
}
