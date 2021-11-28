package objetos;

public class Serie extends Articulo{
	
	private int temporadas;
	private int episodios;
	
	public Serie(int codigoArticulo, int codigoTipo, String nombreArticulo, double precioArticulo, String descripcion,
			String categoria, int duracion, int temporadas, int episodios) {
		super(codigoArticulo, codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion);
		this.temporadas = temporadas;
		this.episodios = episodios;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	

	
	

}
