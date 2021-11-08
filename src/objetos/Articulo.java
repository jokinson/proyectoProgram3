package objetos;

public class Articulo {
	
	private int codigoArticulo;
	private int codigoTipo;
	private String nombreArticulo;
	private float precioArticulo;
	private String descripcion;
	private String categoria;
	private int duracion;
	
	public Articulo(int codigoArticulo, int codigoTipo, String nombreArticulo, float precioArticulo, String descripcion,
			String categoria, int duracion) {
		super();
		this.codigoArticulo = codigoArticulo;
		this.codigoTipo = codigoTipo;
		this.nombreArticulo = nombreArticulo;
		this.precioArticulo = precioArticulo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.duracion = duracion;
	}

	public int getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(int codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public int getCodigoTipo() {
		return codigoTipo;
	}

	public void setCodigoTipo(int codigoTipo) {
		this.codigoTipo = codigoTipo;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public float getPrecioArticulo() {
		return precioArticulo;
	}

	public void setPrecioArticulo(float precioArticulo) {
		this.precioArticulo = precioArticulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Articulo [codigoArticulo=" + codigoArticulo + ", codigoTipo=" + codigoTipo + ", nombreArticulo="
				+ nombreArticulo + ", precioArticulo=" + precioArticulo + ", descripcion=" + descripcion
				+ ", categoria=" + categoria + ", duracion=" + duracion + "]";
	}
	
	
	
	

}
