package Exercicio4;

import java.util.Scanner;
public class Cliente {
	Scanner ler = new Scanner(System.in);
	
	String nome;
	double saldo=0;
	double limite=500;
	double checagem;
	
	public String obterNome() {
		System.out.println("Digite seu nome:");
		nome = ler.nextLine();
		return nome;
	}
	
	public void sacar(double saque){
		if(saque < checagem) {
			saldo = saldo-saque;
			System.out.println("Foi retirado R$"+saque+" da conta "+nome);
			return;
		}
		System.out.println("O valor que deseja sacar é superior ao saldo atual");
	}
	
	public void depositar(double deposito){
		saldo = saldo+deposito;
		System.out.println("Foi depositado R$"+deposito+ " na conta "+nome);
	}
	
	public void checarSaldo(){
		checagem = saldo+limite;
		System.out.println("Conta: "+nome+"\nSaldo atual: R$"+saldo +"\nLimite: R$"+checagem);
		System.out.print("\n");
	}
}
