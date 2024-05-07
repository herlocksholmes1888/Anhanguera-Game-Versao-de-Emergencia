package game;

public class Monologo extends Fala {
    public Monologo(String monologo) {
        this.texto = monologo;
    }

    @Override
    public void mostrarFala() {
        System.out.println(texto);
        pressioneQualquerTeclaParaContinuar();
    }
}
