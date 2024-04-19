package game;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int satisfacao = 3;
		
		// DECLARAÇÃO DOS PERSONAGENS
		Player ply = new Player("WASHINGTON LUÍS", 0);
		SandraSuporte san = new SandraSuporte("SANDRA SUPORTE", satisfacao);
		RicardoBonsucesso bon = new RicardoBonsucesso("RICARDO BONSUCESSO", satisfacao);
		FloraSilva flo = new FloraSilva("FLORA DA SILVA", satisfacao);
		
		// LEVEL 1: CONTRA A CORRENTE
		Dialogo fala1 = new Dialogo(san, "Seu Prefeito, chegou uma carta pra você! Parece que é de uma das vítimas da enchente, uma tal de Flora.");
		fala1.mostrarDialogo();
		
		Dialogo fala2 = new Dialogo(san, "O cara que me deu a carta disse que ela veio pessoalmente. Disse que ela parecia bastante irritada. Ainda bem que não é comigo!");
		fala2.mostrarDialogo();
		
		Monologo monologo1 = new Monologo("Por que agora? Por que comigo?");
		monologo1.mostrarMonologo();
		
		Dialogo fala3 = new Dialogo(ply, "... Obrigado, Sandra...");
		fala3.mostrarDialogo();
		
		Scanner scanInteracaoUsuario1 = new Scanner(System.in);
		String interacaoUsuario1;
		System.out.printf("[1] LER A CARTA\n[2] PEDIR PARA RESUMIR\n");
		interacaoUsuario1 = scanInteracaoUsuario1.nextLine();
		
		switch(interacaoUsuario1) {
			case "1":
				System.out.println("Lendo...");
				break;
			case "2":
				san.variarSatisfacao(1);
				System.out.println(san.getSatisfacao());
				break;
			default:
				System.out.println("Input inválido");
		}
		
		// LEVEL 2: MALSUCESSO
		
		// LEVEL 3: O LIXO DE UM HOMEM É O DINHEIRO DE OUTRO
	}
}
