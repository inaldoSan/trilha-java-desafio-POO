package aplicacoes.iphone2007;

import aplicacoes.aparelhoTelefonico.AparelhoTelefonico;
import aplicacoes.navegadorInternet.NavegadorInternet;
import aplicacoes.reprodutorDeMusica.ReprodutorMusical;

public class Iphone2007 implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public void tocar() {
        System.out.println("Iphone tocando musica");
    }

    public void pausar() {
        System.out.println("Iphone pausando musica");
    }

    public void selecionarMusica() {
        System.out.println("Iphone selecionando musica");
    }

    public void exibirPagina() {
        System.out.println("Iphone exibindo pagina web");
       }

    public void adicionarNovaAba() {
        System.out.println("Iphone adicionando pagina web");
       }

    public void atualizarPagina() {
        System.out.println("Iphone atualizando pagina web");
       }

    public void ligar() {
        System.out.println("Iphone fazendo ligação");
    }
    public void atender() {
        System.out.println("Iphone atentendo chamada");
       }

    public void iniciarCorreioVoz() {
        System.out.println("Iphone verificando correio de voz");
    }

}
