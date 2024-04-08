package Ex01;

/* Exercicio 1.
 * Um passageiro possui nome e pode ser estudante ou não.
 * Em um onibus, passageiros podem ser alocados no sistema de compra de passagem
 * ao onibus. O preço da passagem é definido para cada onibus e sabe-se que um
 * passageiro estudante paga meia. O sistema pode listar os passageiros, listar os
 * estudantes apenas e calcular o total de venda de passagens. */

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
