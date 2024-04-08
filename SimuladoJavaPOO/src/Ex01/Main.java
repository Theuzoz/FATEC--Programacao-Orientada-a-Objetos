package Ex01;

public class Main {
	public static void main(String[] args) {
		Passageiro p1 = new Passageiro("Matheus", true);
		Passageiro p2 = new Passageiro("Laura", false);
		Onibus onibus = new Onibus(10); //preço 10 conto
		
		onibus.adicionar(p1);
		onibus.adicionar(p2);
		onibus.listar();
		onibus.listarEst();
		onibus.mostrarPreco();
		System.out.println("\nPreço total: "+onibus.calcularPreco());
	}
}
