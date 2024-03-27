import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimo = 1;
        int maximo = 100;
        int tentativas = 0;
        
        System.out.println("Pense em um número entre 1 e 100 e pressione Enter quando estiver pronto.");
        scanner.nextLine();
        
        while (minimo <= maximo) {
            int palpite = (minimo + maximo) / 2;
            tentativas++;
            
            System.out.println("É " + palpite + " o número que você pensou? (Digite 'alto', 'baixo' ou 'correto'):");
            String resposta = scanner.nextLine().toLowerCase();
            
            if (resposta.equals("correto")) {
                System.out.println("Acertei em " + tentativas + " tentativa(s)!");
                break;
            } else if (resposta.equals("alto")) {
                maximo = palpite - 1;
            } else if (resposta.equals("baixo")) {
                minimo = palpite + 1;
            } else {
                System.out.println("Desculpe, não entendi sua resposta. Por favor, responda com 'alto', 'baixo' ou 'correto'.");
            }
        }

        scanner.close();
    }
}
