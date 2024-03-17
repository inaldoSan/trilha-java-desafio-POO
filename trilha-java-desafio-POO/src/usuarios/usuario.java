package usuarios;

import aplicacoes.iphone2007.Iphone2007;

public class usuario {
    public static void main(String[] args) throws Exception {
        Iphone2007 iphone = new Iphone2007();
        iphone.ligar();
        iphone.tocar();
        iphone.exibirPagina();
    }
}
