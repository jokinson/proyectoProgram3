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
		ArrayList<Articulo> art = bd.SelectData.selectArticulosUsuario(u1);
		
		for(Articulo a : art){
			//System.out.println(a);
		}
		

	
		
		
		
		
	}

}
