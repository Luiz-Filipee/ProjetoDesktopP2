
package br.com.unigran.controller;

import br.com.unigran.DTO.ConsultaDTO;
import br.com.unigran.model.Consulta;
import br.com.unigran.persistencia.ConsultaDao;
import br.com.unigran.persistencia.ConsultaImp;
import java.util.List;


public class ConsultaController extends GenericoController<Consulta, ConsultaDTO>{

    private final ConsultaDao consultaDao = new ConsultaImp();
    
    @Override
    protected ConsultaDao getDao() {
        return consultaDao;
    }

    @Override
    protected Consulta builderEntity(ConsultaDTO dto) {
        return dto.builder();
    }

    public List<ConsultaDTO> listar() {
        return consultaDao.listar();
    }
}
