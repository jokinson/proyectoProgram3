package registro;

/**
 * Clase çadministrador que hereda de persona
 * @author Jokin Martín
 * @version 1.0.0
 */

public class Administrador extends Persona{
	/**
	 * El nombre de usuario del administrador
	 */
	private String nombreAdmin;
	/**
	 * La contrasenya del administrador
	 */
	private String contrasenaAdmin;
	
	/**
	 * Rellena los parametros de la clase Administrador
	 * @param nombreCompleto	Nombre completo del administrador
	 * @param edad	Edad del administrador
	 * @param nombreAdmin	Nombre de usuario del administrador
	 * @param contrasenaAdmin	Contrasenya del administrador
	 */
	public Administrador(String nombreCompleto, int edad, String nombreAdmin, String contrasenaAdmin) {
		super(nombreCompleto, edad);
		this.nombreAdmin = nombreAdmin;
		this.contrasenaAdmin = contrasenaAdmin;
	}

	/**
	 * Devuelve el nombre de administrador
	 * @return nombreAdmin
	 */
	public String getNombreAdmin() {
		return nombreAdmin;
	}

	/**
	 * Modifica el nombre de administrador
	 * @param nombreAdmin
	 */
	public void setNombreAdmin(String nombreAdmin) {
		this.nombreAdmin = nombreAdmin;
	}

	/**
	 * Devuelve la contrasenya del admiinistrador
	 * @return contrasenaAdmin
	 */
	public String getContrasenaAdmin() {
		return contrasenaAdmin;
	}

	/**
	 * Modifica la contrasenya del administrador
	 * @param contrasenaAdmin
	 */
	public void setContrasenaAdmin(String contrasenaAdmin) {
		this.contrasenaAdmin = contrasenaAdmin;
	}

	

	@Override
	public String toString() {
		return "Administrador [nombreAdmin=" + nombreAdmin + ", contrasenaAdmin=" + contrasenaAdmin + "]";
	}
	
	
	

}
