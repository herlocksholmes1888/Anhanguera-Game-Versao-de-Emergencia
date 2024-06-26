package game;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// VARIÁVEIS GLOBAIS/CONSTANTES
		int satisfacao = 3;
		Monologo interludio = new Monologo("ALGUM TEMPO DEPOIS...");
		 
		// DECLARAÇÃO DOS PERSONAGENS
		Player ply = new Player("WASHINGTON LUÍS", 0);
		Secretaria san = new Secretaria("SANDRA SUPORTE", satisfacao);
		Industrial bon = new Industrial("RICARDO BONSUCESSO", satisfacao);
		Ambientalista flo = new Ambientalista("FLORA DA SILVA", satisfacao);
		
		// LEVEL 1: CONTRA A CORRENTE
		Level nivel1 = new Level("==NÍVEL 1: CONTRA A CORRENTE==");
		nivel1.mostrarTitulo();
		
		Dialogo fala1 = new Dialogo(san, "Seu Prefeito, chegou uma carta pra você! Parece que é de uma das vítimas da enchente, uma tal de Flora.");
		fala1.mostrarFala();
		
		Dialogo fala2 = new Dialogo(san, "O cara que me deu a carta disse que ela veio pessoalmente. Disse que ela parecia bastante irritada. Ainda bem que não é comigo!");
		fala2.mostrarFala();
		
		Monologo monologo1 = new Monologo("Por que agora? Por que comigo?");
		monologo1.mostrarFala();
		
		Dialogo fala3 = new Dialogo(ply, "... Obrigado, Sandra...");
		fala3.mostrarFala();
		
		// 1º escolha do jogador
		Scanner scanInteracaoUsuario1 = new Scanner(System.in);
		String interacaoUsuario1;
		System.out.printf("[1] LER A CARTA\n[2] PEDIR PARA RESUMIR\n");
		interacaoUsuario1 = scanInteracaoUsuario1.nextLine();
		
		switch(interacaoUsuario1) {
			case "1":
				Dialogo falaEscolhaUm1 = new Dialogo(ply, "Me dê a carta, por favor.");
				falaEscolhaUm1.mostrarFala();
				
				san.variarSatisfacao(1,  true);		
				Dialogo falaEscolhaUm2 = new Dialogo(san, "Ora, então o candidato sabe ler! Toma a carta!");
				falaEscolhaUm2.mostrarFala();
				
				Monologo carta = new Monologo("Senhor Prefeito,\nVenho por meio desta informá-lo de um problema que, acredito, apenas o senhor pode resolver.\nHá dois dias, houve uma enchente na cidade, resultado de uma chuva torrencial que afetou particularmente a região da periferia. Todo mundo que conheço perdeu alguma coisa ou alguém.\nPor isso, tenho uma exigência a fazer: gostaria que o senhor aumentasse o orçamento destinado à drenagem da nossa cidade. Se não for possível, então encaminhar um maior investimento à coleta de lixo, já que ele também é um dos responsáveis.\nSei que essas coisas não costumam ser prioridade em Anhanguera, mas é justamente por essa falta de cuidado que a enchente aconteceu. O senhor fez ouvir o que os Ambientalistas tinham a dizer parte da sua campanha. Transforme sua promessa em ações. Sem as ações, promessas não passam de palavras.\nTodo mentiroso sabe falar.\nAtt. Flora da Silva");
				carta.mostrarFala();
				
				Monologo reacaoCarta1 = new Monologo("...");
				reacaoCarta1.mostrarFala();
				
				Monologo reacaoCarta2 = new Monologo(".......");
				reacaoCarta2.mostrarFala();
				
				Dialogo falaEscolhaUm3 = new Dialogo(san, "Por que tu tá no Facebook, Seu Prefeito?");
				falaEscolhaUm3.mostrarFala();
				
				Dialogo falaEscolhaUm4 = new Dialogo(ply, "S-só deletando a minha localização.");
				falaEscolhaUm4.mostrarFala();
				break;
			case "2":
				Dialogo falaEscolhaDois1 = new Dialogo(ply, "Eu estou muito ocupado. Poderia lê-la para mim, por favor?");
				falaEscolhaDois1.mostrarFala();
				
				san.variarSatisfacao(1, false);
				Dialogo falaEscolhaDois2 = new Dialogo(san, "... A gente vota no candidato achando que ele sabe ler...");
				falaEscolhaDois2.mostrarFala();
				
				Dialogo falaEscolhaDois3 = new Dialogo(san, "A tal Flora tá reclamando da última enchente. Meio que implicou que falar que é culpa do temporal não é tão certo quanto falar que é culpa do sistema de drenagem daqui.");
				falaEscolhaDois3.mostrarFala();
				
				Dialogo falaEscolhaDois4 = new Dialogo(ply, "O sistema de drenagem?");
				falaEscolhaDois4.mostrarFala();
				
				Dialogo falaEscolhaDois5 = new Dialogo(san, "É, o sistema de drenagem daqui é uma merda, é o que eu tô querendo dizer. O cara que tava no seu lugar ano passado decidiu construir umas casas novas, mas sem planejamento adequado: acabou construindo um monte onde era terreno baldio.");
				falaEscolhaDois5.mostrarFala();
				
				Dialogo falaEscolhaDois6 = new Dialogo(san, "E era umas casas baratas, também, daquelas que chamam a atenção de pobre que não tem escolha mesmo. A Flora foi morar lá e deu no que deu.");
				falaEscolhaDois6.mostrarFala();
				break;
			default:
				Dialogo defaultCase1 = new Dialogo(san, "Vai ficar me encarando com essa cara de bezerro perdido?");
				defaultCase1.mostrarFala();
				
				Dialogo defaultCase2 = new Dialogo(ply, "Eu... eu acho que não preciso ler a carta para saber do que ela se trata...");
				defaultCase2.mostrarFala();
				
				Dialogo defaultCase3 = new Dialogo(san, "E do que ela se trata então, Seu Prefeito?");
				defaultCase3.mostrarFala();
				
				Dialogo defaultCase4 = new Dialogo(ply, "Uh... É uma reclamação, eu presumo?");
				defaultCase4.mostrarFala();
				
				san.variarSatisfacao(1,  false);
				Dialogo defaultCase5 = new Dialogo(san, "Eu não acredito que trabalho pra você.");
				defaultCase5.mostrarFala();
				
				Dialogo defaultCase6 = new Dialogo(san, "É claro que é uma reclamação! Reclamação da enchente que rolou esses dias na periferia! O que mais seria?");
				defaultCase6.mostrarFala();
				break;
		}
		
		Dialogo fala4 = new Dialogo(san, "O que você vai fazer?");
		fala4.mostrarFala();
		
		Dialogo fala5 = new Dialogo(ply, "Não tá na cara? A gente tem que ajudar essas pessoas. Seria uma boa ideia cuidar do sistema de drenagem, acredito.");
		fala5.mostrarFala();
		
		Dialogo fala6 = new Dialogo(san, "Você não pode tomar essas decisões assim! Você já se esqueceu? Tudo que os Ambientalistas te pedirem, os Industriais vão querer o oposto! E, entre os dois, são os Industriais que podem te tirar da prefeitura. Confia em mim: a última coisa que tu quer é uma entrevista privada com o Seu Bonsucesso.");
		fala6.mostrarFala();
		
		Dialogo fala7 = new Dialogo(ply, "E por que ele ficaria com raiva de mim por cuidar da drenagem? Desde quando foi ele quem teve a ideia de fazer casa na periferia?");
		fala7.mostrarFala();
		
		Dialogo fala8 = new Dialogo(san, "... Ah. Ah é, eu brisei. Bem, fica o aviso pra próxima.");
		fala8.mostrarFala();
		
		// 2º escolha do jogador
		Scanner scanInteracaoUsuario2 = new Scanner(System.in);
		String interacaoUsuario2;
		System.out.printf("[1] AUMENTAR O ORÇAMENTO PARA A DRENAGEM \n[2] AUMENTAR O ORÇAMENTO PARA A RECICLAGEM\n[3] ENVIAR AJUDA COMUNITÁRIA\n[4] NADA\n");
		interacaoUsuario2 = scanInteracaoUsuario2.nextLine();
		
		switch(interacaoUsuario2) {
			case "1":
				flo.variarSatisfacao(3, true);
				
				Dialogo falaEscolhaUm1 = new Dialogo(ply, "... creio que o melhor a fazer seja ouvir a moça. Sandra, você pode marcar algumas reuniões para mim?");
				falaEscolhaUm1.mostrarFala();
				
				Dialogo falaEscolhaUm2 = new Dialogo(san, "Reuniões? Para quê?");
				falaEscolhaUm2.mostrarFala();
				
				Dialogo falaEscolhaUm3 = new Dialogo(ply, "Melhorar a drenagem de Anhanguera, é óbvio! A gente deixou de priorizar por tempo demais.");
				falaEscolhaUm3.mostrarFala();
				
				Dialogo falaEscolhaUm4 = new Dialogo(san, "Você assumiu ontem.");
				falaEscolhaUm4.mostrarFala();
				
				Dialogo falaEscolhaUm5 = new Dialogo(ply, "... a gente tipo... a prefeitura no geral, mulher.");
				falaEscolhaUm5.mostrarFala();
				
				Dialogo falaEscolhaUm6 = new Dialogo(san, "Ah, sim. Nesse caso, eu vou marcar as reuniões.");
				falaEscolhaUm6.mostrarFala();
				
				Dialogo falaEscolhaUm7 = new Dialogo(san, "A gente vota no candidato achando que ele sabe falar ao telefone...");
				falaEscolhaUm7.mostrarFala();
				break;
			case "2":
				flo.variarSatisfacao(2, true);
				
				Dialogo falaEscolhaDois1 = new Dialogo(ply, "... creio que o melhor a fazer seja ouvir a moça. Sandra, você pode marcar algumas reuniões para mim?");
				falaEscolhaDois1.mostrarFala();
				
				Dialogo falaEscolhaDois2 = new Dialogo(san, "Reuniões? Para quê?");
				falaEscolhaDois2.mostrarFala();
				
				Dialogo falaEscolhaDois3 = new Dialogo(ply, "A gente tem que impedir que Anhanguera vire uma cidade lixo. Digo, não que ela SEJA um lixo de cidade. Ela é boazinha até. Sem dúvida melhor que a minha terra natal. Eu quis dizer o lixo que os cidadãos produzem e largam por aí, sabe? Que eu também largo por aí. Sabe--");
				falaEscolhaDois3.mostrarFala();
				
				Dialogo falaEscolhaDois4 = new Dialogo(san, "A gente vota no candidato achando que ele sabe discursar, não tagarelar.");
				falaEscolhaDois4.mostrarFala();
				
				Dialogo falaEscolhaDois5 = new Dialogo(ply, "Desculpa.");
				falaEscolhaDois5.mostrarFala();
				break;
			case "3":
				flo.variarSatisfacao(1, true);
				
				Dialogo falaEscolhaTres1 = new Dialogo(ply, "...");
				falaEscolhaTres1.mostrarFala();
				
				Dialogo falaEscolhaTres2 = new Dialogo(san, "... Fala, homem.");
				falaEscolhaTres2.mostrarFala();
				
				Dialogo falaEscolhaTres3 = new Dialogo(ply, "Como que eu faço pra melhorar a drenagem ou a coleta de lixo mesmo?");
				falaEscolhaTres3.mostrarFala();
				
				Dialogo falaEscolhaTres4 = new Dialogo(san, "Eu vou fingir que não ouvi isso.");
				falaEscolhaTres4.mostrarFala();
				
				Dialogo falaEscolhaTres5 = new Dialogo(ply, "E se eu... e seu direcionasse uma parte do orçamento pras vítimas? Sabe, pra deslocar temporariamente e reconstruir aquela parte da cidade?");
				falaEscolhaTres5.mostrarFala();
				
				Dialogo falaEscolhaTres6 = new Dialogo(san, "Tu não ouviu a moça? Não é a primeira vez que inunda e vai inundar de novo em algum ponto. Acho que a sua solução ainda tá meio crua");
				falaEscolhaTres6.mostrarFala();
				
				Dialogo falaEscolhaTres7 = new Dialogo(ply, "M-mas ainda é uma solução, né?");
				falaEscolhaTres7.mostrarFala();
				
				Dialogo falaEscolhaTres8 = new Dialogo(san, "Sei lá, acho que sim. Vai querer que eu ligue pra alguma ONG?");
				falaEscolhaTres8.mostrarFala();
				
				Dialogo falaEscolhaTres9 = new Dialogo(ply, "N-não, eu cuido disso. Se a ajuda vier de uma ONG, vai parecer que eu não faço nada.");
				falaEscolhaTres9.mostrarFala();
				
				Dialogo falaEscolhaTres10 = new Dialogo(san, "Não ia ser muito distante da realidade.");
				falaEscolhaTres10.mostrarFala();
				break;
			case "4":
				flo.variarSatisfacao(2, false);
				
				Dialogo falaEscolhaQuatro1 = new Dialogo(ply, "E se o Sr. Bonsucesso não gostar da minha interferência?");
				falaEscolhaQuatro1.mostrarFala();
				
				Dialogo falaEscolhaQuatro2 = new Dialogo(san, "Qual é, não leva o que eu disse tão a sério. Ele só se mete em alguns casos, e esse não vai ser um deles.");
				falaEscolhaQuatro2.mostrarFala();
				
				Dialogo falaEscolhaQuatro3 = new Dialogo(ply, "Tá, mas e se? Que bem eu poderia fazer se eu não for mais o prefeito por causa disso?");
				falaEscolhaQuatro3.mostrarFala();
				
				Dialogo falaEscolhaQuatro4 = new Dialogo(san, "Talvez alguma coisa útil com a sua vida, pra dar uma variada.");
				falaEscolhaQuatro4.mostrarFala();
				break;
			default:
				flo.variarSatisfacao(1, false);
				
				Dialogo falaCaseDefault1 = new Dialogo(san, "Por que que você escolheu isso? Você sabe ler as instruções? Só existem 4 opções, e não vai ser uma quinta opção mágica que vai te tirar do fundo do poço.");
				falaCaseDefault1.mostrarFala();
				
				Dialogo falaCaseDefault2 = new Dialogo(ply, "Perdão, sou indeciso. Uh, o que você acha de tirar um dia de folga amanhã?");
				falaCaseDefault2.mostrarFala();
				
				Dialogo falaCaseDefault3 = new Dialogo(san, "Por quê? Porque você não consegue decidir o que fazer e quer evitar que eu fique com raiva de você? Você acha que eu me venderia fácil assim?");
				falaCaseDefault3.mostrarFala();
				
				san.variarSatisfacao(2, true);
				
				Dialogo falaCaseDefault4 = new Dialogo(san, "Pois você tem razão!");
				falaCaseDefault4.mostrarFala();
				break;
		}
		
		Dialogo fimCapitulo1 = new Dialogo(ply, "Eu só espero que tudo dê certo...");
		fimCapitulo1.mostrarFala();
		
		// Game over
		if (san.getSatisfacao() <= 0) {
			interludio.mostrarFala();
			san.gameOver();
		} else if (flo.getSatisfacao() <= 0) {
			interludio.mostrarFala();
			flo.gameOver();
		} else {
			System.out.println("==EXPEDIENTE ENCERRADO==");
			System.out.println("A satisfação dos Industriais está em: " + bon.getSatisfacao());
			System.out.println("A satisfação dos Ambientalistas está em: " + flo.getSatisfacao());
			System.out.println("A satisfação de sua atual secretária está em: " + san.getSatisfacao());
		}
		
		// LEVEL 2: MALSUCESSO
		System.out.print("\033\143");
		Level level2 = new Level("==NÍVEL 2: MALSUCESSO==");
		level2.mostrarTitulo();
		
		Dialogo fala9 = new Dialogo(ply, "Dia novo, vida nova.");
		fala9.mostrarFala();
		
		Dialogo fala10 = new Dialogo(san, "Tem um cara estranho querendo falar contigo, ele parece ter algum problema mental grave. É aquele Bonsucesso que eu falei pra você não mexer...");
		fala10.mostrarFala();
		
		Dialogo fala11 = new Dialogo(ply, "Ou não. Errei, fui moleque.");
		fala11.mostrarFala();
		
		// 3º escolha do usuário
		Scanner scanInteracaoUsuario3 = new Scanner(System.in);
		String interacaoUsuario3;
		System.out.printf("[1] PEDIR PARA ENTRAR\n[2] EXIGIR EXPLICAÇÕES\n");
		interacaoUsuario3 = scanInteracaoUsuario3.nextLine();
		
		switch(interacaoUsuario3) {
			case "1":
				Dialogo falaEscolhaUm1 = new Dialogo(ply, "Pode mandar entrar, Sandra.");
				falaEscolhaUm1.mostrarFala();
				
				Dialogo falaEscolhaUm2 = new Dialogo(ply, "Boa tarde senhor Bonsucesso, como pos–");
				falaEscolhaUm2.mostrarFala();
				
				Dialogo falaEscolhaUm3 = new Dialogo(bon, "Gud murning amigo, como estais?!");
				falaEscolhaUm3.mostrarFala();
				
				Dialogo falaEscolhaUm4 = new Dialogo(ply, "Estou b–");
				falaEscolhaUm4.mostrarFala();
				
				Dialogo falaEscolhaUm5 = new Dialogo(bon, "Que beleza, meu friendo, então temos alguns próblémés a tratar!");
				falaEscolhaUm5.mostrarFala();
				
				Dialogo falaEscolhaUm6 = new Dialogo(ply, "... Tudo bem. O que temos em pauta?");
				falaEscolhaUm6.mostrarFala();
				break;
			case "2":
				Dialogo falaEscolhaDois1 = new Dialogo(ply, "O que que eu fiz pra irritar o Sr. Bonsucesso?");
				falaEscolhaDois1.mostrarFala();
				
				Dialogo falaEscolhaDois2 = new Dialogo(san, "Ele viu que você ajudou a Srta. Silva e agora quer pedir sua ajuda sobre os impostos das fábricas e outros nhemnhemnhem. Industrialistas, sabe. Você realmente deveria se atualizar.");
				falaEscolhaDois2.mostrarFala();
				
				Dialogo falaEscolhaDois3 = new Dialogo(ply, "Por que eu precisaria assistir as notícias, se as suas descrições são tão maravilhosamente explicadas e tão ricas em detalhes?");
				falaEscolhaDois3.mostrarFala();
				
				san.variarSatisfacao(1, false);
				
				Dialogo falaEscolhaDois4 = new Dialogo(san, "Vai tomar no s...");
				falaEscolhaDois4.mostrarFala();
				
				Dialogo falaEscolhaDois5 = new Dialogo(bon, "Rélou, mes amis! Vi a door aberta e entrei!");
				falaEscolhaDois5.mostrarFala();
				
				Dialogo falaEscolhaDois6 = new Dialogo(san, "So long, goodbye!");
				falaEscolhaDois6.mostrarFala();
				
				Dialogo falaEscolhaDois7 = new Dialogo(bon, "Que biutiful empregada vous tenez! E bilíngue também!");
				falaEscolhaDois7.mostrarFala();
				
				Dialogo falaEscolhaDois8 = new Dialogo(ply, "Sim, um amor de pessoa...");
				falaEscolhaDois8.mostrarFala();
				
				Dialogo falaEscolhaDois9 = new Dialogo(bon, "Ah, mas não temos tempo para falar das mulhérés. Temos alguns próblémés a tratar, monsiê le Prefeité!");
				falaEscolhaDois9.mostrarFala();
				
				Dialogo falaEscolhaDois10 = new Dialogo(ply, "Tudo bem, o que temos em pauta?");
				falaEscolhaDois10.mostrarFala();
				break;
			default:
				Dialogo falaCaseDefault1 = new Dialogo(ply, "...");
				falaCaseDefault1.mostrarFala();
				
				Dialogo falaCaseDefault2 = new Dialogo(san, "...");
				falaCaseDefault2.mostrarFala();
				
				Dialogo falaCaseDefault3 = new Dialogo(bon, "...");
				falaCaseDefault3.mostrarFala();
				
				Dialogo falaCaseDefault4 = new Dialogo(bon, "... Por que ele tá encarando a gente desse jeito?");
				falaCaseDefault4.mostrarFala();
				
				Dialogo falaCaseDefault5 = new Dialogo(san, "Sei lá, parece um mecanismo de defesa quando ele não sabe mais o que falar. Vai conversando com ele aí, vê se ele sai desse estado catatônico.");
				falaCaseDefault5.mostrarFala();
				break;
		}
		
		Dialogo fala12 = new Dialogo(bon, "Queria tratar de búsiniss, uma parte da prodúcciom das interpraises está sempre sendo usada for uma tal de ressaikle.");
		fala12.mostrarFala();
		
		Monologo monologo2 = new Monologo("Acho que esse é o final boss da Fisk.\nEspera... ressaikle? Ele quer dizer recicling??\nEsse cara quer que eu deixe ele poluir e ferrar mais a cidade por nada? Ele tem que tá de brinqueixom uíti me!");
		monologo2.mostrarFala();
		
		Dialogo fala13 = new Dialogo(ply, "Vou ver o que eu posso fazer.");
		fala13.mostrarFala();
		
		Dialogo fala14 = new Dialogo(bon, "Mesmo? Seria uma pena se você fizesse uma promise pra um búsinessmên como me sem cumprir. Muitas pipou já tentaram, iú nou? Bocú de pipou.");
		fala14.mostrarFala();
		
		Dialogo fala15 = new Dialogo(ply, "Não entendo como isso possa ser relevante, mas também levarei isso em consideração, Sr. Bonsucesso.");
		fala15.mostrarFala();
		
		Monologo monologo3 = new Monologo("Ele foi embora, graças a Deus! Se eu tivesse que ouvir mais uma frase em franglés brasileiro, eu juro que eu não sobreviveria. Talvez exista um Deus afinal!");
		monologo3.mostrarFala();
		
		Dialogo fala16 = new Dialogo(san, "Então, o que aquele porco de terno queria?");
		fala16.mostrarFala();
		
		Monologo monologo4 = new Monologo("E eu sigo sendo agnóstico...");
		monologo4.mostrarFala();
		
		Dialogo fala17 = new Dialogo(ply, "Quer estragar mais a cidade, quer tirar uma parte da verba destinada à reciclagem e reciclar no bolso dele.");
		fala17.mostrarFala();
		
		Dialogo fala18 = new Dialogo(san, "E o que você vai fazer?");
		fala18.mostrarFala();
		
		// 4º escolha do jogador
		Scanner scanInteracaoUsuario4 = new Scanner(System.in);
		String interacaoUsuario4;
		System.out.printf("[1] REDUZIR A VERBA DE RECICLAGEM EM 80 POR CENTO\n[2] REDUZIR A VERBA DE RECICLAGEM EM 50 POR CENTO\n[3] REDUZIR A VERBA DE RECICLAGEM EM 25 POR CENTO \n[4] NADA\n");
		interacaoUsuario4 = scanInteracaoUsuario4.nextLine();
		
		switch(interacaoUsuario4) {
			case "1":
				Dialogo falaEscolhaUm1 = new Dialogo(ply, "Bom, não tem o que fazer senão tirar os incentivos de reciclagem, pelo menos parcialmente.");
				falaEscolhaUm1.mostrarFala();
				
				bon.variarSatisfacao(3, true);
				flo.variarSatisfacao(2, false);
				san.variarSatisfacao(1, false);
				
				Dialogo falaEscolhaUm2 = new Dialogo(san, "...");
				falaEscolhaUm2.mostrarFala();
				
				Dialogo falaEscolhaUm3 = new Dialogo(ply, "O quê?");
				falaEscolhaUm3.mostrarFala();
				
				Dialogo falaEscolhaUm4 = new Dialogo(san, "Nada, só mais do mesmo.");
				falaEscolhaUm4.mostrarFala();
				break;
			case "2":
				Dialogo falaEscolhaDois1 = new Dialogo(ply, "Acho que posso tentar fazer um agradinho.");
				falaEscolhaDois1.mostrarFala();
				
				Dialogo falaEscolhaDois2 = new Dialogo(san, "O que tem em mente? Além de vento.");
				falaEscolhaDois2.mostrarFala();
				
				Dialogo falaEscolhaDois3 = new Dialogo(ply, "Vou reduzir em 50% a verba de reciclagem. Não vai fazer tanto mal. O que você acha?");
				falaEscolhaDois3.mostrarFala();
				
				bon.variarSatisfacao(2, true);
				flo.variarSatisfacao(1, false);
				san.variarSatisfacao(2, false);
				
				Dialogo falaEscolhaDois4 = new Dialogo(san, "Acho que estamos sendo governados por algum tipo de símio.");
				falaEscolhaDois4.mostrarFala();
				break;
			case "3":
				Dialogo falaEscolhaTres1 = new Dialogo(ply, "Esse cara quer por fogo nessa cidade e eu não vou deixar. Ao invés de reduzir a verba de reciclagem em 100%, vou reduzir em 25%. O que pode dar errado?");
				falaEscolhaTres1.mostrarFala();
				
				bon.variarSatisfacao(1, true);
				flo.variarSatisfacao(1, false);
				
				Dialogo falaEscolhaTres2 = new Dialogo(san, "Uma outra enchente na periferia, talvez...");
				falaEscolhaTres2.mostrarFala();
				
				Dialogo falaEscolhaTres3 = new Dialogo(ply, "O quê?");
				falaEscolhaTres3.mostrarFala();
				
				Dialogo falaEscolhaTres4 = new Dialogo(san, "Nada.");
				falaEscolhaTres4.mostrarFala();
				break;
			case "4":
				Dialogo falaEscolhaQuatro1 = new Dialogo(san, "Vai ficar me olhando até quando?");
				falaEscolhaQuatro1.mostrarFala();
				
				Dialogo falaEscolhaQuatro2 = new Dialogo(ply, "Eu não estava te olhando. Eu estava pensando.");
				falaEscolhaQuatro2.mostrarFala();
				
				Dialogo falaEscolhaQuatro3 = new Dialogo(san, "Ah, faz sentido. A tela congelou com tanta informação numa CPU tão antiga.");
				falaEscolhaQuatro3.mostrarFala();
				
				Dialogo falaEscolhaQuatro4 = new Dialogo(ply, "... Eu tenho 31 anos–");
				falaEscolhaQuatro4.mostrarFala();
				
				Dialogo falaEscolhaQuatro5 = new Dialogo(san, "E qual é a solução que o jovem idoso pensou?");
				falaEscolhaQuatro5.mostrarFala();
				
				Dialogo falaEscolhaQuatro6 = new Dialogo(ply, "Nada.");
				falaEscolhaQuatro6.mostrarFala();
				
				bon.variarSatisfacao(1, false);
				flo.variarSatisfacao(2, true);
				
				Dialogo falaEscolhaQuatro7 = new Dialogo(san, "Como assim nada?");
				falaEscolhaQuatro7.mostrarFala();
				
				Dialogo falaEscolhaQuatro8 = new Dialogo(ply, "Eu não posso arriscar diminuir a verba de reciclagem quando ela já está tão pequena. Imagina quanto saco de lixo a mais você ia ver por aí! Ele quer que as pessoas tenham que pular sacolas de lixo para ir a algum lugar? Mas nem que o Santos volte pra série A.");
				falaEscolhaQuatro8.mostrarFala();
				
				Dialogo falaEscolhaQuatro9 = new Dialogo(san, "Então essa é sua decisão?");
				falaEscolhaQuatro9.mostrarFala();
				
				Monologo monologoEscolhaQuatro1 = new Monologo("Ela tá me olhando estranho...");
				monologoEscolhaQuatro1.mostrarFala();
				
				Dialogo falaEscolhaQuatro10 = new Dialogo(ply, "Algo contra?");
				falaEscolhaQuatro10.mostrarFala();
				
				san.variarSatisfacao(1, true);
				
				Dialogo falaEscolhaQuatro11 = new Dialogo(san, "Você é idealista demais pra merecer um voto sério.");
				
				Monologo monologoEscolhaQuatro2 = new Monologo("ELA CONSEGUE SORRIR?");
				monologoEscolhaQuatro2.mostrarFala();
				falaEscolhaQuatro11.mostrarFala();
				break;
			default:
				Dialogo falaDefaultCase1 = new Dialogo(san, "... Eles estão esperando uma resposta pra hoje, sabe?");
				falaDefaultCase1.mostrarFala();
				
				Dialogo falaDefaultCase2 = new Dialogo(ply, "Eu sei, eu sei. Eu só tava brincando com você, Sandrinha.");
				falaDefaultCase2.mostrarFala();
				
				san.variarSatisfacao(1, false);
				
				Dialogo falaDefaultCase3 = new Dialogo(san, "A gente vota no candidato achando que ele sabe que brincadeira tem hora.");
				falaDefaultCase3.mostrarFala();
				break;
		}
		
		// Game over
		if (bon.getSatisfacao() <= 0) {
			interludio.mostrarFala();
			bon.gameOver();
		} else if (flo.getSatisfacao() <= 0) {
			interludio.mostrarFala();
			flo.gameOver();
		} else if (san.getSatisfacao() <= 0) {
			interludio.mostrarFala();
			san.gameOver();
		} else {
			System.out.println("==EXPEDIENTE ENCERRADO==");
			System.out.println("A satisfação dos Industriais está em: " + bon.getSatisfacao());
			System.out.println("A satisfação dos Ambientalistas está em: " + flo.getSatisfacao());
			System.out.println("A satisfação de sua atual secretária está em: " + san.getSatisfacao());
		}
		
		// LEVEL 3: O LIXO DE UM HOMEM É O DINHEIRO DE OUTRO

		Level level3 = new Level("==NÍVEL 3: O LIXO DE UM HOMEM É O DINHEIRO DE OUTRO==");
		level3.mostrarTitulo();
		
		Monologo monologo5 = new Monologo("Eu tive um pesadelo essa noite.");
		monologo5.mostrarFala();

		Monologo monologo6 = new Monologo("Eu estava dirigindo um carro elétrico até um apartamento que havia alugado em Ubatuba para passar as férias com a minha família. Tive uma discussão com a minha ex, nada muito acalorado. Decidimos que seria melhor se a nossa filha fosse com ela");
		monologo6.mostrarFala();

		Monologo monologo7 = new Monologo("Por mais impossível que pareça, em algum ponto da serra, o volante ficou eletrizado. Impossível em termos de Física, eu podia jurar que um carro fazia uma gaiola de Faraday, mas sonhos não seguem regras. Não sei quantos joules de corrente elétrica passaram por mim, só sei que ficou tudo escuro de repente. Mas eu ainda estava sonhando.");
		monologo7.mostrarFala();

		Monologo monologo8 = new Monologo("Ouvi vozes, uma delas era do Sr. Ricardo Bonsucesso parabenizando uma pessoa pelo trabalho bem feito.");
		monologo8.mostrarFala();

		Monologo monologo9 = new Monologo("Foi nesse momento que me lembrei que a discussão com a minha ex havia sido sobre como eu não estava seguro e ela estava preocupada comigo. E quer saber o pior? Eu ainda tive que pegar um ônibus. A ideia de entrar no meu carro me fazia tremer demais pra conseguir dirigir. E a troco de quê escolhi o ônibus, se passei a viagem inteira achando que ia ser esfaqueado?");
		monologo9.mostrarFala();

		Dialogo fala19 = new Dialogo(san, "Você tá com uma cara horrível.");
		fala19.mostrarFala();
		
		Dialogo fala20 = new Dialogo(ply, "Obrigado, nasci com ela.");
		fala20.mostrarFala();
		
		Dialogo fala21 = new Dialogo(san, "Tem certeza de que você não quer ir num médico, não? Não é muito recomendável pensar nas pautas de hoje com essa cara de cachorro pidão.");
		fala21.mostrarFala();
		
		Dialogo fala22 = new Dialogo(ply, "E o que RAIOS aconteceu enquanto eu dormia pra virar a primeira pauta do dia?");
		fala22.mostrarFala();
		
		Monologo monologo10 = new Monologo("Eu ouço alguém bater à porta. Antes que eu possa dizer qualquer coisa, ela tomba por terra.");
		monologo10.mostrarFala();
		
		Dialogo fala23 = new Dialogo(bon, "Bonjour!");
		fala23.mostrarFala();
		
		Dialogo fala24 = new Dialogo(ply, "O senhor arrombou a porta da prefeitura...?");
		fala24.mostrarFala();
		
		Dialogo fala25 = new Dialogo(bon, "Arrombar? Non, non, non, eu apenas fiz uma force com meus shoulders quando percebi que ela não queria abrir.");
		fala25.mostrarFala();
		
		Monologo monologo11 = new Monologo("Não foi um pesadelo. Foi tudo verdade, eu estou morto, e este é o meu Inferno.");
		monologo11.mostrarFala();
		
		Dialogo fala26 = new Dialogo(flo, "Com licença...? Eu espero que não seja rude, eu vi a porta aberta e–");
		fala26.mostrarFala();
		
		Dialogo fala27 = new Dialogo(bon, "Ah, é você, little girl. Mas que coincidência mais éstrangé.");
		fala27.mostrarFala();
		
		Dialogo fala28 = new Dialogo(san, "Eu não estou gostando das vibes neste Chilli's esta noite. Eu acho que eu vou ind—");
		fala28.mostrarFala();
		
		Dialogo fala29 = new Dialogo(ply, "NÃO, você FICA. Se pra mais nada, você fica por suporte moral. Eu quero entender por que, exatamente, esses dois entraram aqui sem mais e nem menos.");
		fala29.mostrarFala();
		
		Dialogo fala30 = new Dialogo(bon, "Não desperdice o seu oxygéné com explicações, minha flower de esplendor. Eu cuido das explications. Sabe, monsiê le Préféité, sou eu quem faz essa cidade ir pra frente. Franquias de roupas, joias, mineração... de escái is de limite!");
		fala30.mostrarFala();
		
		Dialogo fala31 = new Dialogo(bon, "E, veja bem, eu estava pensando... Todas essas interpraises e eu ainda não me aventurei no FUTURO: téquinolojí! Imagine: a nossa mineradora já vai providenciar tudo o que é necessário no processo — cobre, ouro, lítio, e todas essas coisas mequetrefes — e nós vamos transformar Anhanguera no pólo tecnológico do Brasil! Adeus, terceiro mundo!");
		fala31.mostrarFala();
		
		Dialogo fala32 = new Dialogo(bon, "Não precisaríamos nem olhar muito longe! Temos uma big quantity desses minerais bem aqui em áreas que nunca foram exploradas antes! Estou falando de cavernas, estou falando de mares, tudo isso puramente anhanguerês!");
		fala32.mostrarFala();
		
		Dialogo fala33 = new Dialogo(bon, "Mas existe um problema, sabe... Esta lady ao meu lado... Ela é contra o progresso.");
		fala33.mostrarFala();
		
		Dialogo fala34 = new Dialogo(flo, "Eu sou contra essa mineração sem limites que a Bonsucesso Ltda. patrocina. Se ainda fosse por uma boa causa...");
		fala34.mostrarFala();
		
		Dialogo fala35 = new Dialogo(bon, "É uma boa causa, lirou fren! O progresso colocará Anhanguera como uma titã de inovações tecnológicas, e esse creizi progrés necessita de minérios!");
		fala35.mostrarFala();
		
		Dialogo fala36 = new Dialogo(flo, "Se o senhor pensa que computadores que só podem durar dois anos é progresso, então sim, a Bonsucesso Ltda. tratá progresso... O problema é que vem com ele.");
		fala36.mostrarFala();
		
		Dialogo fala37 = new Dialogo(bon, "O que é que você tem contra money?");
		fala37.mostrarFala();
		
		Dialogo fala38 = new Dialogo(ply, "[TOSSE]");
		fala38.mostrarFala();
		
		Monologo monologo12 = new Monologo("Todo mundo olhou pra mim. Bom.");
		monologo12.mostrarFala();
		
		Dialogo fala39 = new Dialogo(ply, "O que, exatamente, vocês querem de mim?");
		fala39.mostrarFala();
		
		Dialogo fala40 = new Dialogo(bon, "Uma relaxação nas leis de exploração de minérios, é claro!");
		fala40.mostrarFala();
		
		Dialogo fala41 = new Dialogo(flo, "E eu, o total oposto. O senhor já imaginou quanto lixo digital esse troca-troca vai gerar?");
		fala41.mostrarFala();
		
		Dialogo fala42 = new Dialogo(ply, "Troca-troca?");
		fala42.mostrarFala();
		
		Dialogo fala43 = new Dialogo(bon, "Bem, os compiuters que nós da Bonsucesso Ltda. criaremos não são EXATAMENTE soluções a longo-prazo... Mas as mudanças de um modelo para o outro valem muito a pena! Ou o senhor nunca trocou um celular velho?");
		fala43.mostrarFala();
		
		Dialogo fala44 = new Dialogo(ply, "Eu... eu ainda uso um tijolão, na verdade.");
		fala44.mostrarFala();
		
		Dialogo fala45 = new Dialogo(san, "É verdade, não tem nem o jogo da cobrinha.");
		fala45.mostrarFala();
		
		Dialogo fala46 = new Dialogo(ply, "Como você sabe disso?");
		fala46.mostrarFala();
		
		Dialogo fala47 = new Dialogo(san, "Confidencial.");
		fala47.mostrarFala();
		
		Dialogo fala48 = new Dialogo(bon, "UM TIJOLÃO? EM TCHU TAUZEND TUENTI FOR?");
		fala48.mostrarFala();
		
		Dialogo fala49 = new Dialogo(flo, "É, isso... isso é um pouco exagerado, senhor.");
		fala49.mostrarFala();
		
		Monologo monologo13 = new Monologo("Ninguém entende a beleza de clicar várias vezes no teclado hoje em dia...");
		monologo13.mostrarFala();
		
		Monologo monologo14 = new Monologo("Tudo bem, eu preciso decidir alguma coisa. Só queria que fechar os olhos me tornasse invisível por cinco segundos.");
		monologo14.mostrarFala();
		
		// 5º interação do jogador
		Scanner scanInteracaoUsuario5 = new Scanner(System.in);
		String interacaoUsuario5;
		System.out.printf("[1] CONCORDAR COM RICARDO BONSUCESSO\n[2] CONCORDAR COM FLORA DA SILVA\n[3] DIZER QUE VAI PENSAR NISSO E NÃO PENSAR NISSO\n");
		interacaoUsuario5 = scanInteracaoUsuario5.nextLine();
		
		switch(interacaoUsuario5) {
			case "1":
				Dialogo falaEscolhaUm1 = new Dialogo(ply, "É, talvez eu precise mudar o meu celular para um mais novo, no fim das contas... E não vejo por que não poderia ser com um modelo da Bonsucesso Ltda.");
				falaEscolhaUm1.mostrarFala();
				
				bon.variarSatisfacao(3, true);
				
				Dialogo falaEscolhaUm2 = new Dialogo(bon, "O senhor fez uma excelente escolha, monsiê le Préféité! E pode garantir que vai ter um grande desconto quando for lá na techstore!");
				falaEscolhaUm2.mostrarFala();
				
				Dialogo falaEscolhaUm3 = new Dialogo(ply, "Puxa, obriga–");
				falaEscolhaUm3.mostrarFala();
				
				Dialogo falaEscolhaUm4 = new Dialogo(bon, "Um descontasso de 5%!");
				falaEscolhaUm4.mostrarFala();
				
				Dialogo falaEscolhaUm5 = new Dialogo(ply, "É, Ícaro também sonhou alto e acabou queimado...");
				falaEscolhaUm5.mostrarFala();
				
				flo.variarSatisfacao(2, false);
				
				Dialogo falaEscolhaUm6 = new Dialogo(ply, "Eu sinto muito, menina. Infelizmente, o desenvolvimento industrial desta cidade também é uma prioridade aqui na prefeitura.");
				falaEscolhaUm6.mostrarFala();
				
				Dialogo falaEscolhaUm7 = new Dialogo(flo, "Eu espero que isso não tenha consequências de que o senhor se arrependa. Espero mesmo.");
				falaEscolhaUm7.mostrarFala();
				
				san.variarSatisfacao(2, false);
				
				Dialogo falaEscolhaUm8 = new Dialogo(san, "Eu também espero.");
				falaEscolhaUm8.mostrarFala();
				break;
			case "2":
				Dialogo falaEscolhaDois1 = new Dialogo(ply, "Pessoalmente, gosto bastante do meu Nokia e não vejo por que trocar. Assim como não vejo por que uma loja de computadores e celulares anhanguerense valha mudar a lei.");
				falaEscolhaDois1.mostrarFala();
				
				Dialogo falaEscolhaDois2 = new Dialogo(bon, "O senhor tem certeza? Pode estar cometendo um erro.");
				falaEscolhaDois2.mostrarFala();
				
				Dialogo falaEscolhaDois3 = new Dialogo(ply, "É, tenho certeza. Sabe, anda ficando difícil de respirar nesses últimos e eu não vejo como um bando de explosões aqui perto vai melhorar o cenário atual");
				falaEscolhaDois3.mostrarFala();
				
				flo.variarSatisfacao(3, true);
				
				Dialogo falaEscolhaDois4 = new Dialogo(flo, "O senhor tem razão. Obrigada, senhor prefeito.");
				falaEscolhaDois4.mostrarFala();
				
				Dialogo falaEscolhaDois5 = new Dialogo(ply, "É claro, o Sr. Bonsucesso ainda pode minerar nas regiões em que a extração de matéria é legalizada. Não é do meu interesse impedir seus empreendimentos.");
				falaEscolhaDois5.mostrarFala();
				
				bon.variarSatisfacao(3, false);
				
				Dialogo falaEscolhaDois6 = new Dialogo(bon, "Sabe, a última vez em que alguém se opôs a uma ideia minha... Ele se arrependeu um pouco tarde demais para mudar as coisas entre nós.");
				falaEscolhaDois6.mostrarFala();
				
				Dialogo falaEscolhaDois7 = new Dialogo(ply, "E eu posso saber quem foi essa pessoa?");
				falaEscolhaDois7.mostrarFala();
				
				Dialogo falaEscolhaDois8 = new Dialogo(bon, "Ora, o seu predecessor, é claro!");
				falaEscolhaDois8.mostrarFala();
				
				Dialogo falaEscolhaDois9 = new Dialogo(bon, "Um bom homem... Que Deus o tenha.");
				falaEscolhaDois9.mostrarFala();
				break;
			case "3":
				Dialogo falaEscolhaTres1 = new Dialogo(ply, "Vocês dois têm excelentes pontos. Por que não me descrevem os prós e os contras de cada um, e então eu vejo o que posso fazer daqui a alguns dias?");
				falaEscolhaTres1.mostrarFala();
				
				flo.variarSatisfacao(1, false);
				
				Dialogo falaEscolhaTres2 = new Dialogo(flo, "É sério isso?");
				falaEscolhaTres2.mostrarFala();
				
				bon.variarSatisfacao(1, false);
				
				Dialogo falaEscolhaTres3 = new Dialogo(bon, "Sei...");
				falaEscolhaTres3.mostrarFala();
				
				Dialogo falaEscolhaTres4 = new Dialogo(ply, "Ei, é sério! Eu vou revisar cada um dos seus pontos e repassar meu parecer para vocês.");
				falaEscolhaTres4.mostrarFala();
				
				Dialogo falaEscolhaTres5 = new Dialogo(flo, "Jura com a vida?");
				falaEscolhaTres5.mostrarFala();
				
				Dialogo falaEscolhaTres6 = new Dialogo(ply, "Mas é claro, menina!");
				falaEscolhaTres6.mostrarFala();
				
				Monologo monologoEscolhaTres = new Monologo("Não é como se eu me importasse tanto a esse ponto...");
				monologoEscolhaTres.mostrarFala();
				break;
			default:
				Dialogo falaDefaultCase1 = new Dialogo(san, "... É melhor vocês irem embora, ele fica assim quando tá indeciso.");
				falaDefaultCase1.mostrarFala();
				
				Dialogo falaDefaultCase2 = new Dialogo(flo, "Catatônico assim?");
				falaDefaultCase2.mostrarFala();
				
				bon.variarSatisfacao(1, false);
				
				Dialogo falaDefaultCase3 = new Dialogo(bon, "No meu tempo, chamavam isso de não saber ser macho.");
				falaDefaultCase3.mostrarFala();
				
				Dialogo falaDefaultCase4 = new Dialogo(flo, "O senhor precisa de ajuda com essa ansiedade, Seu Prefeito. Urgente.");
				falaDefaultCase4.mostrarFala();
				
				Monologo monologoDefaultCase1 = new Monologo("Eu esqueci de tomar meus remédios antes de vir. Burro, burro, burro!");
				monologoDefaultCase1.mostrarFala();
				break;
		}
		
		
		// Game over
		if (bon.getSatisfacao() <= 0) {
			interludio.mostrarFala();
			bon.gameOver();
		} else if (flo.getSatisfacao() <= 0) {
			interludio.mostrarFala();
			flo.gameOver();
		} else if (san.getSatisfacao() <= 0) {
			interludio.mostrarFala();
			san.gameOver();
		} else {
			System.out.println("==OBRIGADO POR JOGAR!==");
		}
		
		// Scanner.close();
		scanInteracaoUsuario1.close();
		scanInteracaoUsuario2.close();
		scanInteracaoUsuario3.close();
		scanInteracaoUsuario4.close();
		scanInteracaoUsuario5.close();
	}
}
