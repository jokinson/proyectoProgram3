package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import objetos.Articulo;
import registro.Usuario;
import ventanas.Factura;

public class FacturaTest {
	
	
	private Usuario u ;
	private Articulo a ;

	@Before
	public void setUp() throws Exception{
		this.u = new Usuario(1, "Joaquin", 20, "jokinson", "1234", 20.0, 0);
		this.a = new Articulo(1, 1, "Superman", 15.0, null, null, 100);
	}
	@After
	public void TearDown() throws Exception{
		
	}
	
	
	
	@Test
	public void nuevoSaldotest() {
		
		double nuevoS = Factura.nuevoSaldo(u, a);
		assertEquals(5.0, nuevoS, 0.0);
		


	}
	
	

}
