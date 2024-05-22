
package br.com.unigran.persistencia;

import br.com.unigran.model.Funcao;

public abstract class FuncaoDao extends Dao{
    
    public abstract void alterarFuncao(Funcao funcao);
}
