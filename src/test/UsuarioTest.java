package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import registro.Usuario;

public class UsuarioTest {
	private int a;
	private int b;
	@Before
	public void setUp(){
		a=25;
		b=10;
	}
	
	@After
	public void tearDown(){
		
	}
	/**
	 * Verifica que la resta de esos dos valores da 15
	 */
	@Test
	public void test() {
		int res= Usuario.restaPrecio(a, b);
		if (a>b){
			assertEquals(15,res,0.0);
		}else{
			
		}
		
	}
	/**
	 * Si la resta es negativa es que no tiene suficiente saldo por lo que
	 * lanza una excepcion
	 * @throws Exception
	 */
	@Test
	public void test1()throws Exception{
		int b=50;
		try{
			int res1=Usuario.restaPrecio(a, b);
			if (res1>0){
				fail();
			}
		}catch(Exception e){
			
		}
	}

}
