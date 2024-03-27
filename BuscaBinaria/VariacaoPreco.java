public class VariacaoPreco {
    // Função para encontrar a primeira ocorrência de um elemento em um array ordenado
    public static int findFirstOccurrence(int[] prices, int target) {
        int low = 0;
        int high = prices.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (prices[mid] == target) {
                result = mid;
                high = mid - 1; // Continue buscando à esquerda para encontrar a primeira ocorrência
            } else if (prices[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // Função para encontrar a última ocorrência de um elemento em um array ordenado
    public static int findLastOccurrence(int[] prices, int target) {
        int low = 0;
        int high = prices.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (prices[mid] == target) {
                result = mid;
                low = mid + 1; // Continue buscando à direita para encontrar a última ocorrência
            } else if (prices[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] prices = {10, 20, 20, 20, 30, 30, 30, 40, 50, 50};
        int targetPrice = 20;

        int firstOccurrence = findFirstOccurrence(prices, targetPrice);
        int lastOccurrence = findLastOccurrence(prices, targetPrice);

        if (firstOccurrence != -1 && lastOccurrence != -1) {
            System.out.println("O preço de " + targetPrice + " permanece inalterado desde o índice " + firstOccurrence +
                    " até o índice " + lastOccurrence);
        } else {
            System.out.println("O preço de " + targetPrice + " não foi encontrado no array.");
        }
    }
}
