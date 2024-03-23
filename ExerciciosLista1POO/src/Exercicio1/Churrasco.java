package Exercicio1;

public class Churrasco {
	double qtdCarne;

	public void verificarConsumo(Pessoa p) {
		if(p.vegetariano == false) {
			if(p.idade <= 3) {
				qtdCarne = 0;
				System.out.println("Essa pessoa consome " +qtdCarne+"kg de carne");
			}
			if(p.idade >3 && p.idade<=12) {
				qtdCarne = 1;
				System.out.println("Essa pessoa consome " +qtdCarne+"kg de carne");
			}
			if(p.idade >13) {
				qtdCarne = 2;
				System.out.println("Essa pessoa consome " +qtdCarne+"kg de carne");
			}
		return;
		}
		System.out.println("A pessoa em questão é vegetariana e não consome carne.");
	}
}