package Ex01;

public class Passageiro {
	private String nome;
	private boolean estudante;
	
	public Passageiro(String nome, boolean estudante){
        this.nome = nome;
        this.estudante = estudante;
    }
	
	public String getNome(){
        return nome;
    }

    public boolean isEstudante() {
        return estudante;
    }
    
    public void mostrar() {
    	System.out.println("Nome: "+nome);
    	System.out.println("Estudante: "+estudante);
    }
}
