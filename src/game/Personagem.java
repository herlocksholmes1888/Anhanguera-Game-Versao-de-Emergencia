package game;

import java.lang.Math;

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
	
	public void variarSatisfacao(int numeroAbsolutoVariacao, boolean adicao) {
		int satisfacaoAntes = getSatisfacao();
		int numeroVariacao = adicao ? numeroAbsolutoVariacao : -numeroAbsolutoVariacao;
		int satisfacaoDepois = satisfacaoAntes + numeroVariacao;
		setSatisfacao(satisfacaoDepois);
		
		int variacaoTotal = Math.abs(satisfacaoDepois - satisfacaoAntes);
		
		if (adicao == true) {
			System.out.println("A SATISFAÇÃO DE " + nome + " VARIOU EM " + variacaoTotal + " PONTO(S) POSITIVO(S)");
		} else {
			System.out.println("A SATISFAÇÃO DE " + nome + " VARIOU EM " + variacaoTotal + " PONTO(S) NEGATIVO(S)");
		}
	}
	
	public abstract void gameOver();
	
}
