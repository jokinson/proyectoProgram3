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
		
		
		
		ArrayList<Articulo> articulos = bd.SelectData.selectArticulosDeArticulos();
		
		
		for(Articulo a: articulos){
			int t = bd.SelectData.selectTendenciasArticulo(a);
			System.out.println(t);
		}
		
		

	
		
		
		
		
	}

}
