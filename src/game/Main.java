package game;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// VARIÁVEIS GLOBAIS/CONSTANTES
		Monologo interludio = new Monologo("ALGUM TEMPO DEPOIS...");
		int satisfacao = 3;
		 
		// DECLARAÇÃO DOS PERSONAGENS
		Player ply = new Player("WASHINGTON LUÍS", 0);
		Secretaria san = new Secretaria("SANDRA SUPORTE", satisfacao);
		Industrial bon = new Industrial("RICARDO BONSUCESSO", satisfacao);
		Ambientalista flo = new Ambientalista("FLORA DA SILVA", satisfacao);
		
		// LEVEL 1: CONTRA A CORRENTE
		Level nivel1 = new Level("NÍVEL 1: CONTRA A CORRENTE");
		nivel1.mostrarTitulo();
		
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
				
				Dialogo defaultCase6 = new Dialogo(san, "É claro que é uma reclamação! Reclamação da enchente que rolou esses dias na periferia! O que mais seria?");
				defaultCase6.mostrarDialogo();
				
				break;
		}
		
		Dialogo fala4 = new Dialogo(san, "O que você vai fazer?");
		fala4.mostrarDialogo();
		
		Dialogo fala5 = new Dialogo(ply, "Não tá na cara? A gente tem que ajudar essas pessoas. Seria uma boa ideia cuidar do sistema de drenagem, acredito.");
		fala5.mostrarDialogo();
		
		Dialogo fala6 = new Dialogo(san, "Você não pode tomar essas decisões assim! Você já se esqueceu? Tudo que os Ambientalistas te pedirem, os Industriais vão querer o oposto! E, entre os dois, são os Industriais que podem te tirar da prefeitura. Confia em mim: a última coisa que tu quer é uma entrevista privada com o Seu Bonsucesso.");
		fala6.mostrarDialogo();
		
		Dialogo fala7 = new Dialogo(ply, "E por que ele ficaria com raiva de mim por cuidar da drenagem? Desde quando foi ele quem teve a ideia de fazer casa na periferia?");
		fala7.mostrarDialogo();
		
		Dialogo fala8 = new Dialogo(san, "... Ah. Ah é, eu brisei. Bem, fica o aviso pra próxima.");
		fala8.mostrarDialogo();
		
		Scanner scanInteracaoUsuario2 = new Scanner(System.in);
		String interacaoUsuario2;
		System.out.printf("[1] AUMENTAR O ORÇAMENTO PARA A DRENAGEM \n[2] AUMENTAR O ORÇAMENTO PARA A RECICLAGEM\n[3] ENVIAR AJUDA COMUNITÁRIA\n[4] NADA\n");
		interacaoUsuario2 = scanInteracaoUsuario2.nextLine();
		
		switch(interacaoUsuario2) {
			case "1":
				flo.variarSatisfacao(3, true);
				
				Dialogo falaEscolhaUm1 = new Dialogo(ply, "... creio que o melhor a fazer seja ouvir a moça. Sandra, você pode marcar algumas reuniões para mim?");
				falaEscolhaUm1.mostrarDialogo();
				
				Dialogo falaEscolhaUm2 = new Dialogo(san, "Reuniões? Para quê?");
				falaEscolhaUm2.mostrarDialogo();
				
				Dialogo falaEscolhaUm3 = new Dialogo(ply, "Melhorar a drenagem de Anhanguera, é óbvio! A gente deixou de priorizar por tempo demais.");
				falaEscolhaUm3.mostrarDialogo();
				
				Dialogo falaEscolhaUm4 = new Dialogo(san, "Você assumiu ontem.");
				falaEscolhaUm4.mostrarDialogo();
				
				Dialogo falaEscolhaUm5 = new Dialogo(ply, "... a gente tipo... a prefeitura no geral, mulher.");
				falaEscolhaUm5.mostrarDialogo();
				
				Dialogo falaEscolhaUm6 = new Dialogo(san, "Ah, sim. Nesse caso, eu vou marcar as reuniões.");
				falaEscolhaUm6.mostrarDialogo();
				
				Dialogo falaEscolhaUm7 = new Dialogo(san, "A gente vota no candidato achando que ele sabe falar ao telefone...");
				falaEscolhaUm7.mostrarDialogo();
				
				break;
			case "2":
				flo.variarSatisfacao(2, true);
				
				Dialogo falaEscolhaDois1 = new Dialogo(ply, "... creio que o melhor a fazer seja ouvir a moça. Sandra, você pode marcar algumas reuniões para mim?");
				falaEscolhaDois1.mostrarDialogo();
				
				Dialogo falaEscolhaDois2 = new Dialogo(san, "Reuniões? Para quê?");
				falaEscolhaDois2.mostrarDialogo();
				
				Dialogo falaEscolhaDois3 = new Dialogo(ply, "A gente tem que impedir que Anhanguera vire uma cidade lixo. Digo, não que ela SEJA um lixo de cidade. Ela é boazinha até. Sem dúvida melhor que a minha terra natal. Eu quis dizer o lixo que os cidadãos produzem e largam por aí, sabe? Que eu também largo por aí. Sabe--");
				falaEscolhaDois3.mostrarDialogo();
				
				Dialogo falaEscolhaDois4 = new Dialogo(san, "A gente vota no candidato achando que ele sabe discursar, não tagarelar.");
				falaEscolhaDois4.mostrarDialogo();
				
				Dialogo falaEscolhaDois5 = new Dialogo(ply, "Desculpa.");
				falaEscolhaDois5.mostrarDialogo();
				
				break;
			case "3":
				flo.variarSatisfacao(1, true);
				
				Dialogo falaEscolhaTres1 = new Dialogo(ply, "...");
				falaEscolhaTres1.mostrarDialogo();
				
				Dialogo falaEscolhaTres2 = new Dialogo(san, "... Fala, homem.");
				falaEscolhaTres2.mostrarDialogo();
				
				Dialogo falaEscolhaTres3 = new Dialogo(ply, "Como que eu faço pra melhorar a drenagem ou a coleta de lixo mesmo?");
				falaEscolhaTres3.mostrarDialogo();
				
				Dialogo falaEscolhaTres4 = new Dialogo(san, "Eu vou fingir que não ouvi isso.");
				falaEscolhaTres4.mostrarDialogo();
				
				Dialogo falaEscolhaTres5 = new Dialogo(ply, "E se eu... e seu direcionasse uma parte do orçamento pras vítimas? Sabe, pra deslocar temporariamente e reconstruir aquela parte da cidade?");
				falaEscolhaTres5.mostrarDialogo();
				
				Dialogo falaEscolhaTres6 = new Dialogo(san, "Tu não ouviu a moça? Não é a primeira vez que inunda e vai inundar de novo em algum ponto. Acho que a sua solução ainda tá meio crua");
				falaEscolhaTres6.mostrarDialogo();
				
				Dialogo falaEscolhaTres7 = new Dialogo(ply, "M-mas ainda é uma solução, né?");
				falaEscolhaTres7.mostrarDialogo();
				
				Dialogo falaEscolhaTres8 = new Dialogo(san, "Sei lá, acho que sim. Vai querer que eu ligue pra alguma ONG?");
				falaEscolhaTres8.mostrarDialogo();
				
				Dialogo falaEscolhaTres9 = new Dialogo(ply, "N-não, eu cuido disso. Se a ajuda vier de uma ONG, vai parecer que eu não faço nada.");
				falaEscolhaTres9.mostrarDialogo();
				
				Dialogo falaEscolhaTres10 = new Dialogo(san, "Não ia ser muito distante da realidade.");
				falaEscolhaTres10.mostrarDialogo();
				
				break;
			case "4":
				flo.variarSatisfacao(2, false);
				
				Dialogo falaEscolhaQuatro1 = new Dialogo(ply, "E se o Sr. Bonsucesso não gostar da minha interferência?");
				falaEscolhaQuatro1.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro2 = new Dialogo(san, "Qual é, não leva o que eu disse tão a sério. Ele só se mete em alguns casos, e esse não vai ser um deles.");
				falaEscolhaQuatro2.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro3 = new Dialogo(ply, "Tá, mas e se? Que bem eu poderia fazer se eu não for mais o prefeito por causa disso?");
				falaEscolhaQuatro3.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro4 = new Dialogo(san, "Talvez alguma coisa útil com a sua vida, pra dar uma variada.");
				falaEscolhaQuatro4.mostrarDialogo();
				
				break;
			default:
				flo.variarSatisfacao(1, false);
				
				Dialogo falaCaseDefault1 = new Dialogo(san, "Por que que você escolheu isso? Você sabe ler as instruções? Só existem 4 opções, e não vai ser uma quinta opção mágica que vai te tirar do fundo do poço.");
				falaCaseDefault1.mostrarDialogo();
				
				Dialogo falaCaseDefault2 = new Dialogo(ply, "Perdão, sou indeciso. Uh, o que você acha de tirar um dia de folga amanhã?");
				falaCaseDefault2.mostrarDialogo();
				
				Dialogo falaCaseDefault3 = new Dialogo(san, "Por quê? Porque você não consegue decidir o que fazer e quer evitar que eu fique com raiva de você? Você acha que eu me venderia fácil assim?");
				falaCaseDefault3.mostrarDialogo();
				
				san.variarSatisfacao(2, true);
				
				Dialogo falaCaseDefault4 = new Dialogo(san, "Pois você tem razão!");
				falaCaseDefault4.mostrarDialogo();
				
				break;
		}
		
		Dialogo fimCapitulo1 = new Dialogo(ply, "Eu só espero que tudo dê certo...");
		fimCapitulo1.mostrarDialogo();
		
		if (san.getSatisfacao() <= 0) {
			interludio.mostrarMonologo();
			san.gameOver();
		} else if (flo.getSatisfacao() <= 0) {
			interludio.mostrarMonologo();
			flo.gameOver();
		}
		
		// LEVEL 2: MALSUCESSO
		
		// LEVEL 3: O LIXO DE UM HOMEM É O DINHEIRO DE OUTRO
	}
}
