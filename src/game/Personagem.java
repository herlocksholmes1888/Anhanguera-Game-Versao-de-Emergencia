package game;

public abstract class Personagem {
	
	private String nome;
	private int satisfacao;
	
	public Personagem(String nome, int satisfacao) {
		this.setNome(nome);
		this.setSatisfacao(satisfacao);
	}
	
	public void setSatisfacao(int satisfacao) {
		this.satisfacao = satisfacao;
	}

	public int getSatisfacao() {
		return satisfacao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public abstract void variarSatisfacao();
	public abstract void gameOver();
}
