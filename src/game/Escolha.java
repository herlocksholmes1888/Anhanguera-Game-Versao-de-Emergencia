package game;

public class Escolha {
	
	private int indexEscolha;
	private int mudancaSatisfacao;
	
	public Escolha(int indexEscolha) {
		this.setIndexEscolha(indexEscolha);
		this.setMudancaSatisfacao(mudancaSatisfacao);
	}
	
	public void setIndexEscolha(int indexEscolha) {
		this.indexEscolha = indexEscolha;
	}
	
	public int getIndexEscolha() {
		return indexEscolha;
	}
	
	public void setMudancaSatisfacao(int mudancaSatisfacao) {
		this.mudancaSatisfacao = mudancaSatisfacao;
	}
	
	public int getMudancaSatisfacao() {
		return mudancaSatisfacao;
	}
}
