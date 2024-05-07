package game;

public abstract class Fala {
    protected String texto;

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public abstract void mostrarFala();

    protected void pressioneQualquerTeclaParaContinuar() {
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
}
