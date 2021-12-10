package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import objetos.Articulo;
import registro.Usuario;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Label;
import javax.swing.JTextPane;

public class Principal extends JFrame {

	private JPanel contentPane;
	
	Usuario u;
	/*
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario usuario = null;
					Principal frame = new Principal(usuario);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	public Usuario getU() {
		return u;
	}




	public void setU(Usuario u) {
		this.u = u;
	}




	/**
	 * Create the frame.
	 */
	public Principal(Usuario usuario) {
		this.u = usuario;
		setTitle("Principal");
		ArrayList<Articulo> articulos = bd.SelectData.selectArticulosDeArticulos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1052, 1020);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKapitalfilms = new JLabel("KAPITAL-FILMS");
		lblKapitalfilms.setBackground(new Color(240, 240, 240));
		lblKapitalfilms.setForeground(new Color(204, 204, 51));
		lblKapitalfilms.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 58));
		lblKapitalfilms.setBounds(239, 16, 558, 98);
		contentPane.add(lblKapitalfilms);
		
		JButton btnNewButton = new JButton("PELICULAS");
		btnNewButton.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaPeliculas l = new ListaPeliculas(usuario);
				l.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(204, 204, 51));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(72, 130, 221, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("ABOUT US");
		btnNewButton_3.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		btnNewButton_3.setForeground(new Color(204, 204, 51));
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setBounds(777, 130, 174, 46);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("SERIES");
		btnNewButton_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		btnNewButton_1.setForeground(new Color(204, 204, 51));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(308, 130, 221, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DOCUMENTALES");
		btnNewButton_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		btnNewButton_2.setForeground(new Color(204, 204, 51));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(544, 130, 215, 46);
		contentPane.add(btnNewButton_2);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.BLACK);
		desktopPane.setBounds(82, 266, 736, 272);
		contentPane.add(desktopPane);
		
		JButton btnNewButton_4 = new JButton("Titanic");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					for(Articulo a : articulos){
						if(a.getCodigoArticulo() == 59){
							ArticuloEspecifico ae = new ArticuloEspecifico(a, usuario);
							ae.setVisible(true);
							dispose();
						}
					}
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Titanic.jpg"));
		btnNewButton_4.setBounds(0, 0, 169, 236);
		desktopPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Avatar");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Articulo a : articulos){
					if(a.getCodigoArticulo() == 1){
						ArticuloEspecifico ae = new ArticuloEspecifico(a, usuario);
						ae.setVisible(true);
						dispose();
					}
				}
				
			}
		});
		btnNewButton_4_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Avatar.jpg"));
		btnNewButton_4_1.setBounds(171, 0, 184, 236);
		desktopPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("");
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Articulo a : articulos){
					if(a.getCodigoArticulo() == 14){
						ArticuloEspecifico ae = new ArticuloEspecifico(a, usuario);
						ae.setVisible(true);
						dispose();
					}
				}
				
			}
		});
		btnNewButton_4_1_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Harry Potter.jpg"));
		btnNewButton_4_1_1.setBounds(356, 0, 177, 236);
		desktopPane.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_5 = new JButton("New button");
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerMas vm= new VerMas();
				vm.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Ver mas.png"));
		btnNewButton_5.setBounds(533, 0, 189, 236);
		desktopPane.add(btnNewButton_5);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(getU() == null){
					//vamos al login
					JOptionPane.showMessageDialog(Principal.this, "Debes iniciar sesión");
					Login log = new Login();
					log.setVisible(true);
					dispose();
					
				}else{
					//no hacemos nadda
					
					VUsuario usu = new VUsuario(usuario);
					usu.setVisible(true);
					dispose();
				}
			}
		});
		button.setBackground(new Color(255, 255, 255));
		button.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\usuario1.png"));
		button.setBounds(901, 0, 129, 115);
		contentPane.add(button);
		
		JLabel lblComprasPopulares = new JLabel("M\u00C1S VECES COMPRADAS");
		lblComprasPopulares.setForeground(new Color(204, 204, 51));
		lblComprasPopulares.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
		lblComprasPopulares.setBounds(82, 210, 414, 52);
		contentPane.add(lblComprasPopulares);
		
		JLabel lblTopTendencias = new JLabel("TOP 5 TENDENCIAS AHORA");
		lblTopTendencias.setForeground(new Color(204, 204, 51));
		lblTopTendencias.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
		lblTopTendencias.setBounds(82, 539, 414, 52);
		contentPane.add(lblTopTendencias);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(new Color(0, 0, 0));
		desktopPane_1.setBounds(82, 595, 893, 285);
		contentPane.add(desktopPane_1);
		
		JLabel label = new JLabel("01");
		label.setFont(new Font("Mongolian Baiti", Font.PLAIN, 45));
		label.setBounds(64, 232, 46, 64);
		desktopPane_1.add(label);
		label.setForeground(new Color(204, 204, 51));
		
		JButton btnNewButton_4_2 = new JButton("");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Articulo a : articulos){
					if(a.getCodigoArticulo() == 52){
						ArticuloEspecifico ae = new ArticuloEspecifico(a, usuario);
						ae.setVisible(true);
						dispose();
					}
				}
				
			}
		});
		btnNewButton_4_2.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Lupin.jpg"));
		btnNewButton_4_2.setBounds(0, 0, 169, 245);
		desktopPane_1.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_1_2 = new JButton("");
		btnNewButton_4_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Articulo a : articulos){
					if(a.getCodigoArticulo() == 60){
						ArticuloEspecifico ae = new ArticuloEspecifico(a, usuario);
						ae.setVisible(true);
						dispose();
					}
				}
				
			}
		});
		btnNewButton_4_1_2.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\La casa de papel.jpg"));
		btnNewButton_4_1_2.setBounds(171, 0, 184, 245);
		desktopPane_1.add(btnNewButton_4_1_2);
		
		JButton btnNewButton_4_1_1_1 = new JButton("");
		btnNewButton_4_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Articulo a : articulos){
					if(a.getCodigoArticulo() == 61){
						ArticuloEspecifico ae = new ArticuloEspecifico(a, usuario);
						ae.setVisible(true);
						dispose();
					}
				}
				
			}
		});
		btnNewButton_4_1_1_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Venom.jpg"));
		btnNewButton_4_1_1_1.setBounds(356, 0, 177, 245);
		desktopPane_1.add(btnNewButton_4_1_1_1);
		
		JButton btnNewButton_5_1 = new JButton("");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Articulo a : articulos){
					if(a.getCodigoArticulo() == 62){
						ArticuloEspecifico ae = new ArticuloEspecifico(a, usuario);
						ae.setVisible(true);
						dispose();
					}
				}
				
			}
		});
		btnNewButton_5_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Blacklist.jpg"));
		btnNewButton_5_1.setBounds(533, 0, 189, 245);
		desktopPane_1.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_1_1 = new JButton("");
		btnNewButton_5_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Articulo a : articulos){
					if(a.getCodigoArticulo() == 63){
						ArticuloEspecifico ae = new ArticuloEspecifico(a, usuario);
						ae.setVisible(true);
						dispose();
					}
				}
				
			}
		});
		btnNewButton_5_1_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\The good doctor.jpg"));
		btnNewButton_5_1_1.setBounds(723, 0, 169, 245);
		desktopPane_1.add(btnNewButton_5_1_1);
		
		JLabel label_1 = new JLabel("02");
		label_1.setForeground(new Color(204, 204, 51));
		label_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 45));
		label_1.setBounds(229, 232, 46, 64);
		desktopPane_1.add(label_1);
		
		JLabel label_1_1 = new JLabel("03");
		label_1_1.setForeground(new Color(204, 204, 51));
		label_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 45));
		label_1_1.setBounds(410, 232, 46, 64);
		desktopPane_1.add(label_1_1);
		
		JLabel label_1_1_1 = new JLabel("04");
		label_1_1_1.setForeground(new Color(204, 204, 51));
		label_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 45));
		label_1_1_1.setBounds(618, 232, 46, 64);
		desktopPane_1.add(label_1_1_1);
		
		JLabel label_1_1_1_1 = new JLabel("05");
		label_1_1_1_1.setForeground(new Color(204, 204, 51));
		label_1_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 45));
		label_1_1_1_1.setBounds(778, 232, 46, 64);
		desktopPane_1.add(label_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("@KapitalFilms_");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(204, 204, 51));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo Insta.jpg"));
		lblNewLabel.setBounds(459, 883, 147, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@KapitalFilms_");
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(new Color(204, 204, 51));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Desktop\\Proyecto program3\\proyectoProgram3\\src\\Images\\Logo twitter.png"));
		lblNewLabel_1.setBounds(459, 919, 147, 20);
		contentPane.add(lblNewLabel_1);
		
		JButton btnBuscadorDeArticulos = new JButton("Buscador de Articulos");
		btnBuscadorDeArticulos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Buscador b = new Buscador(usuario);
				b.setVisible(true);
				
				
			}
		});
		btnBuscadorDeArticulos.setBounds(777, 192, 215, 29);
		contentPane.add(btnBuscadorDeArticulos);
	}
}
