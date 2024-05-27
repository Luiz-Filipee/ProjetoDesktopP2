
package br.com.unigran.controller;

import br.com.unigran.DTO.RecepcionistaDTO;
import br.com.unigran.model.Recepcionista;
import br.com.unigran.persistencia.RecepcionistaDao;
import br.com.unigran.persistencia.RecepcionistaImp;

public class RecepcionistaController extends GenericoController<Recepcionista, RecepcionistaDTO> {
    
    private final RecepcionistaDao recepcionistaDao = new RecepcionistaImp();

    @Override
    protected RecepcionistaDao getDao() {
        return recepcionistaDao;
    }

    @Override
    protected Recepcionista builderEntity(RecepcionistaDTO dto) {
        return dto.builder();
    }
    
}
