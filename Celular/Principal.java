package Celular;

public class Principal {
    public static void main(String[] args) {
        // Teste com ModeloBasico
        System.out.println("Testando Modelo Básico:");
        Celular celularBasico = new ModeloBasico();
        celularBasico.ligar();
        celularBasico.fazerLigacao("123456789");
        celularBasico.enviarMensagem("987654321", "Olá!");

        // Teste com ModeloAvancado
        System.out.println("\nTestando Modelo Avançado:");
        ModeloAvancado celularAvancado = new ModeloAvancado();
        celularAvancado.ligar();
        celularAvancado.fazerLigacao("987654321");
        celularAvancado.enviarMensagem("123456789", "Oi!");
        celularAvancado.mostrarHistoricoLigacoes();
        celularAvancado.mostrarHistoricoMensagens();
    }
}