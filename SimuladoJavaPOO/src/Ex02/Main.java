package Ex02;

/* Desenvolva uma classe chamada Semaforo, representando um
 * semaforo de trafego, com as seguintes especificações:
 * 
 * • Um campo privado chamado estado que armazena o estado atual do
 * semaforo. O estado do semaforo pode ser ”Verde”, ”Amarelo” ou ”Veremelho”.
 * 
 * • Um método mudarProximo() que altera o estado do semaforo para o proximo
 * estado na sequência padrão (Verde ⇒ Amarelo ⇒ Vermelho ⇒ Verde).
 * 
 * • Um método mostrarEstado() que imprime o estado atual do semaforo.
 * 
 * • Um método indicar() que indica o que um carro deve fazer de acordo
 * com o estado.*/

public class Main {
	public static void main(String[] args) {
		Semaforo trafego = new Semaforo();
		
		//demonstração:
		//verde
		trafego.mostrarEstado();
		trafego.indicar();
		trafego.mudarProximo();
		
		//amarelo
		trafego.mostrarEstado();
		trafego.indicar();
		trafego.mudarProximo();
		
		//vermelho
		trafego.mostrarEstado();
		trafego.indicar();
		trafego.mudarProximo();
	}
}
