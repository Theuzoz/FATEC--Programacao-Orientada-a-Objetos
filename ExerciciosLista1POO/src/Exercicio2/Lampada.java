package Exercicio2;

public class Lampada {
	private int qtdClicks = 0;
	estado estadoLuz;
	
	public Lampada() {
		this.estadoLuz = estado.APAGADA;
	}
	
	public void click() {
		if(this.estadoLuz == estado.ACESA) {
			System.out.println("A luz foi apagada");
			this.estadoLuz = estado.APAGADA;
			return;
		}
		this.estadoLuz = estado.ACESA;
		System.out.println("Luz foi acesa");
		qtdAcendimentos();
	}
	
	private void qtdAcendimentos() {
		qtdClicks++;
		System.out.println("A luz foi acendida " +qtdClicks+ " vezes");
	}
	
	public void checaEstado() {
		System.out.println("A luz esta: "+this.estadoLuz+"\n");
	}
}
