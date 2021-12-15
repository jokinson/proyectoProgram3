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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.AdjustmentEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

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
	private JTextField bTextF;

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
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if (list.getSelectedValue()!=null){
					JOptionPane.showMessageDialog(Admin.this, list.getSelectedValue());
				}
				
			}
		});
		list.setForeground(new Color(0, 0, 0));
		list.setBackground(new Color(255, 255, 255));
		list.setFont(new Font("Mongolian Baiti", Font.PLAIN, 21));
		list.setBounds(35, 130, 394, 518);
		
		
		DefaultListModel<Articulo> model = new DefaultListModel<Articulo>();
		
		ArrayList<Articulo> articulos = bd.SelectData.selectArticulos();
		
		for (Articulo a : articulos){
			model.addElement(a);
		}
		list.setModel(model);
		
		JButton btnNewButton = new JButton("Anadir Articulo");
		btnNewButton.setForeground(new Color(204, 204, 51));
		btnNewButton.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		btnNewButton.setBackground(SystemColor.desktop);
		
		btnNewButton.setBounds(654, 449, 272, 43);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(506, 63, 272, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBounds(506, 161, 272, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCodigoDeArticulo = new JLabel("Codigo de tipo de Articulo");
		lblCodigoDeArticulo.setForeground(new Color(204, 204, 51));
		lblCodigoDeArticulo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblCodigoDeArticulo.setBackground(new Color(0, 0, 0));
		lblCodigoDeArticulo.setBounds(506, 27, 204, 20);
		contentPane.add(lblCodigoDeArticulo);
		
		JLabel lblNombreDeArticulo = new JLabel("Nombre de Articulo");
		lblNombreDeArticulo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblNombreDeArticulo.setForeground(new Color(204, 204, 51));
		lblNombreDeArticulo.setBounds(504, 133, 179, 20);
		contentPane.add(lblNombreDeArticulo);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setBounds(506, 261, 272, 43);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrecioDeArticulo = new JLabel("Precio de Articulo (double)");
		lblPrecioDeArticulo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblPrecioDeArticulo.setForeground(new Color(204, 204, 51));
		lblPrecioDeArticulo.setBounds(506, 225, 242, 20);
		contentPane.add(lblPrecioDeArticulo);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 255));
		textField_3.setBounds(506, 354, 272, 43);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblDescripcion.setBackground(new Color(240, 240, 240));
		lblDescripcion.setForeground(new Color(204, 204, 51));
		lblDescripcion.setBounds(506, 320, 177, 20);
		contentPane.add(lblDescripcion);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 255, 255));
		textField_4.setBounds(831, 61, 272, 47);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblCategoria.setForeground(new Color(204, 204, 51));
		lblCategoria.setBounds(831, 27, 127, 20);
		contentPane.add(lblCategoria);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(255, 255, 255));
		textField_5.setBounds(831, 161, 272, 43);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblDuracion.setForeground(new Color(204, 204, 51));
		lblDuracion.setBounds(831, 133, 95, 20);
		contentPane.add(lblDuracion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 161, 404, 487);
		scrollPane.setViewportView(list);
		contentPane.add(scrollPane);
		
		
		
		JLabel lblTemporadas = new JLabel("Temporadas");
		lblTemporadas.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblTemporadas.setForeground(new Color(204, 204, 51));
		lblTemporadas.setBounds(831, 225, 138, 20);
		contentPane.add(lblTemporadas);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(255, 255, 255));
		textField_6.setBounds(831, 261, 272, 43);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnEliminarArticulo = new JButton("Eliminar Articulo");
		btnEliminarArticulo.setBackground(new Color(0, 0, 0));
		btnEliminarArticulo.setForeground(new Color(204, 204, 51));
		btnEliminarArticulo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		
		
		JLabel lblEpisodios = new JLabel("Episodios");
		lblEpisodios.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblEpisodios.setForeground(new Color(204, 204, 51));
		lblEpisodios.setBounds(831, 320, 148, 20);
		contentPane.add(lblEpisodios);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(255, 255, 255));
		textField_7.setBounds(831, 354, 272, 43);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		textField_6.setVisible(false);
		lblEpisodios.setVisible(false);
		lblTemporadas.setVisible(false);
		textField_7.setVisible(false);
		
		JButton btnNewButton_1 = new JButton("Eliminar Usuario");
		btnNewButton_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		btnNewButton_1.setForeground(new Color(204, 204, 51));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setVisible(false);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setForeground(new Color(204, 204, 51));
		comboBox.setFont(new Font("Mongolian Baiti", Font.PLAIN, 17));
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
		comboBox_1.setBackground(new Color(0, 0, 0));
		comboBox_1.setForeground(new Color(204, 204, 51));
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
					bTextF.setVisible(false);
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
		btnNewButton_1.setBounds(506, 605, 228, 43);
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
		btnEliminarArticulo.setBounds(506, 548, 228, 43);
		contentPane.add(btnEliminarArticulo);
		
		bTextF = new JTextField();
		bTextF.setBounds(35, 98, 404, 43);
		contentPane.add(bTextF);
		bTextF.setColumns(10);
		
		
		
		
		
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
		
		
		
		bTextF.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(KeyEvent e) {//Se ejecuta cuando se libera una tecla
                JTextField textField = (JTextField) e.getSource();
                //obtiene contenido del textfield
                String text = textField.getText();
                if (text.trim().length() > 0) {
                    //nuevo Model temporal
                    DefaultListModel<Articulo> tmp = new DefaultListModel<Articulo>();
                    for (int i = 0; i < model.getSize(); i++) {//recorre Model original
                        //si encuentra coincidencias agrega a model temporal
                        if (model.getElementAt(i).getNombreArticulo().toLowerCase().contains(text.toLowerCase())) {
                            tmp.addElement(model.getElementAt(i));
                        }
                    }
                    //agrega nuevo modelo a JList
                    list.setModel(tmp);
                } else {//si esta vacio muestra el Model original
                    list.setModel(model);
                }
            }
        });
		
		
	}
}
