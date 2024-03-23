package Exercicio6;

/* Implemente uma classe que modele um jogo de adivinhação de
 * numeros de 0 a 99.
 * Atributos: um numero inteiro sorteado.
 * Métodos: sortear(), advinhar().
 * OBS: O objeto para gerar numero aleatorios no Java é o Random;
 * você deve instancia-lo e chamar seu método nextInt()
 * que deve possuir um argumento inteiro, no caso aqui, 100.*/

public class Main {
	
	public static void main(String[] args) {
		AdivinhaNum jogo = new AdivinhaNum();
		
		jogo.sortear();
		jogo.adivinhar();
	}
}
