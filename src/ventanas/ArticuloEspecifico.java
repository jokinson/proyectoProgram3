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

public class ArticuloEspecifico extends JFrame {

	private JPanel contentPane;
	private JFrame ventana;


	public ArticuloEspecifico(Articulo p, Usuario u) {
		setTitle("Informaci\u00F3n Pel\u00EDcula");
		this.ventana=ventana;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 394);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("A\u00F1adir pelicula");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre =u.getNombreUsuario();
				
						
				double precio = p.getPrecioArticulo();	
				double antiguoSaldo = u.getSaldo();
				double saldoFinal = antiguoSaldo - precio;
				if(saldoFinal>=0.0){
					u.setSaldo(saldoFinal);
					for(Usuario p : usuarios1){
						if(p.getNombreUsuario().equals(u.getNombreUsuario())){
							Ficheros.escribirSaldoNuevo(usuarios1, u, saldoFinal);
							JOptionPane.showMessageDialog(PantallaPDisponibles.this, "Compra realizada correctamente");
							
						}
					}
				}else{
					
					JOptionPane.showMessageDialog(PantallaPDisponibles.this, "No dispone de suficiente saldo, porfavor recarge saldo y vuelva a intentarlo");
				}
				
			
				
				ArrayList<Usuario>usuarios=Ficheros.leerUsuarios();
				for(int i=0; i<usuarios.size();i++){
					if(usuarios.get(i).getNombreUsuario().equals(nombre)){
						Usuario usuario = new Usuario(usuarios.get(i).getNombreUsuario(),usuarios.get(i).getPass(),usuarios.get(i).getSaldo(),peliculas);
						usuarios.remove(i);
						usuarios.add(usuario);
					}
				}
				
				Ficheros.escribirUsuarios(usuarios);
				PantallaPrincipal panel= new PantallaPrincipal(u);
				panel.setVisible(true);
				PantallaPDisponibles.this.dispose();
				
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(30, 292, 178, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal principal = new Principal(u);
				principal.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.setBounds(234, 292, 178, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNombrePelicula = new JLabel(p.getNombreArticulo());
		lblNombrePelicula.setForeground(Color.WHITE);
		lblNombrePelicula.setFont(new Font("Baskerville Old Face", Font.PLAIN, 27));
		lblNombrePelicula.setBounds(30, 29, 213, 29);
		contentPane.add(lblNombrePelicula);
		
		
		JTextArea textArea = new JTextArea(p.getDescripcion());
		
		textArea.setFont(new Font("Baskerville Old Face", Font.PLAIN, 19));
		textArea.setEditable(false);
		textArea.setBounds(25, 74, 599, 194);
		contentPane.add(textArea);
		
		JLabel lblPrecio_1 = new JLabel("Precio: "+p.getPrecioArticulo());
		lblPrecio_1.setForeground(Color.WHITE);
		lblPrecio_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblPrecio_1.setBounds(512, 24, 140, 42);
		contentPane.add(lblPrecio_1);
		
		JLabel lblSaldo = new JLabel("Saldo: "+u.getSaldo());
		lblSaldo.setForeground(Color.WHITE);
		lblSaldo.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblSaldo.setBounds(512, 0, 129, 30);
		contentPane.add(lblSaldo);
		DefaultListModel<String> modelPeli = new DefaultListModel<String>();
	}
}