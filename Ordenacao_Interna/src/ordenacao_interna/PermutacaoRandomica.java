/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao_interna;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class PermutacaoRandomica {
    public static void permut(Item[] v, int n){
        Random rand = new Random();
        for(int i = n-1; i > 0; i--){
            int j = rand.nextInt(i);
            Item temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
    }
}
