package principal;

import java.util.ArrayList;

import bd.SelectData;
import objetos.Articulo;
import objetos.Pelicula;
import objetos.Serie;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Articulo> articulos = bd.SelectData.selectArticulos();
		
		for (Articulo a : articulos ){
			System.out.println(a);
		}
		
		
		
		
	}

}
