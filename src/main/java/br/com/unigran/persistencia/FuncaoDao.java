
package br.com.unigran.persistencia;

import br.com.unigran.DTO.FuncaoDTO;
import br.com.unigran.model.Funcao;
import java.util.List;

public abstract class FuncaoDao extends Dao{
    
    public abstract void alterarFuncao(Funcao funcao);

    public abstract List<FuncaoDTO> listar();
    
    public abstract FuncaoDTO buscaPorNome(String nome);
}
