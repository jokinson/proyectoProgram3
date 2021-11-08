package registro;

public class Persona {
	
	private String nombreCompleto;
	private int edad;
	
	
	public Persona(String nombreCompleto, int edad) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", edad=" + edad + "]";
	}
	
	

}
