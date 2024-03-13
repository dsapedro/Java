package Celular;

import java.util.ArrayList;
import java.util.List;

public class ModeloAvancado implements Celular {
    private List<String> historicoLigacoes = new ArrayList<>();
    private List<String> historicoMensagens = new ArrayList<>();

    @Override
    public void ligar() {
        System.out.println("Celular avançado ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Celular avançado desligado");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para: " + numero);
        historicoLigacoes.add(numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
        historicoMensagens.add(numero + ": " + mensagem);
    }

    public void mostrarHistoricoLigacoes() {
        System.out.println("Histórico de ligações:");
        for (String ligacao : historicoLigacoes) {
            System.out.println(ligacao);
        }
    }

    public void mostrarHistoricoMensagens() {
        System.out.println("Histórico de mensagens:");
        for (String mensagem : historicoMensagens) {
            System.out.println(mensagem);
        }
    }
}
