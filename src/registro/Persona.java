package registro;
/**
 * 
 * @author Aritz Nieto version 1.0
 *
 */
public class Persona {
	/**
	 * El nombre completo de la persona
	 */
	private String nombreCompleto;
	/**
	 * La edad de la persona
	 */
	private int edad;
	
	/**
	 * Rellena los parametros de la clase Persona
	 * @param nombreCompleto	Nombre de la persona
	 * @param edad	Edad de la persona
	 */
	public Persona(String nombreCompleto, int edad) {
		this.nombreCompleto = nombreCompleto;
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", edad=" + edad + "]";
	}
	
	

}
