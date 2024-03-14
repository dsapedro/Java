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
public class Ordenacao {

    public static void bubbleSort(Item[] v) {
        int n = v.length;
        boolean troca;
        do {
            troca = false;
            for (int i = 0; i < n - 1; i++) {
                if (v[i].compara(v[i + 1]) > 0) {
                    Item temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    troca = true;
                }
            }
            n--;
        } while (troca);
    }

    public static void selectionSort(Item[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j].compara(v[min]) < 0) {
                    min = j;
                }
            }
            Item temp = v[min];
            v[min] = v[i];
            v[i] = temp;
        }

    }

    public static void insertSort(Item[] v) {
        for (int i = 1; i < v.length; i++) {
            Item temp = v[i];
            int j = i - 1;
            while (j >= 0 && v[j].compara(temp) > 0) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = temp;
        }
    }

    public static void quickSort(Item v[]) {
        ordena(v, 0, v.length - 1);
    }

    public static void ordena(Item[] v, int esq, int dir) {
        if (esq < dir) {
            int[] p = particao(v, esq, dir);
            ordena(v, esq, p[1]);
            ordena(v, p[0], dir);
        }
    }

    private static int[] particao(Item[] v, int esq, int dir) {
        int i = esq, j = dir;
        Item x = v[(i + j) / 2];
        while (i <= j) {
            while (x.compara(v[i]) > 0) {
                i++;
            }
            while (x.compara(v[j]) < 0) {
                j--;
            }
            if (i <= j) {
                Item temp = v[i];
                v[i] = v[j];
                v[j] = temp;
                i++;
                j--;
            }
        }
        return new int[]{i, j};
    }
}
