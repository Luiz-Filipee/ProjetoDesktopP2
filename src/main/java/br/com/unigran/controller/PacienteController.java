
package br.com.unigran.controller;

import br.com.unigran.DTO.PacienteDTO;
import br.com.unigran.model.Paciente;
import br.com.unigran.persistencia.PacienteDao;
import br.com.unigran.persistencia.PacienteImp;

public class PacienteController extends GenericoController<Paciente, PacienteDTO>{

    private final PacienteDao pacienteDao = new PacienteImp();
    
    @Override
    protected PacienteDao getDao() {
        return pacienteDao;
    }

    @Override
    protected Paciente builderEntity(PacienteDTO dto) {
        return dto.builder();
    }
    
    public void remove(PacienteDTO dto){
        pacienteDao.remove((dto).builder());
    }
    
}
