package ex03;

public class Produto {
	private String objeto, tipo;
	private double valor;
	
	public Produto(String objeto, double valor, String tipo){
        this.objeto = objeto;
        this.valor = valor;
        this.tipo = tipo;
    }
	
	public void mostrarProduto() {
		System.out.println("produtoNome: "+objeto+", preço: "+valor+", tipo: "+tipo);
	}
}
