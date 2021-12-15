package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objetos.Articulo;
import registro.Usuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;

public class Buscador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnAceptar;
	private JButton btnCerrar;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Buscador(Usuario u , Principal p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 591);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(189, 46, 300, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JList list = new JList();
		list.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		list.setBounds(189, 113, 300, 332);
		
		
		DefaultListModel<Articulo> model = new DefaultListModel<Articulo>();
		ArrayList<Articulo> articulos = bd.SelectData.selectArticulosDeArticulos();
		for (Articulo a : articulos){
			model.addElement(a);
		}
		list.setModel(model);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Articulo art = (Articulo) list.getSelectedValue();
				
				ArticuloEspecifico ae = new ArticuloEspecifico(art, u);
				ae.setVisible(true);
				dispose();
				p.dispose();
				
				
				
			}
		});
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(189, 113, 300, 332);
		contentPane.add(scrollPane);
		btnAceptar.setBounds(209, 474, 115, 29);
		contentPane.add(btnAceptar);
		scrollPane.setViewportView(list);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(363, 474, 115, 29);
		contentPane.add(btnCerrar);
		
		
		
		
	textField.addKeyListener(new KeyAdapter() {
	            
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
