package buscapessoa;

import java.util.ArrayList;

public class BuscaPessoa {

    public static String buscaSequencial(Pessoa[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getIdade() == elemento) {
                return array[i].getNome();
            }
        }
        return null;
    }
    public static ArrayList<String> buscaArmazenada(Pessoa[] array) {
        ArrayList<String> arrayAuxiliar = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getIdade() > 30) {
                arrayAuxiliar.add(array[i].getNome());
            }
        }
        return arrayAuxiliar;
    }

    public static void main(String[] args) {
        Pessoa vinicius = new Pessoa("Vinícius", 41);
        Pessoa daniela = new Pessoa("Daniela", 44);
        Pessoa ana = new Pessoa("Ana", 18);
        Pessoa carla = new Pessoa("Carla", 20);
        Pessoa daniel = new Pessoa("Daniel Paiva", 31);
        Pessoa felipe = new Pessoa("Felipe", 24);
        Pessoa patricia = new Pessoa("Patricia", 23);
        Pessoa rafael = new Pessoa("Rafael", 20);
        Pessoa pedro = new Pessoa("Pedro", 22);
        Pessoa marcela = new Pessoa("Marcela", 24);
        Pessoa amanda = new Pessoa("Amanda", 100);
        Pessoa[] listaPessoas = {vinicius, daniela,
            ana, carla,
            daniel, felipe,
            pedro, patricia,
            rafael, marcela, amanda};
        int elementoProcurado = 100;
        String indice = buscaSequencial(listaPessoas, elementoProcurado);
        if (indice != null ) {
            System.out.println("O nome da pessoa é " + indice);
        } else {
            System.out.println("Elemento não encontrado");
        }
        ArrayList<String> busca = buscaArmazenada(listaPessoas);
        if (busca != null ) {
            System.out.println("As pessoas com idade maior que 30 anos são: " + busca);
        } else {
            System.out.println("Elemento não encontrado");
        }
    }

}
