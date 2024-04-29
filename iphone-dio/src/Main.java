import Iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Mecanismos de navegação:");
        System.out.println("************************");
        System.out.println(iphone.adicionarNovaAba());
        System.out.println(iphone.exibirPagina());
        System.out.println(iphone.atualizarPagina());
        System.out.println("************************");
        System.out.println("\n");

        System.out.println("Mecanismos de telefonia:");
        System.out.println("************************");
        System.out.println(iphone.ligar());
        System.out.println(iphone.iniciarCorreioVoz());
        System.out.println(iphone.atender());
        System.out.println("************************");
        System.out.println("\n");

        System.out.println("Mecanismos do reprodutor musical:");
        System.out.println("************************");
        System.out.println(iphone.selecionarMusica());
        System.out.println(iphone.tocar());
        System.out.println(iphone.pausar());
        System.out.println("************************");
        System.out.println("\n");
    }
}