package principal;

import java.util.ArrayList;
import java.util.Collections;

import bd.SelectData;
import objetos.Articulo;
import objetos.Pelicula;
import objetos.Serie;
import registro.Usuario;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Articulo> articulos = bd.SelectData.selectTendenciasArticulo1();
		
		
		
		for(Articulo a: articulos){
			System.out.println(a.getNombreArticulo());
		}
		

	
		
		
		
		
	}

}
