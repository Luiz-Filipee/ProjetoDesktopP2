
package br.com.unigran.controller;

import br.com.unigran.DTO.FuncaoDTO;
import br.com.unigran.model.Funcao;
import br.com.unigran.persistencia.FuncaoDao;
import br.com.unigran.persistencia.FuncaoImp;



public class FuncaoController extends GenericoController<Funcao, FuncaoDTO>{

    private final FuncaoDao funcaoDao = new FuncaoImp();
    
    @Override
    protected FuncaoDao getDao() {
        return funcaoDao;
    }

    @Override
    protected Funcao builderEntity(FuncaoDTO dto) {
        return dto.builder();
    }
}
