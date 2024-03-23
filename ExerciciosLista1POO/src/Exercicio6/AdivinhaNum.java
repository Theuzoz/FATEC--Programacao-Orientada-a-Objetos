package Exercicio6;
import java.util.Scanner;
import java.util.Random;

public class AdivinhaNum {
	Scanner ler = new Scanner(System.in);
	Random sorteio = new Random();
	int randomNum;
	int tentativaNum;
	
	public int sortear() {
		randomNum = sorteio.nextInt(100);
		System.out.println("Numero sorteado, tente a sorte de 0 a 99");
		//System.out.println("Ignore isso, apenas para teste o numero é: "+randomNum);
		return randomNum;
	}
	
	public void adivinhar() {
		do{
			System.out.println("Tente adivinhar o numero: ");
			tentativaNum = ler.nextInt();
			if(tentativaNum != randomNum) System.out.println("Errou!");
		}while(tentativaNum != randomNum);
		System.out.println("Parabens você acertou o numero!");
	}
}
