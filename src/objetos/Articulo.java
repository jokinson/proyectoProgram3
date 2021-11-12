package objetos;

/**
 * 
 * @author Aritz Nieto version 1.2
 * @since 1.0
 */
public class Articulo {
	/**
	 * El codigo del articulo
	 */
	private int codigoArticulo;
	/**
	 * El codigo del tipo de articulo
	 */
	private int codigoTipo;
	/**
	 * El nombre del articulo
	 */
	private String nombreArticulo;
	/**
	 * El precio del articulo
	 */
	private float precioArticulo;
	/**
	 * Breve explicacion del argumento del articulo
	 */
	private String descripcion;
	/**
	 * A que genero pertene el articulo (humor, drama...)
	 */
	private String categoria;
	/**
	 * Duracion del articulo en minutos (si es serie media por episodio)
	 */
	private int duracion;
	/**
	 * Rellena los parametros de la clase Articulo
	 * @param codigoArticulo	El codigo del articulo
	 * @param codigoTipo	El codigo de tipo de articulo
	 * @param nombreArticulo	El nombre del articulo 
	 * @param precioArticulo	El precio del articulo
	 * @param descripcion	Breve explicacion sobre el argumento del articulo
	 * @param categoria 	A que genero pertenece
	 * @param duracion		Cuanto dura el articulo
	 */
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
	/**
	 * Devuelve el codigo del articulo
	 * @return codigoArticulo
	 */
	public int getCodigoArticulo() {
		return codigoArticulo;
	}
	/**
	 * Modifica el codigo de articulo
	 * @param codigoArticulo
	 */
	public void setCodigoArticulo(int codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}
	/**
	 * Devuelve el codigo del tipo de articulo
	 * @return codigoTipo
	 */
	public int getCodigoTipo() {
		return codigoTipo;
	}
	/**
	 * Modifica el codigo de tipo de articulo
	 * @param codigoTipo
	 */
	public void setCodigoTipo(int codigoTipo) {
		this.codigoTipo = codigoTipo;
	}
	/**
	 * Devuelve el nombre del articulo
	 * @return nombreArticulo
	 */
	public String getNombreArticulo() {
		return nombreArticulo;
	}
	/**
	 * Modifica el nombre del articulo
	 * @param nombreArticulo
	 */
	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}
	/**
	 * Devuelve el precio del articulo
	 * @return precioArticulo
	 */
	public float getPrecioArticulo() {
		return precioArticulo;
	}
	/**
	 * Modifica el precio del articulo
	 * @param precioArticulo
	 */
	public void setPrecioArticulo(float precioArticulo) {
		this.precioArticulo = precioArticulo;
	}
	/**
	 * Devuelve la descripcion del articulo
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Modifica la descripcion del articulo
	 * @param descripciom
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * Devuelve la categoria del articulo
	 * @return categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * Modifica la categoria del articulo
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * Devuelve la duracion del articulo
	 * @return duracion
	 */
	public int getDuracion() {
		return duracion;
	}
	/**
	 * Modifica la duracion del articulo
	 * @param duracion
	 */
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