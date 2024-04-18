package game;

import java.util.ArrayList;
import java.util.List;

public class Capitulo {
	private int numeroCapitulo;
	private String tituloCapitulo;
	private List<String> dialogos;
	
	public Capitulo(int numeroCapitulo, String tituloCapitulo) {
		this.numeroCapitulo = numeroCapitulo;
	    this.tituloCapitulo = tituloCapitulo;
	    this.dialogos = new ArrayList<>();
	}

	public int getNumeroCapitulo() {
	    return numeroCapitulo;
	}

	public void setNumeroCapitulo(int numeroCapitulo) {
	    this.numeroCapitulo = numeroCapitulo;
	}

	public String getTituloCapitulo() {
	     return tituloCapitulo;
	}

	public void setTituloCapitulo(String tituloCapitulo) {
	     this.tituloCapitulo = tituloCapitulo;
	}

	public List<String> getDialogos() {
	     return dialogos;
	}

	public void setDialogos(List<String> dialogos) {
	     this.dialogos = dialogos;
	}
}
