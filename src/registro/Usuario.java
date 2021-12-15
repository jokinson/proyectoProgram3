package registro;
/**
 * 
 * @author Aritz Nieto
 * @version 1.0
 */
public class Usuario {
	/**
	 * El codigo asignado a cada usuario
	 */
	private int codUsuario;
	/**
	 * El nombre completo de la persona
	 */
	private String nombreCompleto;
	/**
	 * La edad de la persona
	 */
	private int edad;
	/**
	 * El nombre de usuario para acceder a la plataforma
	 */
	private String nombreUsuario;
	/**
	 * La contrasenya para acceder a la web
	 */
	private String contrasena;
	/**
	 * Booleano para saber si un usuario es administrador
	 */
	private int esAdmin;
	/**
	 * La cantidad de dinero disponible que tiene el usuario para alquilar peliculas
	 */
	private double saldo;
	/**
	 * Rellena los parametros de la clase Usuario
	 * @param El nombre de usuario para acceder a la plataforma
	 * @param La contrasenya para acceder a la plataforma
	 * @param La cantidad de dinero disponible que tiene el usuario para alquilar peliculas
	 * @param  Booleano para saber si un usuario es administrador
	 */
	public Usuario(int codUsuario, String nombreCompleto, int edad, String nombreUsuario, String contrasena, double saldo, int esAdmin) {
		this.codUsuario=codUsuario;
		this.nombreCompleto=nombreCompleto;
		this.edad= edad;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.saldo=saldo;
		this.esAdmin=esAdmin;
	}
	/**
	 * Devuelve el codigo de usuario
	 * @return codigo de usuario
	 */
	
	public int getCodUsuario() {
		return codUsuario;
	}
	/** 
	 * moficia el codigo de usuario
	 * @param codUsuario
	 */

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}
	/**
	 * devuelve el nombre completo del usuario
	 * @return nombre completo del usuario
	 */


	public String getNombreCompleto() {
		return nombreCompleto;
	}
	/**
	 * modifica el nombre completo del usuario
	 * @param nombreCompleto
	 */

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	/**
	 * devuelve la edad del usario
	 * @return edad del usuario
	 */

	public int getEdad() {
		return edad;
	}
	/**
	 * Modifica la edad del usuario
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Devuelve el nombre de usuario
	 * @return String con el nombre de usuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * Modifica el nombre de usuario
	 * @param nombreUsuario El nuevo nombre de usuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * Devuelve la contrasenya
	 * @return String con la contrasenya
	 */
	public String getContrasena() {
		return contrasena;
	}
	/**
	 * Modifica la contrasenya
	 * @param contrasenya La nueva contrasenya
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	/**
	 *  Devuelve el saldo
	 * @return Float de salgo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Modifica el saldo
	 * @param saldo El nuevo saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	/**
	 * Devuelve el dato si es admin
	 * @return si es admin
	 */
	public int getEsAdmin() {
		return esAdmin;
	}
	
	/**
	 * Modifica el dato si es admin
	 * @param esAdmin
	 */
	public void setEsAdmin(int esAdmin) {
		this.esAdmin = esAdmin;
	}
	@Override
	public String toString() {
		return  codUsuario +", "+nombreCompleto +", " + edad
				+ ", " + nombreUsuario + ", " + contrasena + ", " + esAdmin
				+ ", " + saldo ;
	}
	
	
	public static int restaPrecio(int a, int b){
		int r=a-b;
		return r;
		
	}
	
	
	
	

}
