package game;

public class Secretaria extends Personagem {

	public Secretaria(String nome, int satisfacao) {
		super(nome, satisfacao);
	}

	@Override
	public void gameOver() {
		System.out.print("Esse escritório tá numa zorra geral. Eu deveria demitir aquela...\n" +
						"Ah... É verdade. Ela foi mais rápida do que eu. Ela pediu demissão há algumas semanas, o que deixou o escritório vazio.\n" +
						"Em circunstâncias normais, eu lidaria bem com essa solidão. Digo, eu sou filho único. É o que nós fazemos de melhor.\n" +
						"Mas ela não se contentou em me deixar lidar sozinho com meus opositores da prefeitura. Não, ela teve que se transformar em um deles.\n" +
						"Suspeito que ela vá me impeachmar. Por mais que desdenhe dos Industriais, seu desdém por mim é maior e eles são grandes aliados se ela quiser me tirar daqui. Ela me deduraria por um vale presente num brechó...\n" +
						"E depois de me impeachmar? Não sei o que ela vai fazer. Ela não vai ficar do lado deles, essa é a minha única certeza. Talvez ela se una aos Ambientalistas depois que eu meter o pé.\n" +
						"O que posso fazer a partir de agora é tentar me redimir com ela nesses últimos dias de governo. Depois, quando eu já for um desempregado, pensarei no meu próximo passo.\n"
						);
		//System.out(0);
	}
}
