import java.util.ArrayList;
import java.util.Scanner;

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

public class BibliotecaAprimorada {
    public static void main(String[] args) {
        // Criando uma lista de livros
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(new Livro("A Cabana", "William P. Young", 2007));
        livros.add(new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967));
        livros.add(new Livro("O Hobbit", "J.R.R. Tolkien", 1937));
        livros.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        livros.add(new Livro("Orgulho e Preconceito", "Jane Austen", 1813));
        livros.add(new Livro("1984", "George Orwell", 1949));
        livros.add(new Livro("A Revolução dos Bichos", "George Orwell", 1945));

        try (// Pedindo ao usuário o tipo de busca
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha o tipo de busca (1 - Título, 2 - Autor, 3 - Ano de Publicação): ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            // Pedindo ao usuário o termo de busca
            System.out.println("Digite o termo de busca: ");
            String termoBusca = scanner.nextLine().toLowerCase(); // Convertendo para minúsculas para facilitar a comparação

            // Realizando a busca
            switch (escolha) {
                case 1:
                    buscarPorTitulo(livros, termoBusca);
                    break;
                case 2:
                    buscarPorAutor(livros, termoBusca);
                    break;
                case 3:
                    buscarPorAnoPublicacao(livros, termoBusca);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // Método para buscar por título
    public static void buscarPorTitulo(ArrayList<Livro> livros, String termoBusca) {
        for (Livro livro : livros) {
            if (livro.titulo.toLowerCase().contains(termoBusca)) {
                exibirInformacoesLivro(livro);
            }
        }
    }

    // Método para buscar por autor
    public static void buscarPorAutor(ArrayList<Livro> livros, String termoBusca) {
        for (Livro livro : livros) {
            if (livro.autor.toLowerCase().contains(termoBusca)) {
                exibirInformacoesLivro(livro);
            }
        }
    }

    // Método para buscar por ano de publicação
    public static void buscarPorAnoPublicacao(ArrayList<Livro> livros, String termoBusca) {
        for (Livro livro : livros) {
            if (String.valueOf(livro.anoPublicacao).contains(termoBusca)) {
                exibirInformacoesLivro(livro);
            }
        }
    }

    // Método para exibir as informações de um livro
    public static void exibirInformacoesLivro(Livro livro) {
        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Ano de publicação: " + livro.anoPublicacao);
        System.out.println();
    }
}
