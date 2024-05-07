package game;

public class Dialogo extends Fala {
    private Personagem nome;

    public Dialogo(Personagem nome, String dialogo) {
        this.nome = nome;
        this.texto = dialogo;
    }

    public void setNomePersonagem(Personagem nome) {
        this.nome = nome;
    }

    public Personagem getNomePersonagem() {
        return nome;
    }

    @Override
    public void mostrarFala() {
        System.out.println(nome + ": " + texto);
        pressioneQualquerTeclaParaContinuar();
    }
}
