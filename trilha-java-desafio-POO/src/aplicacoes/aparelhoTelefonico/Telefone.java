package aplicacoes.aparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    public void ligar() {
        System.out.println("Fazendo ligação por telefone");
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
