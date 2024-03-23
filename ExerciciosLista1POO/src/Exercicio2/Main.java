package Exercicio2;

/*Implemente uma classe Lampada com os seguintes componentes
 * e faça um teste ao final:
 * Atributos: estado(Enum)
 * 
 * Métodos:
 * click(): ao chamar este método a lampada é colocada no estado ”apagada”
 * caso esteja ”acesa” e é colocado no estado ”acesa” caso esteja ”apagada”.
 * 
 * qtdAcendimentos(): retorna quantas vezes a lampada foi acesa
 * (DICA:este método deve ser chamada no método acima).
 * 
 * checaEstado(): retorna o estado atual da Lampada.*/

public class Main {
	public static void main(String[] args) {
		Lampada l = new Lampada();
		
		l.checaEstado(); //ta apagada
		l.click(); //acende primeira vez
		l.checaEstado(); //ta acesa
		
		l.click(); //apaga
		l.click(); //acende segunda vez
		l.click(); //apaga
		l.checaEstado(); //ta apagada
		
		l.click(); //acende terceira vez
		l.checaEstado(); //ta acesa
	}
}
