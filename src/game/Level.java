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
		if (!this.titulo.equals("==NÍVEL 1: CONTRA A CORRENTE==")) {
			apagarTela();
		}
		
		System.out.println(titulo);
	}
	
	public void apagarTela() {
        for (int i = 0; i < 50; ++i) System.out.println();
	}
}
