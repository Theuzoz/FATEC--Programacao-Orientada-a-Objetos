package Ex02;

public class Semaforo {
	enum Estado{
        VERDE,
        AMARELO,
        VERMELHO
    }

    private Estado estado;

    public Semaforo() {
        this.estado = Estado.VERDE;
    }

    public void mudarProximo() {
    	//verde -> amarelo -> vermelho -> verde
        switch (this.estado) {
            case VERDE:
                this.estado = Estado.AMARELO;
                break;
            case AMARELO:
                this.estado = Estado.VERMELHO;
                break;
            case VERMELHO:
                this.estado = Estado.VERDE;
                break;
        }
    }

    public void mostrarEstado() {
        System.out.println("Semáforo: " + this.estado);
    }

    public void indicar() {
        switch (this.estado) {
            case VERDE:
                System.out.println("Pode passar.\n");
                break;
            case AMARELO:
                System.out.println("Atenção, o sinal irá fechar em breve.\n");
                break;
            case VERMELHO:
                System.out.println("Pare, o sinal está vermelho.\n");
                break;
        }
    }

}
