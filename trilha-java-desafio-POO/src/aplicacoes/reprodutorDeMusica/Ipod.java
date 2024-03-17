package aplicacoes.reprodutorDeMusica;

public class Ipod implements ReprodutorMusical{

    public void tocar() {
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Pausando musica");
    }

    public void selecionarMusica() {
        System.out.println("selecionando musica");
    }

}
