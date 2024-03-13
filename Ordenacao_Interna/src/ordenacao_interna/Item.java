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
public interface Item {
    public int compara(Item item);
    public void alteraChave(Object chave);
    public Object recuperaChave();
    
}
