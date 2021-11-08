package registro;

public class Usuario extends Persona {
	
	private String nombreUsuario;
	private String contrasena;
	private float saldo;
	
	
	public Usuario(String nombreCompleto, int edad, String nombreUsuario, String contrasena, float saldo) {
		super(nombreCompleto, edad);
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.saldo = saldo;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena + ", saldo=" + saldo + "]";
	}
	
	
	
	
	
	
	

}
