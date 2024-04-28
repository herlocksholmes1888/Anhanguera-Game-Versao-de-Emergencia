package game;

public class Level {
	private String titulo;
	
	public Level(String titulo) {
		this.setTitulo(titulo);
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void mostrarTitulo() {
		System.out.println(titulo);
	}
}
