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
	
	// Retorna o valor de nome em String. Senão, o formato seria:
	// game.Personagem@1b0375b3: Diálogo
    @Override
    public String toString() {
        return nome;
    }
	
	public void variarSatisfacao(int consequencias, boolean adicao) {
		int satisfacaoAntes = getSatisfacao();
		int operacao = adicao ? consequencias : -consequencias;
		int satisfacaoDepois = satisfacaoAntes + operacao;
		setSatisfacao(satisfacaoDepois);
	}
	
	public abstract void gameOver();
}
