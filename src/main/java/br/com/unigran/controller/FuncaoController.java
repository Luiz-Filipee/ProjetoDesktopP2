
package br.com.unigran.controller;

import br.com.unigran.DTO.FuncaoDTO;
import br.com.unigran.model.Funcao;
import br.com.unigran.persistencia.DentistaDao;
import br.com.unigran.persistencia.DentistaImp;



public class FuncaoController extends GenericoController<Funcao, FuncaoDTO>{

    private DentistaDao dentistaDao = new DentistaImp();
    
    @Override
    protected DentistaDao getDao() {
        return dentistaDao;
    }

    @Override
    protected Funcao builderEntity(FuncaoDTO dto) {
        return dto.builder();
    }
}
