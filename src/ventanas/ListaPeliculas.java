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
		setBounds(100, 100, 552, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(40, 75, 272, 292);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 75, 271, 292);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(list);
		
		DefaultListModel<String> peliculas = new DefaultListModel<String>();
		ArrayList<Pelicula> pe = bd.SelectData.selectPelicula();
		for(Pelicula p : pe){
			peliculas.addElement(p.getNombreArticulo());
		}
		list.setModel(peliculas);
		
		JButton btnAlquilar = new JButton("Alquilar");
		btnAlquilar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (u == null){
					
					JOptionPane.showMessageDialog(ListaPeliculas.this, "Debes iniciar sesión");
					
					Login l = new Login();
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
		btnAlquilar.setBounds(400, 371, 115, 29);
		contentPane.add(btnAlquilar);
		
	
		
		
		
		
	}
}
