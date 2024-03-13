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
public class MeuItem implements Item {

    private int chave;

    @Override
    public int compara(Item it) {
        MeuItem item = (MeuItem) it;
        if (this.chave < item.chave) {
            return -1;
        }
        if (this.chave > item.chave) {
            return 1;
        }
        return 0;
    }

    @Override
    public void alteraChave(Object chave) {
        Integer ch = (Integer) chave;
        this.chave = ch;
    }

    @Override
    public Object recuperaChave() {
        return this.chave;
    }

}
