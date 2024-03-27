import java.util.ArrayList;

class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        // Criando uma lista de livros ordenados por título
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(new Livro("A Cabana", "William P. Young", 2007));
        livros.add(new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967));
        livros.add(new Livro("O Hobbit", "J.R.R. Tolkien", 1937));
        livros.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        livros.add(new Livro("Orgulho e Preconceito", "Jane Austen", 1813));
        livros.add(new Livro("1984", "George Orwell", 1949));
        livros.add(new Livro("A Revolução dos Bichos", "George Orwell", 1945));

        // Livro a ser buscado
        String livroProcurado = "O Hobbit";

        // Realizando a busca binária
        int posicao = buscaBinaria(livros, livroProcurado);

        // Verificando se o livro foi encontrado
        if (posicao != -1) {
            Livro livroEncontrado = livros.get(posicao);
            System.out.println("Livro encontrado na posição " + posicao + ":");
            System.out.println("Título: " + livroEncontrado.titulo);
            System.out.println("Autor: " + livroEncontrado.autor);
            System.out.println("Ano de publicação: " + livroEncontrado.anoPublicacao);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    // Método de busca binária
    public static int buscaBinaria(ArrayList<Livro> livros, String livroProcurado) {
        int inicio = 0;
        int fim = livros.size() - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = livroProcurado.compareTo(livros.get(meio).titulo);

            // Se o livro estiver na posição do meio
            if (comparacao == 0) {
                return meio;
            }
            // Se o livro estiver antes do meio
            else if (comparacao < 0) {
                fim = meio - 1;
            }
            // Se o livro estiver depois do meio
            else {
                inicio = meio + 1;
            }
        }

        // Livro não encontrado
        return -1;
    }
}
