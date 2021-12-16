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
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Buscador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnAceptar;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblKapitalfilms;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Buscador(Usuario u , Principal p) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 776);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(146, 134, 376, 36);
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
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBackground(new Color(0, 0, 0));
		btnAceptar.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		btnAceptar.setForeground(new Color(204, 204, 51));
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
		scrollPane.setBounds(146, 200, 376, 332);
		contentPane.add(scrollPane);
		btnAceptar.setBounds(146, 561, 178, 29);
		contentPane.add(btnAceptar);
		scrollPane.setViewportView(list);
		
		btnCerrar = new JButton("CERRAR");
		btnCerrar.setForeground(new Color(204, 204, 51));
		btnCerrar.setBackground(new Color(0, 0, 0));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(363, 561, 159, 29);
		contentPane.add(btnCerrar);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\logo.PNG"));
		lblNewLabel.setBounds(158, 606, 193, 98);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo Insta.jpg"));
		lblNewLabel_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(391, 627, 147, 20);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("@KapitalFilms_");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo twitter.png"));
		lblNewLabel_2.setForeground(new Color(204, 204, 51));
		lblNewLabel_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(391, 663, 147, 20);
		contentPane.add(lblNewLabel_2);
		
		lblKapitalfilms = new JLabel("KAPITAL-FILMS");
		lblKapitalfilms.setForeground(new Color(204, 204, 51));
		lblKapitalfilms.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 58));
		lblKapitalfilms.setBackground(SystemColor.menu);
		lblKapitalfilms.setBounds(96, 20, 558, 98);
		contentPane.add(lblKapitalfilms);
		
		
		
		
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
