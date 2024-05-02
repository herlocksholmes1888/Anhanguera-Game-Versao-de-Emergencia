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
		} else {
			System.out.println("EXPEDIENTE ENCERRADO");
			System.out.println("A satisfação dos Industriais está em: " + bon.getSatisfacao());
			System.out.println("A satisfação dos Ambientalistas está em: " + flo.getSatisfacao());
			System.out.println("A satisfação de sua atual secretária está em: " + san.getSatisfacao());
		}
		
		// LEVEL 2: MALSUCESSO
		Level level2 = new Level("NÍVEL 2: MALSUCESSO");
		level2.mostrarTitulo();
		
		Dialogo fala9 = new Dialogo(ply, "Dia novo, vida nova.");
		fala9.mostrarDialogo();
		
		Dialogo fala10 = new Dialogo(san, "Tem um cara estranho querendo falar contigo, ele parece ter algum problema mental grave. É aquele Bonsucesso que eu falei pra você não mexer...");
		fala10.mostrarDialogo();
		
		Dialogo fala11 = new Dialogo(ply, "Ou não. Errei, fui moleque.");
		fala11.mostrarDialogo();
		
		Scanner scanInteracaoUsuario3 = new Scanner(System.in);
		String interacaoUsuario3;
		System.out.printf("[1] PEDIR PARA ENTRAR\n[2] EXIGIR EXPLICAÇÕES\n");
		interacaoUsuario3 = scanInteracaoUsuario3.nextLine();
		
		switch(interacaoUsuario3) {
			case "1":
				Dialogo falaEscolhaUm1 = new Dialogo(ply, "Pode mandar entrar, Sandra.");
				falaEscolhaUm1.mostrarDialogo();
				
				Dialogo falaEscolhaUm2 = new Dialogo(ply, "Boa tarde senhor Bonsucesso, como pos–");
				falaEscolhaUm2.mostrarDialogo();
				
				Dialogo falaEscolhaUm3 = new Dialogo(bon, "Gud murning amigo, como estais?!");
				falaEscolhaUm3.mostrarDialogo();
				
				Dialogo falaEscolhaUm4 = new Dialogo(ply, "Estou b–");
				falaEscolhaUm4.mostrarDialogo();
				
				Dialogo falaEscolhaUm5 = new Dialogo(bon, "Que beleza, meu friendo, então temos alguns próblémés a tratar!");
				falaEscolhaUm5.mostrarDialogo();
				
				Dialogo falaEscolhaUm6 = new Dialogo(ply, "... Tudo bem. O que temos em pauta?");
				falaEscolhaUm6.mostrarDialogo();
				break;
			case "2":
				Dialogo falaEscolhaDois1 = new Dialogo(ply, "O que que eu fiz pra irritar o Sr. Bonsucesso?");
				falaEscolhaDois1.mostrarDialogo();
				
				Dialogo falaEscolhaDois2 = new Dialogo(san, "Ele viu que você ajudou a Srta. Silva e agora quer pedir sua ajuda sobre os impostos das fábricas e outros nhemnhemnhem. Industrialistas, sabe. Você realmente deveria se atualizar.");
				falaEscolhaDois2.mostrarDialogo();
				
				Dialogo falaEscolhaDois3 = new Dialogo(ply, "Por que eu precisaria assistir as notícias, se as suas descrições são tão maravilhosamente explicadas e tão ricas em detalhes?");
				falaEscolhaDois3.mostrarDialogo();
				
				san.variarSatisfacao(1, false);
				
				Dialogo falaEscolhaDois4 = new Dialogo(san, "Vai tomar no s...");
				falaEscolhaDois4.mostrarDialogo();
				
				Dialogo falaEscolhaDois5 = new Dialogo(bon, "Rélou, mes amis! Vi a door aberta e entrei!");
				falaEscolhaDois5.mostrarDialogo();
				
				Dialogo falaEscolhaDois6 = new Dialogo(san, "So long, goodbye!");
				falaEscolhaDois6.mostrarDialogo();
				
				Dialogo falaEscolhaDois7 = new Dialogo(bon, "Que biutiful empregada vous tenez! E bilíngue também!");
				falaEscolhaDois7.mostrarDialogo();
				
				Dialogo falaEscolhaDois8 = new Dialogo(ply, "Sim, um amor de pessoa...");
				falaEscolhaDois8.mostrarDialogo();
				
				Dialogo falaEscolhaDois9 = new Dialogo(bon, "Ah, mas não temos tempo para falar das mulhérés. Temos alguns próblémés a tratar, monsiê le Prefeité!");
				falaEscolhaDois9.mostrarDialogo();
				
				Dialogo falaEscolhaDois10 = new Dialogo(ply, "Tudo bem, o que temos em pauta?");
				falaEscolhaDois10.mostrarDialogo();
				break;
			default:
				break;
		}
		
		Dialogo fala12 = new Dialogo(bon, "Queria tratar de búsiniss, uma parte da prodúcciom das interpraises está sempre sendo usada for uma tal de ressaikle.");
		fala12.mostrarDialogo();
		
		Monologo monologo2 = new Monologo("Acho que esse é o final boss da Fisk.\nEspera... ressaikle? Ele quer dizer recicling??\nEsse cara quer que eu deixe ele poluir e ferrar mais a cidade por nada? Ele tem que tá de brinqueixom uíti me!");
		monologo2.mostrarMonologo();
		
		Dialogo fala13 = new Dialogo(ply, "Vou ver o que eu posso fazer.");
		fala13.mostrarDialogo();
		
		Dialogo fala14 = new Dialogo(bon, "Mesmo? Seria uma pena se você fizesse uma promise pra um búsinessmên como me sem cumprir. Muitas pipou já tentaram, iú nou? Bocú de pipou.");
		fala14.mostrarDialogo();
		
		Dialogo fala15 = new Dialogo(ply, "Não entendo como isso possa ser relevante, mas também levarei isso em consideração, Sr. Bonsucesso.");
		fala15.mostrarDialogo();
		
		Monologo monologo3 = new Monologo("Ele foi embora, graças a Deus! Se eu tivesse que ouvir mais uma frase em franglés brasileiro, eu juro que eu não sobreviveria. Talvez exista um Deus afinal!");
		monologo3.mostrarMonologo();
		
		Dialogo fala16 = new Dialogo(san, "Então, o que aquele porco de terno queria?");
		fala16.mostrarDialogo();
		
		Monologo monologo4 = new Monologo("E eu sigo sendo agnóstico...");
		monologo4.mostrarMonologo();
		
		Dialogo fala17 = new Dialogo(ply, "Quer estragar mais a cidade, quer tirar uma parte da verba destinada à reciclagem e reciclar no bolso dele.");
		fala17.mostrarDialogo();
		
		Dialogo fala18 = new Dialogo(san, "E o que você vai fazer?");
		fala18.mostrarDialogo();
		
		Scanner scanInteracaoUsuario4 = new Scanner(System.in);
		String interacaoUsuario4;
		System.out.printf("[1] REDUZIR A VERBA DE RECICLAGEM EM 80 POR CENTO\n[2] REDUZIR A VERBA DE RECICLAGEM EM 50 POR CENTO\n[3] REDUZIR A VERBA DE RECICLAGEM EM 25 POR CENTO \n[4] NADA\n");
		interacaoUsuario4 = scanInteracaoUsuario4.nextLine();
		
		switch(interacaoUsuario4) {
			case "1":
				Dialogo falaEscolhaUm1 = new Dialogo(ply, "Bom, não tem o que fazer senão tirar os incentivos de reciclagem, pelo menos parcialmente.");
				falaEscolhaUm1.mostrarDialogo();
				
				bon.variarSatisfacao(3, true);
				flo.variarSatisfacao(2, false);
				san.variarSatisfacao(1, false);
				
				Dialogo falaEscolhaUm2 = new Dialogo(san, "...");
				falaEscolhaUm2.mostrarDialogo();
				
				Dialogo falaEscolhaUm3 = new Dialogo(ply, "O quê?");
				falaEscolhaUm3.mostrarDialogo();
				
				Dialogo falaEscolhaUm4 = new Dialogo(san, "Nada, só mais do mesmo");
				falaEscolhaUm4.mostrarDialogo();
				break;
			case "2":
				Dialogo falaEscolhaDois1 = new Dialogo(ply, "Acho que posso tentar fazer um agradinho.");
				falaEscolhaDois1.mostrarDialogo();
				
				Dialogo falaEscolhaDois2 = new Dialogo(san, "O que tem em mente? Além de vento.");
				falaEscolhaDois2.mostrarDialogo();
				
				Dialogo falaEscolhaDois3 = new Dialogo(ply, "Vou reduzir em 50% a verba de reciclagem. Não vai fazer tanto mal. O que você acha?");
				falaEscolhaDois3.mostrarDialogo();
				
				bon.variarSatisfacao(2, true);
				flo.variarSatisfacao(1, false);
				san.variarSatisfacao(2, false);
				
				Dialogo falaEscolhaDois4 = new Dialogo(san, "Acho que estamos sendo governados por algum tipo de símio.");
				falaEscolhaDois4.mostrarDialogo();
				break;
			case "3":
				Dialogo falaEscolhaTres1 = new Dialogo(ply, "Esse cara quer por fogo nessa cidade e eu não vou deixar. Ao invés de reduzir a verba de reciclagem em 100%, vou reduzir em 25%. O que pode dar errado?");
				falaEscolhaTres1.mostrarDialogo();
				
				bon.variarSatisfacao(1, true);
				flo.variarSatisfacao(1, false);
				
				Dialogo falaEscolhaTres2 = new Dialogo(san, "Uma outra enchente na periferia, talvez...");
				falaEscolhaTres2.mostrarDialogo();
				
				Dialogo falaEscolhaTres3 = new Dialogo(ply, "O quê?");
				falaEscolhaTres3.mostrarDialogo();
				
				Dialogo falaEscolhaTres4 = new Dialogo(san, "Nada.");
				falaEscolhaTres4.mostrarDialogo();
				break;
			case "4":
				Dialogo falaEscolhaQuatro1 = new Dialogo(san, "Vai ficar me olhando até quando?");
				falaEscolhaQuatro1.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro2 = new Dialogo(ply, "Eu não estava te olhando. Eu estava pensando.");
				falaEscolhaQuatro2.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro3 = new Dialogo(san, "Ah, faz sentido. A tela congelou com tanta informação numa CPU tão antiga.");
				falaEscolhaQuatro3.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro4 = new Dialogo(ply, "... Eu tenho 31 anos–");
				falaEscolhaQuatro4.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro5 = new Dialogo(san, "E qual é a solução que o jovem idoso pensou?");
				falaEscolhaQuatro5.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro6 = new Dialogo(ply, "Nada.");
				falaEscolhaQuatro6.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro7 = new Dialogo(san, "Como assim nada?");
				falaEscolhaQuatro7.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro8 = new Dialogo(ply, "Eu não posso arriscar diminuir a verba de reciclagem quando ela já está tão pequena. Imagina quanto saco de lixo a mais você ia ver por aí! Ele quer que as pessoas tenham que pular sacolas de lixo para ir a algum lugar? Mas nem que o Santos volte pra série A.");
				falaEscolhaQuatro8.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro9 = new Dialogo(san, "Então essa é sua decisão?");
				falaEscolhaQuatro9.mostrarDialogo();
				
				Monologo monologoEscolhaQuatro1 = new Monologo("Ela tá me olhando estranho...");
				monologoEscolhaQuatro1.mostrarMonologo();
				
				Dialogo falaEscolhaQuatro10 = new Dialogo(ply, "Algo contra?");
				falaEscolhaQuatro10.mostrarDialogo();
				
				Dialogo falaEscolhaQuatro11 = new Dialogo(san, "Você é idealista demais pra merecer um voto sério.");
				
				Monologo monologoEscolhaQuatro2 = new Monologo("ELA CONSEGUE SORRIR?");
				monologoEscolhaQuatro2.mostrarMonologo();
				falaEscolhaQuatro11.mostrarDialogo();
				break;
			default:
				break;
		}
		
		if (san.getSatisfacao() <= 0) {
			interludio.mostrarMonologo();
			san.gameOver();
		} else if (flo.getSatisfacao() <= 0) {
			interludio.mostrarMonologo();
			flo.gameOver();
		} else if (bon.getSatisfacao() <= 0) {
			interludio.mostrarMonologo();
			bon.gameOver();
		} else {
			System.out.println("EXPEDIENTE ENCERRADO");
			System.out.println("A satisfação dos Industriais está em: " + bon.getSatisfacao());
			System.out.println("A satisfação dos Ambientalistas está em: " + flo.getSatisfacao());
			System.out.println("A satisfação de sua atual secretária está em: " + san.getSatisfacao());
		}
		
		// LEVEL 3: O LIXO DE UM HOMEM É O DINHEIRO DE OUTRO
		Level level3 = new Level("NÍVEL 3: O LIXO DE UM HOMEM É O DINHEIRO DE OUTRO");
		level3.mostrarTitulo();
		
		Monologo monologo5 = new Monologo("Eu tive um pesadelo essa noite.\nEu estava dirigindo um carro elétrico até um apartamento que havia alugado em Ubatuba para passar as férias com a minha família. Tive uma discussão com a minha ex, nada muito acalorado. Decidimos que seria melhor se a nossa filha fosse com ela\nPor mais impossível que pareça, em algum ponto da serra, o volante ficou eletrizado. Impossível em termos de Física, eu podia jurar que um carro fazia uma gaiola de Faraday, mas sonhos não seguem regras. Não sei quantos joules de corrente elétrica passaram por mim, só sei que ficou tudo escuro de repente. Mas eu ainda estava sonhando. Ouvi vozes, uma delas era do Sr. Ricardo Bonsucesso parabenizando uma pessoa pelo trabalho bem feito.\nFoi nesse momento que me lembrei que a discussão com a minha ex havia sido sobre como eu não estava seguro e ela estava preocupada comigo. E quer saber o pior? Eu ainda tive que pegar um ônibus. A ideia de entrar no meu carro me fazia tremer demais pra conseguir dirigir. E a troco de quê escolhi o ônibus, se passei a viagem inteira achando que ia ser esfaqueado?");
		monologo5.mostrarMonologo();
		
		Dialogo fala19 = new Dialogo(san, "Você tá com uma cara horrível.");
		fala19.mostrarDialogo();
		
		Dialogo fala20 = new Dialogo(ply, "Obrigado, nasci com ela.");
		fala20.mostrarDialogo();
		
		Dialogo fala21 = new Dialogo(san, "Tem certeza de que você não quer ir num médico, não? Não é muito recomendável pensar nas pautas de hoje com essa cara de cachorro pidão.");
		fala21.mostrarDialogo();
		
		Dialogo fala22 = new Dialogo(ply, "E o que RAIOS aconteceu enquanto eu dormia pra virar a primeira pauta do dia?");
		fala22.mostrarDialogo();
		
		Monologo monologo6 = new Monologo("Eu ouço alguém bater à porta. Antes que eu possa dizer qualquer coisa, ela tomba por terra.");
		monologo6.mostrarMonologo();
		
		Dialogo fala23 = new Dialogo(bon, "Bonjour!");
		fala23.mostrarDialogo();
		
		Dialogo fala24 = new Dialogo(ply, "O senhor arrombou a porta da prefeitura...?");
		fala24.mostrarDialogo();
		
		Dialogo fala25 = new Dialogo(bon, "Arrombar? Non, non, non, eu apenas fiz uma force com meus shoulders quando percebi que ela não queria abrir.");
		fala25.mostrarDialogo();
		
		Monologo monologo7 = new Monologo("Não foi um pesadelo. Foi tudo verdade, eu estou morto, e este é o meu Inferno.");
		monologo7.mostrarMonologo();
		
		Dialogo fala26 = new Dialogo(flo, "Com licença...? Eu espero que não seja rude, eu vi a porta aberta e–");
		fala26.mostrarDialogo();
		
		Dialogo fala27 = new Dialogo(bon, "Ah, é você, little girl. Mas que coincidência mais éstrangé.");
		fala27.mostrarDialogo();
		
		Dialogo fala28 = new Dialogo(san, "Eu não estou gostando das vibes neste Chilli's esta noite. Eu acho que eu vou ind—");
		fala28.mostrarDialogo();
		
		Dialogo fala29 = new Dialogo(ply, "NÃO, você FICA. Se pra mais nada, você fica por suporte moral. Eu quero entender por que, exatamente, esses dois entraram aqui sem mais e nem menos.");
		fala29.mostrarDialogo();
		
		Dialogo fala30 = new Dialogo(bon, "Não desperdice o seu oxygéné com explicações, minha flower de esplendor. Eu cuido das explications. Sabe, monsiê le Préféité, sou eu quem faz essa cidade ir pra frente. Franquias de roupas, joias, mineração... de escái is de limite!");
		fala30.mostrarDialogo();
		
		Dialogo fala31 = new Dialogo(bon, "E, veja bem, eu estava pensando... Todas essas interpraises e eu ainda não me aventurei no FUTURO: téquinolojí! Imagine: a nossa mineradora já vai providenciar tudo o que é necessário no processo — cobre, ouro, lítio, e todas essas coisas mequetrefes — e nós vamos transformar Anhanguera no pólo tecnológico do Brasil! Adeus, terceiro mundo!");
		fala31.mostrarDialogo();
		
		Dialogo fala32 = new Dialogo(bon, "Não precisaríamos nem olhar muito longe! Temos uma big quantity desses minerais bem aqui em áreas que nunca foram exploradas antes! Estou falando de cavernas, estou falando de mares, tudo isso puramente anhanguerês!");
		fala32.mostrarDialogo();
		
		Dialogo fala33 = new Dialogo(bon, "Mas existe um problema, sabe... Esta lady ao meu lado... Ela é contra o progresso.");
		fala33.mostrarDialogo();
		
		Dialogo fala34 = new Dialogo(flo, "Eu sou contra essa mineração sem limites que a Bonsucesso Ltda. patrocina. Se ainda fosse por uma boa causa...");
		fala34.mostrarDialogo();
		
		Dialogo fala35 = new Dialogo(bon, "É uma boa causa, lirou fren! O progresso colocará Anhanguera como uma titã de inovações tecnológicas, e esse creizi progrés necessita de minérios!");
		fala35.mostrarDialogo();
		
		Dialogo fala36 = new Dialogo(flo, "Se o senhor pensa que computadores que só podem durar dois anos é progresso, então sim, a Bonsucesso Ltda. tratá progresso... O problema é que vem com ele.");
		fala36.mostrarDialogo();
		
		Dialogo fala37 = new Dialogo(bon, "O que é que você tem contra money?");
		fala37.mostrarDialogo();
		
		Dialogo fala38 = new Dialogo(ply, "[TOSSE]");
		fala38.mostrarDialogo();
		
		Monologo monologo8 = new Monologo("Todo mundo olhou pra mim. Bom.");
		monologo8.mostrarMonologo();
		
		Dialogo fala39 = new Dialogo(ply, "O que, exatamente, vocês querem de mim?");
		fala39.mostrarDialogo();
		
		Dialogo fala40 = new Dialogo(bon, "Uma relaxação nas leis de exploração de minérios, é claro!");
		fala40.mostrarDialogo();
		
		Dialogo fala41 = new Dialogo(flo, "E eu, o total oposto. O senhor já imaginou quanto lixo digital esse troca-troca vai gerar?");
		fala41.mostrarDialogo();
		
		Dialogo fala42 = new Dialogo(ply, "Troca-troca?");
		fala42.mostrarDialogo();
		
		Dialogo fala43 = new Dialogo(bon, "Bem, os compiuters que nós da Bonsucesso Ltda. criaremos não são EXATAMENTE soluções a longo-prazo... Mas as mudanças de um modelo para o outro valem muito a pena! Ou o senhor nunca trocou um celular velho?");
		fala43.mostrarDialogo();
		
		Dialogo fala44 = new Dialogo(ply, "Eu... eu ainda uso um tijolão, na verdade.");
		fala44.mostrarDialogo();
		
		Dialogo fala45 = new Dialogo(san, "É verdade, não tem nem o jogo da cobrinha.");
		fala45.mostrarDialogo();
		
		Dialogo fala46 = new Dialogo(ply, "Como você sabe disso?");
		fala46.mostrarDialogo();
		
		Dialogo fala47 = new Dialogo(san, "Confidencial.");
		fala47.mostrarDialogo();
		
		Dialogo fala48 = new Dialogo(bon, "UM TIJOLÃO? EM TCHU TAUZEND TUENTI FOR?");
		fala48.mostrarDialogo();
		
		Dialogo fala49 = new Dialogo(flo, "É, isso... isso é um pouco exagerado, senhor.");
		fala49.mostrarDialogo();
		
		Monologo monologo9 = new Monologo("Ninguém entende a beleza de clicar várias vezes no teclado hoje em dia...");
		monologo9.mostrarMonologo();
		
		Monologo monologo10 = new Monologo("Tudo bem, eu preciso decidir alguma coisa. Só queria que fechar os olhos me tornasse invisível por cinco segundos.");
		monologo10.mostrarMonologo();
		
		Scanner scanInteracaoUsuario5 = new Scanner(System.in);
		String interacaoUsuario5;
		System.out.printf("[1] CONCORDAR COM RICARDO BONSUCESSO\n[2]CONCORDAR COM FLORA DA SILVA\n[3] DIZER QUE VAI PENSAR NISSO E NÃO PENSAR NISSO\n");
		interacaoUsuario5 = scanInteracaoUsuario5.nextLine();

	}
}
