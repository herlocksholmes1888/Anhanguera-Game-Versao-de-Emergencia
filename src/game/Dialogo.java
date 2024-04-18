package game;

public class Dialogo {
	
	private String nomePersonagem;
	private String dialogo;
	
	public Dialogo(String nomePersonagem, String dialogo) {
		this.setNomePersonagem(nomePersonagem);
		this.setDialogo(dialogo);
	}
	
	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}
	
	public String getNomePersonagem() {
		return nomePersonagem;
	}
	
	public void setDialogo(String dialogo) {
		this.dialogo = dialogo;
	}
	
	public String getDialogo() {
		return dialogo;
	}
	
	public void mostrarDialogo() {
		System.out.println(nomePersonagem + ": " + dialogo);
	}
}
