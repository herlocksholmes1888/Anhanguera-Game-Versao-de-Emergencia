package game;

public class Main {

	public static void main(String[] args) {
		// DECLARAÇÃO DOS PERSONAGENS
		Player ply = new Player("WASHINGTON LUÍS", 0);
		SandraSuporte san = new SandraSuporte("SANDRA SUPORTE", 5);
		RicardoBonsucesso bon = new RicardoBonsucesso("RICARDO BONSUCESSO", 3);
		FloraSilva flo = new FloraSilva("FLORA DA SILVA", 3);
		
		// LEVEL 1: CONTRA A CORRENTE
		Dialogo fala1 = new Dialogo(san, "Testando");
		fala1.mostrarDialogo();
		
		// LEVEL 2: MALSUCESSO
		
		// LEVEL 3: O LIXO DE UM HOMEM É O DINHEIRO DE OUTRO
	}
}
