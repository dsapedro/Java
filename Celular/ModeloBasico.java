package Celular;

public class ModeloBasico implements Celular {
    @Override
    public void ligar() {
        System.out.println("Celular básico ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Celular básico desligado");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para: " + numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }
}