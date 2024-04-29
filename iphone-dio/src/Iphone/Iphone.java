package Iphone;

import Iphone.interfaces.AparelhoTelefonico;
import Iphone.interfaces.NavegadorInternet;
import Iphone.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public String ligar() {
        return "Ligando para contato...";
    }

    @Override
    public String atender() {
        return "Atendendo contato...";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Iniciando Correio Voz...";
    }

    @Override
    public String exibirPagina() {
        return "Exibindo pagina...";
    }

    @Override
    public String adicionarNovaAba() {
        return "Adicionando nova aba...";
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando pagina...";
    }

    @Override
    public String tocar() {
        return "Tocando musica...";
    }

    @Override
    public String pausar() {
        return "Pausando música...";
    }

    @Override
    public String selecionarMusica() {
        return "Selecionando Musica...";
    }
}
