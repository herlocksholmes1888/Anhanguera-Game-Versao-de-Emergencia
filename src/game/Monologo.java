package game;

public class Monologo {
	private String monologo;
	
	public Monologo(String monologo) {
		this.setMonologo(monologo);
	}

	public void setMonologo(String monologo) {
		this.monologo = monologo;
	}
	
	public String getMonologo() {
		return monologo;
	}
	
	public void mostrarMonologo() {
		System.out.println(monologo);
	}
}
