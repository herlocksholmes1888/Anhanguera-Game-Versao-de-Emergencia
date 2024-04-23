package game;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// VARIÁVEIS GLOBAIS
		int satisfacao = 3;
		
		// DECLARAÇÃO DOS PERSONAGENS
		Player ply = new Player("WASHINGTON LUÍS", 0);
		Secretaria san = new Secretaria("SANDRA SUPORTE", satisfacao);
		Industrial bon = new Industrial("RICARDO BONSUCESSO", satisfacao);
		Ambientalista flo = new Ambientalista("FLORA DA SILVA", satisfacao);
		
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
				Dialogo falaEscolhaUm1 = new Dialogo(ply, "Me dê a carta, por favor.");
				falaEscolhaUm1.mostrarDialogo();
				
				san.variarSatisfacao(1,  true);		
				Dialogo falaEscolhaUm2 = new Dialogo(san, "Ora, então o candidato sabe ler! Toma a carta!");
				falaEscolhaUm2.mostrarDialogo();
				
				Monologo carta = new Monologo("Senhor Prefeito,\nVenho por meio desta informá-lo de um problema que, acredito, apenas o senhor pode resolver.\nHá dois dias, houve uma enchente na cidade, resultado de uma chuva torrencial que afetou particularmente a região da periferia. Todo mundo que conheço perdeu alguma coisa ou alguém.\nPor isso, tenho uma exigência a fazer: gostaria que o senhor aumentasse o orçamento destinado à drenagem da nossa cidade. Se não for possível, então encaminhar um maior investimento à coleta de lixo, já que ele também é um dos responsáveis.\nSei que essas coisas não costumam ser prioridade em Anhanguera, mas é justamente por essa falta de cuidado que a enchente aconteceu. O senhor fez ouvir o que os Ambientalistas tinham a dizer parte da sua campanha. Transforme sua promessa em ações. Sem as ações, promessas não passam de palavras.\nTodo mentiroso sabe falar.\nAtt. Flora da Silva");
				carta.mostrarMonologo();
				
				Monologo monologo2 = new Monologo("...\n" + ".....\n" + ".........");
				monologo2.mostrarMonologo();
				
				Dialogo falaEscolhaUm3 = new Dialogo(san, "Por que tu tá no Facebook, Seu Prefeito?");
				falaEscolhaUm3.mostrarDialogo();
				
				Dialogo falaEscolhaUm4 = new Dialogo(ply, "S-só deletando a minha localização.");
				falaEscolhaUm4.mostrarDialogo();
				
				break;
			case "2":
				Dialogo falaEscolhaDois1 = new Dialogo(ply, "Eu estou muito ocupado. Poderia lê-la para mim, por favor?");
				falaEscolhaDois1.mostrarDialogo();
				
				san.variarSatisfacao(1, false);
				Dialogo falaEscolhaDois2 = new Dialogo(san, "... A gente vota no candidato achando que ele sabe ler...");
				falaEscolhaDois2.mostrarDialogo();
				
				Dialogo falaEscolhaDois3 = new Dialogo(san, "A tal Flora tá reclamando da última enchente. Meio que implicou que falar que é culpa do temporal não é tão certo quanto falar que é culpa do sistema de drenagem daqui.");
				falaEscolhaDois3.mostrarDialogo();
				
				Dialogo falaEscolhaDois4 = new Dialogo(ply, "O sistema de drenagem?");
				falaEscolhaDois4.mostrarDialogo();
				
				Dialogo falaEscolhaDois5 = new Dialogo(san, "É, o sistema de drenagem daqui é uma merda, é o que eu tô querendo dizer. O cara que tava no seu lugar ano passado decidiu construir umas casas novas, mas sem planejamento adequado: acabou construindo um monte onde era terreno baldio.");
				falaEscolhaDois5.mostrarDialogo();
				
				Dialogo falaEscolhaDois6 = new Dialogo(san, "E era umas casas baratas, também, daquelas que chamam a atenção de pobre que não tem escolha mesmo. A Flora foi morar lá e deu no que deu.");
				falaEscolhaDois6.mostrarDialogo();
				
				break;
			default:
				Dialogo defaultCase1 = new Dialogo(san, "Vai ficar me encarando com essa cara de bezerro perdido?");
				defaultCase1.mostrarDialogo();
				
				Dialogo defaultCase2 = new Dialogo(ply, "Eu... eu acho que não preciso ler a carta para saber do que ela se trata...");
				defaultCase2.mostrarDialogo();
				
				Dialogo defaultCase3 = new Dialogo(san, "E do que ela se trata então, Seu Prefeito?");
				defaultCase3.mostrarDialogo();
				
				Dialogo defaultCase4 = new Dialogo(ply, "Uh... É uma reclamação, eu presumo?");
				defaultCase4.mostrarDialogo();
				
				san.variarSatisfacao(1,  false);
				Dialogo defaultCase5 = new Dialogo(san, "Eu não acredito que trabalho pra você.");
				defaultCase5.mostrarDialogo();
		}
		
		Dialogo fala4 = new Dialogo(san, "O que você vai fazer?");
		fala4.mostrarDialogo();
		
		Dialogo fala5 = new Dialogo(ply, "Não tá na cara? A gente tem que ajudar essa menina.");
		fala5.mostrarDialogo();
		
		Dialogo fala6 = new Dialogo(san, "Você não pode tomar essas decisões assim! Você já se esqueceu? Tudo que os Ambientalistas te pedirem, os Industriais vão querer o oposto! E, entre os dois, são os Industriais que podem te tirar da prefeitura. Confia em mim: a última coisa que tu quer é uma entrevista privada com o Seu Bonsucesso.");
		fala6.mostrarDialogo();
		
		Dialogo fala7 = new Dialogo(ply, "E por que ele ficaria com raiva de mim por cuidar da drenagem? Desde quando foi ele quem teve a ideia de fazer casa na periferia?");
		fala7.mostrarDialogo();
		
		Dialogo fala8 = new Dialogo(san, "... Ah. Ah é, eu brisei. Bem, fica o aviso pra próxima.");
		fala8.mostrarDialogo();
		
		Scanner scanInteracaoUsuario2 = new Scanner(System.in);
		String interacaoUsuario2;
		System.out.printf("[1] AUMENTAR O ORÇAMENTO PARA A DRENAGEM \n[2] AUMENTAR O ORÇAMENTO PARA A RECICLAGEM\n [3] ENVIAR AJUDA COMUNITÁRIA \n [4] NADA\n");
		interacaoUsuario2 = scanInteracaoUsuario2.nextLine();
		
		switch(interacaoUsuario2) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			default:
				break;
		}
		
		// LEVEL 2: MALSUCESSO
		
		// LEVEL 3: O LIXO DE UM HOMEM É O DINHEIRO DE OUTRO
	}
}
