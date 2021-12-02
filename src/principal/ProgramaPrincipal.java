package principal;

import java.util.ArrayList;

import bd.SelectData;
import objetos.Articulo;
import objetos.Pelicula;
import objetos.Serie;
import registro.Usuario;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Usuario> usuarios = bd.SelectData.selectUsuario();
		ArrayList<Articulo> articulos = bd.SelectData.selectArticulos();
		
		
				
		Usuario u1 = usuarios.get(0);
			
		Articulo a1 = articulos.get(30);
		
		bd.SelectData.insertPeliculaUsuario(u1, a1);
		
		

	
		
		
		
		
	}

}
