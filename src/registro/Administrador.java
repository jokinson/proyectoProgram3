package registro;

/**
 * 
 * @author Jokin Martín
 * @version 1.0.0
 */

public class Administrador extends Persona{
	
	private String nombreAdmin;
	private String contrasenaAdmin;
	
	
	public Administrador(String nombreCompleto, int edad, String nombreAdmin, String contrasenaAdmin) {
		super(nombreCompleto, edad);
		this.nombreAdmin = nombreAdmin;
		this.contrasenaAdmin = contrasenaAdmin;
	}


	public String getNombreAdmin() {
		return nombreAdmin;
	}


	public void setNombreAdmin(String nombreAdmin) {
		this.nombreAdmin = nombreAdmin;
	}


	public String getContrasenaAdmin() {
		return contrasenaAdmin;
	}


	public void setContrasenaAdmin(String contrasenaAdmin) {
		this.contrasenaAdmin = contrasenaAdmin;
	}


	@Override
	public String toString() {
		return "Administrador [nombreAdmin=" + nombreAdmin + ", contrasenaAdmin=" + contrasenaAdmin + "]";
	}
	
	
	

}
