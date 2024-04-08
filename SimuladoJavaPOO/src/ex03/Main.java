package ex03;

/* É necessario escrever um programa para gerar saıdas na seguinte forma
(apenas um exemplo possıvel): {produtoNome: "CANETA", preco: 2.30, tipo: "Escritorio"}.
Escreva uma classe de forma a obter a saıda desejada.
*/

public class Main {
	public static void main(String[] args) {
		Produto p1 = new Produto("CANETA", 2.30, "Escritório");
		//produto nomeProduto = new Produto("OBJETO", valor, "tipo");
		
		p1.mostrarProduto();
		//nomeProduto.mostrarProduto();
	}
}
