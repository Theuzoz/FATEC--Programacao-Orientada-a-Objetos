package Ex01;

import java.util.ArrayList;
import java.util.List;

public class Onibus {
	private double preco;
	private List<Passageiro> passageiros;

    public Onibus(double preco) {
        this.preco = preco;
        passageiros = new ArrayList<>();
    }
    
    public void adicionar(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void listar() {
    	System.out.println("Lista de passageiros:");
        for (Passageiro passageiro : passageiros) {
            System.out.println(passageiro.getNome());
        }
    }

    public void listarEst() {
    	System.out.println("\nLista de passageiros estudantes:");
        for (Passageiro passageiro : passageiros) {
            if (passageiro.isEstudante()) {
                System.out.println(passageiro.getNome());
            }
        }
    }
    
    public double calcularPreco() {
        double total = 0;
        for (Passageiro passageiro : passageiros) {
        	 total += preco;
             if (passageiro.isEstudante()) total -= preco / 2;
        }
        return total;
    }
    
    public void mostrarPreco() {
    	System.out.println("\nPassagem inteira: "+preco);
    	System.out.println("Passagem estudante: "+preco/2);
    }
}
