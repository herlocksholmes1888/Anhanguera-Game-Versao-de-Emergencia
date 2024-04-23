package game;

public class Ambientalista extends Personagem {

	public Ambientalista(String nome, int satisfacao) {
		super(nome, satisfacao);
		
	}

	@Override
	public void gameOver() {
		System.out.print("Faz muito tempo desde a última vez em que vi uma árvore por aqui. Faz muito tempo desde a última vez em que vi uma árvore nessa região metropolitana inteira.\n" +
						   "O Ministério da Saúde normalizou a utilização de máscaras, mas elas ajudam pouco a bloquear a fumaça química dos Industriais... especialmente do Sr. Bonsucesso. As pessoas estão falando num êxodo para uma outra cidade, uma em que a respiração não sai quente.\n" +
						   "E o pior de tudo é que a culpa foi minha.\n" +
						   "Eu prometi que nunca chegaria a esse ponto, e fui eu quem permitiu que chegasse.\n" +
							"... Eu nunca pensei que fosse virar prefeito de uma cidade fantasma...\n"
						  );
		// System.exit(0);
	}
}
