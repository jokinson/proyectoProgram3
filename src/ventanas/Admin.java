package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objetos.Articulo;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		setBounds(100, 100, 866, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVentanaAdmin = new JLabel("Ventana Admin");
		lblVentanaAdmin.setFont(new Font("Arial", Font.PLAIN, 22));
		lblVentanaAdmin.setBounds(15, 16, 261, 64);
		contentPane.add(lblVentanaAdmin);
		
		JList list = new JList();
		list.setFont(new Font("Arial", Font.PLAIN, 19));
		list.setBounds(35, 130, 394, 518);
		contentPane.add(list);
		
		DefaultListModel<Articulo> model = new DefaultListModel<Articulo>();
		
		ArrayList<Articulo> articulos = bd.SelectData.selectArticulos();
		
		for (Articulo a : articulos){
			model.addElement(a);
		}
		list.setModel(model);
		
		JButton btnNewButton = new JButton("A\u00F1adir Articulo");
		
		btnNewButton.setBounds(506, 605, 272, 43);
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
		textField_4.setBounds(506, 447, 272, 47);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(506, 413, 127, 20);
		contentPane.add(lblCategoria);
		
		textField_5 = new JTextField();
		textField_5.setBounds(506, 533, 272, 43);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setBounds(506, 497, 95, 20);
		contentPane.add(lblDuracion);
		
		JScrollBar scrollBar = new JScrollBar();
		
		scrollBar.setBounds(430, 130, 26, 518);
		contentPane.add(scrollBar);
		
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
				
				
				if(codigoTipo == 1){
					bd.SelectData.insertPelicula(codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion);
				}
				if(codigoTipo == 2){
					int temporadas = 0;
					int episodios = 0;
					bd.SelectData.insertSerie(codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion, temporadas, episodios);
				}
				if(codigoTipo == 3){
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
