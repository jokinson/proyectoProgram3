package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objetos.Articulo;
import objetos.Documental;
import objetos.Pelicula;
import objetos.Serie;
import registro.Usuario;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.ScrollPane;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1140, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setFont(new Font("Arial", Font.PLAIN, 19));
		list.setBounds(35, 130, 394, 518);
		
		
		DefaultListModel<Articulo> model = new DefaultListModel<Articulo>();
		
		ArrayList<Articulo> articulos = bd.SelectData.selectArticulos();
		
		for (Articulo a : articulos){
			model.addElement(a);
		}
		list.setModel(model);
		
		JButton btnNewButton = new JButton("Anadir Articulo");
		
		btnNewButton.setBounds(654, 449, 272, 43);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(506, 63, 272, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(506, 161, 272, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCodigoDeArticulo = new JLabel("Codigo de tipo de Articulo");
		lblCodigoDeArticulo.setBounds(506, 27, 204, 20);
		contentPane.add(lblCodigoDeArticulo);
		
		JLabel lblNombreDeArticulo = new JLabel("Nombre de Articulo");
		lblNombreDeArticulo.setBounds(504, 133, 179, 20);
		contentPane.add(lblNombreDeArticulo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(506, 261, 272, 43);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrecioDeArticulo = new JLabel("Precio de Articulo (double)");
		lblPrecioDeArticulo.setBounds(506, 225, 242, 20);
		contentPane.add(lblPrecioDeArticulo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(506, 354, 272, 43);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(506, 320, 177, 20);
		contentPane.add(lblDescripcion);
		
		textField_4 = new JTextField();
		textField_4.setBounds(831, 61, 272, 47);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(831, 27, 127, 20);
		contentPane.add(lblCategoria);
		
		textField_5 = new JTextField();
		textField_5.setBounds(831, 161, 272, 43);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setBounds(831, 133, 95, 20);
		contentPane.add(lblDuracion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 114, 404, 534);
		scrollPane.setViewportView(list);
		contentPane.add(scrollPane);
		
		
		
		JLabel lblTemporadas = new JLabel("Temporadas");
		lblTemporadas.setBounds(831, 225, 138, 20);
		contentPane.add(lblTemporadas);
		
		textField_6 = new JTextField();
		textField_6.setBounds(831, 261, 272, 43);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnEliminarArticulo = new JButton("Eliminar Articulo");
		
		
		JLabel lblEpisodios = new JLabel("Episodios");
		lblEpisodios.setBounds(831, 320, 148, 20);
		contentPane.add(lblEpisodios);
		
		textField_7 = new JTextField();
		textField_7.setBounds(831, 354, 272, 43);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		textField_6.setVisible(false);
		lblEpisodios.setVisible(false);
		lblTemporadas.setVisible(false);
		textField_7.setVisible(false);
		
		JButton btnNewButton_1 = new JButton("Eliminar Usuario");
		btnNewButton_1.setVisible(false);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().toString()=="Serie"){
					textField_6.setVisible(true);
					lblEpisodios.setVisible(true);
					lblTemporadas.setVisible(true);
					textField_7.setVisible(true);
					textField.setText("2");
					DefaultListModel<Serie> series = new DefaultListModel<Serie>();
					ArrayList<Serie> serie = bd.SelectData.selectSerie();
					for(Serie s : serie ){
						series.addElement(s);
					}
					list.setModel(series);
				}if(comboBox.getSelectedItem().toString()=="Pelicula"){
					textField_6.setVisible(false);
					lblEpisodios.setVisible(false);
					lblTemporadas.setVisible(false);
					textField_7.setVisible(false);
					textField.setText("1");
					DefaultListModel<Pelicula> peliculas = new DefaultListModel<Pelicula>();
					ArrayList<Pelicula> pelicula = bd.SelectData.selectPelicula();
					for(Pelicula p : pelicula ){
						peliculas.addElement(p);
					}
					list.setModel(peliculas);
					
				}if(comboBox.getSelectedItem().toString()=="Documental"){
					textField_6.setVisible(false);
					lblEpisodios.setVisible(false);
					lblTemporadas.setVisible(false);
					textField_7.setVisible(false);
					textField.setText("3");
					DefaultListModel<Documental>documentales = new DefaultListModel<Documental>();
					ArrayList<Documental> documental = bd.SelectData.selectDocumental();
					for(Documental d : documental ){
						documentales.addElement(d);
					}
					list.setModel(documentales);
				}
				if(comboBox.getSelectedItem().toString()=="Anadir Articulo"){
					textField_6.setVisible(false);
					lblEpisodios.setVisible(false);
					lblTemporadas.setVisible(false);
					textField_7.setVisible(false);
					DefaultListModel<Articulo>articulos = new DefaultListModel<Articulo>();
					ArrayList<Articulo> art = bd.SelectData.selectArticulos();
					for(Articulo a : art ){
						articulos.addElement(a);
					}
					list.setModel(articulos);
				}
				
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Anadir Articulo", "Pelicula", "Serie", "Documental"}));
		comboBox.setBounds(210, 24, 228, 43);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox_1.getSelectedItem().toString()=="Usuarios"){
					textField.setVisible(false);
					textField_1.setVisible(false);
					textField_2.setVisible(false);
					textField_3.setVisible(false);
					textField_4.setVisible(false);
					textField_5.setVisible(false);
					textField_6.setVisible(false);
					textField_7.setVisible(false);
					lblCodigoDeArticulo.setVisible(false);
					lblNombreDeArticulo.setVisible(false);
					lblPrecioDeArticulo.setVisible(false);
					lblDescripcion.setVisible(false);
					lblCategoria.setVisible(false);
					lblDuracion.setVisible(false);
					lblEpisodios.setVisible(false);
					lblTemporadas.setVisible(false);
					btnNewButton.setVisible(false);
					btnNewButton_1.setVisible(true);
					comboBox.setVisible(false);
					btnEliminarArticulo.setVisible(false);
					
					
					
					DefaultListModel<Usuario> usuarios = new DefaultListModel<Usuario>();
					ArrayList<Usuario> usuario = bd.SelectData.selectUsuario();
					for(Usuario u : usuario){
						usuarios.addElement(u);
					}
					list.setModel(usuarios);
				}if(comboBox_1.getSelectedItem().toString()=="Articulos"){
					
					textField.setVisible(true);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					textField_3.setVisible(true);
					textField_4.setVisible(true);
					textField_5.setVisible(true);
					if(comboBox.getSelectedItem().toString() == "Serie"){
						textField_6.setVisible(true);
						textField_7.setVisible(true);
						lblEpisodios.setVisible(true);
						lblTemporadas.setVisible(true);
					}
					
					lblCodigoDeArticulo.setVisible(true);
					lblNombreDeArticulo.setVisible(true);
					lblPrecioDeArticulo.setVisible(true);
					lblDescripcion.setVisible(true);
					lblCategoria.setVisible(true);
					lblDuracion.setVisible(true);
					
					btnNewButton.setVisible(true);
					btnNewButton_1.setVisible(false);
					comboBox.setVisible(true);
					
					DefaultListModel<Articulo> model = new DefaultListModel<Articulo>();
					ArrayList<Articulo> articulos = bd.SelectData.selectArticulos();
					for (Articulo a : articulos){
						model.addElement(a);
					}
					list.setModel(model);
				}
				
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Articulos", "Usuarios"}));
		comboBox_1.setBounds(35, 24, 113, 43);
		contentPane.add(comboBox_1);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuario usu = (Usuario) list.getSelectedValue();
				bd.DeleteData.deleteUsuario(usu.getNombreUsuario());
				
				DefaultListModel<Usuario> usuarios = new DefaultListModel<Usuario>();
				ArrayList<Usuario> usuario = bd.SelectData.selectUsuario();
				for(Usuario u : usuario){
					usuarios.addElement(u);
				}
				list.setModel(usuarios);
				
			}
		});
		btnNewButton_1.setBounds(506, 619, 288, 29);
		contentPane.add(btnNewButton_1);
		
		
		btnEliminarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Articulo art = (Articulo) list.getSelectedValue();
				bd.DeleteData.deleteArticulo(art.getNombreArticulo(), art.getCodigoTipo());
				
				DefaultListModel<Articulo> articulos = new DefaultListModel<Articulo>();
				ArrayList<Articulo> arti = bd.SelectData.selectArticulos();
				for(Articulo a : arti){
					articulos.addElement(a);
				}
				list.setModel(articulos);
			}
		});
		btnEliminarArticulo.setBounds(506, 574, 288, 29);
		contentPane.add(btnEliminarArticulo);
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String codigo = textField.getText();
				int codigoTipo = Integer.parseInt(codigo);
				String nombreArticulo = textField_1.getText();
				String p = textField_2.getText();
				double precioArticulo = Double.parseDouble(p);
				String descripcion = textField_3.getText();
				String categoria = textField_4.getText();
				String d = textField_5.getText();
				int duracion = Integer.parseInt(d);
				
				
				
				if(codigoTipo==1){
					bd.SelectData.insertPelicula(codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion);
				}
				if(codigoTipo==2){
					String l = textField_6.getText();
					int temporadas = Integer.parseInt(l);
					String ll = textField_7.getText();
					int episodios = Integer.parseInt(ll);
					bd.SelectData.insertSerie(codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion, temporadas, episodios);
				}
				if(codigoTipo==3){
					bd.SelectData.insertDocumental(codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion);
				}
				
				
				
				DefaultListModel<Articulo> model = new DefaultListModel<Articulo>();
				
				ArrayList<Articulo> articulos = bd.SelectData.selectArticulos();
				
				for (Articulo a : articulos){
					model.addElement(a);
				}
				list.setModel(model);
				
				JOptionPane.showMessageDialog(Admin.this, "Se ha insertado con exito!");
				
				
			}
		});
		
		
	}
}
