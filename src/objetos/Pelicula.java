package objetos;

public class Pelicula {
	
	private String nombrePelicula;
	private String descripcionPelicula;
	private float precio;
	
	public Pelicula(String nombrePelicula, String descripcionPelicula, float precio) {
		this.nombrePelicula = nombrePelicula;
		this.descripcionPelicula = descripcionPelicula;
		this.precio = precio;
	}
	
	public String getNombrePelicula() {
		return nombrePelicula;
	}
	
	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}
	
	public String getDescripcionPelicula() {
		return descripcionPelicula;
	}
	
	public void setDescripcionPelicula(String descripcionPelicula) {
		this.descripcionPelicula = descripcionPelicula;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}
