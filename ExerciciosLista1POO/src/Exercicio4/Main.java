package Exercicio4;

/* Implemente a classe Cliente que possua os atributos nome,
 * saldo, e limite.
 * Esta deve possuir tambem os métodos sacar(), depositar(),
 * checarSaldo(), e obterNome().
 * Sabe-se que só é possível sacar se o saldo+limite forem superiores
 * a quantia.
 * Os métodos sacar() e depositar() necessitam de parametros.
 * O método checarSaldo deve retornar o valor saldo+limite.
 * O método obterNome() deve retornar o nome do Cliente.*/

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		
		c.obterNome();
		
		c.depositar(1000); //decida quanto quer depositar
		c.checarSaldo();
		
		c.sacar(100); //decida quanto quer retirar
		c.checarSaldo();
		
		c.depositar(37.22); //ultimo deposito/checagem de saldo
		c.checarSaldo();
	}
}
