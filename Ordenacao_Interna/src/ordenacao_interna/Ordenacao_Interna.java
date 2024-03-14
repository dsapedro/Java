/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao_interna;

/**
 *
 * @author aluno
 */
public class Ordenacao_Interna {

    public static void imprime(Item[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(v[i].recuperaChave() + " ");
        }
    }

    public static void testa(Item[] v, int n) {
        for (int i = 1; i < n; i++) {
            if (v[i].compara(v[i - 1]) < 0) {
                System.out.println("Erro:");
                imprime(v, n);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int tam = 5;
        MeuItem[] a = new MeuItem[tam];
        MeuItem[] b = new MeuItem[tam];
        for (int i = 0; i < tam; i++) {
            a[i] = new MeuItem(i + 1);
        }
        PermutacaoRandomica.permut(a, tam);

        System.out.println("Desordenado:");
        imprime(a, tam);
        System.arraycopy(a, 0, b, 0, tam);

        Ordenacao.insertSort(b);
        System.out.println("Bubble:");
        imprime(b, tam);
    }

}
