package game;

public class Dialogo {
	
	private Personagem nome;
	private String dialogo;
	
	public Dialogo(Personagem nome, String dialogo) {
		this.setNomePersonagem(nome);
		this.setDialogo(dialogo);
	}
	 
	public void setNomePersonagem(Personagem nome) {
		this.nome = nome;
	}
	
	public Personagem getNomePersonagem() {
		return nome;
	}
	
	public void setDialogo(String dialogo) {
		this.dialogo = dialogo;
	}
	
	public String getDialogo() {
		return dialogo;
	}
	
	public void mostrarDialogo() {
		System.out.println(nome + ": " + dialogo);
		pressioneQualquerTeclaParaContinuar();
	}
	
	private void pressioneQualquerTeclaParaContinuar() {
        try {
            System.in.read();
        } catch(Exception e) { }  
	}
}
