package Exercicio2;

public enum estado {
	ACESA("Acesa"),
	APAGADA("Apagada");
	
	private String estadoLuz;
	
	estado(String estadoLuz){
		this.estadoLuz = estadoLuz;
	}
	
	public String getEstado() {
		return this.estadoLuz;
	}
}
