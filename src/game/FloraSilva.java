package game;

public class FloraSilva extends Personagem {

	public FloraSilva(String nome, int satisfacao) {
		super(nome, satisfacao);
		
	}

	@Override
	public void variarSatisfacao() {
		
	}

	@Override
	public void gameOver() {
		System.out.println("Faz muito tempo desde a última vez em que vi uma árvore por aqui. Faz muito tempo desde a última vez em que vi uma árvore nessa região metropolitana inteira.");
		
		System.out.println("O Ministério da Saúde normalizou a utilização de máscaras, mas elas ajudam pouco a bloquear a fumaça química dos Industriais... especialmente do Sr. Bonsucesso.");
		
		System.out.println("As pessoas estão falando num êxodo para uma outra cidade, uma em que a respiração não sai quente.");
		
		System.out.println("E o pior de tudo é que a culpa foi minha.");
		
		System.out.println("Eu prometi que nunca chegaria a esse ponto, e fui eu quem permitiu que chegasse.");
		
		System.out.println("... Eu nunca pensei que fosse virar prefeito de uma cidade fantasma...");
		
		// System.exit(0);
	}
}
