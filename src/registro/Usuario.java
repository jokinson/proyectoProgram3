package registro;
/**
 * 
 * @author Aritz Nieto
 * @version 1.0
 */
public class Usuario {
	/**
	 * El nombre de usuario para acceder a la plataforma
	 */
	private String nombreUsuario;
	/**
	 * La contrasenya para acceder a la web
	 */
	private String contrasena;
	/**
	 * La cantidad de dinero disponible que tiene el usuario para alquilar peliculas
	 */
	private float saldo;
	/**
	 * Rellena los parametros de la clase Usuario
	 * @param El nombre de usuario para acceder a la plataforma
	 * @param La contrasenya para acceder a la plataforma
	 * @param La cantidad de dinero disponible que tiene el usuario para alquilar peliculas
	 */
	public Usuario(String nombreUsuario, String contrasena, float saldo) {
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.saldo=saldo;
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
	public float getSaldo() {
		return saldo;
	}
	/**
	 * Modifica el saldo
	 * @param saldo El nuevo saldo
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Usuario =" + nombreUsuario + ", Contraseña =" + contrasena+"Saldo ="+saldo;
	}
	
	public static int restaPrecio(int a, int b){
		int r=a-b;
		return r;
		
	}
	
	
	
	

}
