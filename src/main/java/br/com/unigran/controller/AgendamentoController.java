
package br.com.unigran.controller;

import br.com.unigran.DTO.AgendamentoDTO;
import br.com.unigran.model.Agendamento;
import br.com.unigran.persistencia.AgendamentoDao;
import br.com.unigran.persistencia.AgendamentoImp;


public class AgendamentoController extends GenericoController<Agendamento, AgendamentoDTO> {
    
    private final AgendamentoDao agendamentoDao = new AgendamentoImp();

    @Override
    protected AgendamentoDao getDao() {
        return agendamentoDao;
    }

    @Override
    protected Agendamento builderEntity(AgendamentoDTO dto) {
        return dto.builder();
    }
    
}
