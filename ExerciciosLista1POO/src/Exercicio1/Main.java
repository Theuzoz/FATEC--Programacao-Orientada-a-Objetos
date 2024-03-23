package Exercicio1;

/*  Dada a classe Pessoa que possui os atributos: String nome,String sexo,
 * int idade, boolean vegetariana.
 * Faça agora uma classe Churarasco que possua: Atributos: qtdCarne(double);
 * Método: verificarConsumo(): Recebe via parametro uma Pessoa e com isto
 * define a consumação média de carne (quantidade de carne consumida)
 * pessoas de 0 a 3 anos não consomem, vegetarianos tambem não.
 * Pessoas de 4 a 12 anos consomem 1 kilo de carne e
 * de 13 anos em diante 2 kilos de carne.*/

public class Main {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Matheus", "masculino", 24, false);
		Churrasco c = new Churrasco();
		
		System.out.print("Nome: "+p.nome+ "\nSexo: "+p.sexo+ "\nIdade: "+p.idade+ "\n");
		if(p.vegetariano == false) System.out.println("Não é vegetariano");
		
		c.verificarConsumo(p);
	}
}
