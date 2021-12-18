package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import objetos.Articulo;
import objetos.Pelicula;
import registro.Usuario;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class ArticuloEspecifico extends JFrame {

	private JPanel contentPane;
	


	public ArticuloEspecifico(Articulo p, Usuario u) {
		setTitle("Informaci\u00F3n Pel\u00EDcula");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 746);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("A\u00D1ADIR PELICULA");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(204, 204, 51));
		btnNewButton.addActionListener(e->{
			
				
				if(u == null){
					JOptionPane.showMessageDialog(ArticuloEspecifico.this, "Debes iniciar sesión");
					Login log = new Login(p);
					log.setVisible(true);
					dispose();
				}else{
					Factura f = new Factura (u, p, ArticuloEspecifico.this);
					f.setVisible(true);
					
				}
			
		});
		btnNewButton.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		btnNewButton.setBounds(158, 513, 227, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VOLVER");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(204, 204, 51));
		btnNewButton_1.addActionListener(e->{
			
				Principal principal = new Principal(u);
				principal.setVisible(true);
				dispose();
			
		});
		btnNewButton_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		btnNewButton_1.setBounds(400, 513, 178, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNombrePelicula = new JLabel(p.getNombreArticulo());
		lblNombrePelicula.setForeground(new Color(204, 204, 51));
		lblNombrePelicula.setFont(new Font("Mongolian Baiti", Font.PLAIN, 27));
		lblNombrePelicula.setBounds(70, 107, 374, 57);
		contentPane.add(lblNombrePelicula);
		
		
		JTextArea textArea = new JTextArea(p.getDescripcion());
		
		textArea.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		textArea.setEditable(false);
		textArea.setBounds(25, 74, 599, 194);
		textArea.setLineWrap(true);
		
		
		JLabel lblPrecio_1 = new JLabel("Precio: "+p.getPrecioArticulo());
		lblPrecio_1.setForeground(new Color(204, 204, 51));
		lblPrecio_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		lblPrecio_1.setBounds(547, 122, 140, 42);
		contentPane.add(lblPrecio_1);
		if(u == null){
			
		}else{
			JLabel lblSaldo = new JLabel("Saldo: "+u.getSaldo());
			lblSaldo.setForeground(new Color(204, 204, 51));
			lblSaldo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
			lblSaldo.setBounds(547, 92, 140, 42);
			contentPane.add(lblSaldo);
		}
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 180, 599, 317);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
		JLabel lblKapitalfilms = new JLabel("KAPITAL-FILMS");
		lblKapitalfilms.setForeground(new Color(204, 204, 51));
		lblKapitalfilms.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 58));
		lblKapitalfilms.setBackground(SystemColor.menu);
		lblKapitalfilms.setBounds(97, 16, 558, 98);
		contentPane.add(lblKapitalfilms);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\logo.PNG"));
		lblNewLabel.setBounds(167, 576, 193, 98);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo Insta.jpg"));
		lblNewLabel_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(400, 597, 147, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("@KapitalFilms_");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo twitter.png"));
		lblNewLabel_2.setForeground(new Color(204, 204, 51));
		lblNewLabel_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(400, 633, 147, 20);
		contentPane.add(lblNewLabel_2);
		
		DefaultListModel<String> modelPeli = new DefaultListModel<String>();
	}
}