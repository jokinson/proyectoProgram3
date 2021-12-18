package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objetos.Articulo;
import registro.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Factura extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Factura(Usuario u, Articulo a,ArticuloEspecifico art) {
		setTitle("Factura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSaldoDisponible = new JLabel("Saldo Disponible:");
		lblSaldoDisponible.setForeground(new Color(204, 204, 51));
		lblSaldoDisponible.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblSaldoDisponible.setBounds(49, 66, 140, 20);
		contentPane.add(lblSaldoDisponible);
		
		JLabel lblPrecioDelArticulo = new JLabel("Precio del Articulo:");
		lblPrecioDelArticulo.setForeground(new Color(204, 204, 51));
		lblPrecioDelArticulo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblPrecioDelArticulo.setBounds(49, 125, 154, 20);
		contentPane.add(lblPrecioDelArticulo);
		
		JLabel label = new JLabel("-------------------------------------------------");
		label.setForeground(new Color(204, 204, 51));
		label.setBounds(49, 161, 472, 20);
		contentPane.add(label);
		
		JLabel lblNuevoSaldo = new JLabel("Nuevo Saldo: ");
		lblNuevoSaldo.setForeground(new Color(204, 204, 51));
		lblNuevoSaldo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblNuevoSaldo.setBounds(49, 196, 135, 20);
		contentPane.add(lblNuevoSaldo);
		
		JLabel lblSaldo = new JLabel(u.getSaldo()+"");
		lblSaldo.setForeground(new Color(204, 204, 51));
		lblSaldo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblSaldo.setBounds(231, 66, 69, 20);
		contentPane.add(lblSaldo);
		
		JLabel lblPrecio = new JLabel(a.getPrecioArticulo()+"");
		lblPrecio.setForeground(new Color(204, 204, 51));
		lblPrecio.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblPrecio.setBounds(231, 125, 69, 20);
		contentPane.add(lblPrecio);
		
		double nuevoSaldo = nuevoSaldo(u, a);
		
		JLabel lblNuevo = new JLabel(nuevoSaldo+"");
		lblNuevo.setForeground(new Color(204, 204, 51));
		lblNuevo.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblNuevo.setBounds(231, 197, 69, 20);
		contentPane.add(lblNuevo);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(new Color(204, 204, 51));
		btnAceptar.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		btnAceptar.setBackground(new Color(0, 0, 0));
		btnAceptar.addActionListener(e->{
			
				boolean ñ = false;
				ArrayList<Articulo> articulos = bd.SelectData.selectArticulosUsuario(u);
				for(Articulo ar : articulos){
					if(ar.getCodigoArticulo() == a.getCodigoArticulo()){
						ñ = true;
					}
				}
				if ( ñ==false){
					if(nuevoSaldo>=0){
						u.setSaldo(nuevoSaldo);
						Usuario usuarioNuevo = new Usuario(u.getCodUsuario(), u.getNombreCompleto(), u.getEdad(), u.getNombreUsuario(),u.getContrasena(),u.getSaldo(),u.getEsAdmin());
						bd.SelectData.insertUsuarioNuevo(usuarioNuevo);
						
						
						bd.SelectData.insertPeliculaUsuario(u, a);
						
						bd.SelectData.incrementarTendencia(a);
						
						JOptionPane.showMessageDialog(Factura.this, "Gracias por la compra!");
						art.dispose();
						ArticuloEspecifico artE = new ArticuloEspecifico (a,u);
						artE.setVisible(true);
						dispose();
					}else{
						JOptionPane.showMessageDialog(Factura.this, "No dispones de suficiente saldo");
						VUsuario vu = new VUsuario(u, a);
						vu.setVisible(true);
						art.dispose();
						dispose();
					}
					
				}else{
					JOptionPane.showMessageDialog(Factura.this, "Ya tienes este articulo");
					dispose();
				}
				
				
				
				
			
		});
		btnAceptar.setBounds(49, 261, 115, 29);
		contentPane.add(btnAceptar);
		
		JButton btnRechazar = new JButton("Rechazar");
		btnRechazar.setForeground(new Color(204, 204, 51));
		btnRechazar.setFont(new Font("Mongolian Baiti", Font.PLAIN, 19));
		btnRechazar.setBackground(new Color(0, 0, 0));
		btnRechazar.addActionListener(e->{
			
				
				dispose();
				
			
		});
		btnRechazar.setBounds(185, 261, 115, 29);
		contentPane.add(btnRechazar);
		
		JLabel lblFactura = new JLabel("FACTURA");
		lblFactura.setForeground(new Color(255, 215, 0));
		lblFactura.setBackground(Color.WHITE);
		lblFactura.setFont(new Font("Mongolian Baiti", Font.PLAIN, 26));
		lblFactura.setBounds(114, 16, 140, 20);
		contentPane.add(lblFactura);
	}
	public static double nuevoSaldo(Usuario u, Articulo a){
		
		
		
		
		return u.getSaldo()-a.getPrecioArticulo();
		
	}
}
