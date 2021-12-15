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
import java.awt.event.ActionEvent;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSaldoDisponible = new JLabel("Saldo Disponible:");
		lblSaldoDisponible.setBounds(49, 66, 227, 20);
		contentPane.add(lblSaldoDisponible);
		
		JLabel lblPrecioDelArticulo = new JLabel("Precio del Articulo:");
		lblPrecioDelArticulo.setBounds(49, 125, 154, 20);
		contentPane.add(lblPrecioDelArticulo);
		
		JLabel label = new JLabel("-------------------------------------------------");
		label.setBounds(49, 161, 472, 20);
		contentPane.add(label);
		
		JLabel lblNuevoSaldo = new JLabel("Nuevo Saldo: ");
		lblNuevoSaldo.setBounds(49, 196, 135, 20);
		contentPane.add(lblNuevoSaldo);
		
		JLabel lblSaldo = new JLabel(u.getSaldo()+"");
		lblSaldo.setBounds(231, 66, 69, 20);
		contentPane.add(lblSaldo);
		
		JLabel lblPrecio = new JLabel(a.getPrecioArticulo()+"");
		lblPrecio.setBounds(231, 125, 69, 20);
		contentPane.add(lblPrecio);
		
		double nuevoSaldo = u.getSaldo()-a.getPrecioArticulo();
		
		JLabel lblNuevo = new JLabel(nuevoSaldo+"");
		lblNuevo.setBounds(231, 197, 69, 20);
		contentPane.add(lblNuevo);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nuevoSaldo>=0){
					u.setSaldo(nuevoSaldo);
					Usuario usuarioNuevo = new Usuario(u.getCodUsuario(), u.getNombreCompleto(), u.getEdad(), u.getNombreUsuario(),u.getContrasena(),u.getSaldo(),u.getEsAdmin());
					bd.SelectData.insertUsuarioNuevo(usuarioNuevo);
					bd.SelectData.insertPeliculaUsuario(u, a);
					
					JOptionPane.showMessageDialog(Factura.this, "Gracias por la compra!");
					dispose();
				}else{
					JOptionPane.showMessageDialog(Factura.this, "No dispones de suficiente saldo");
					VUsuario vu = new VUsuario(u);
					vu.setVisible(true);
					art.dispose();
					dispose();
				}
				
				
				
			}
		});
		btnAceptar.setBounds(49, 261, 115, 29);
		contentPane.add(btnAceptar);
		
		JButton btnRechazar = new JButton("Rechazar");
		btnRechazar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		btnRechazar.setBounds(185, 261, 115, 29);
		contentPane.add(btnRechazar);
	}
}
