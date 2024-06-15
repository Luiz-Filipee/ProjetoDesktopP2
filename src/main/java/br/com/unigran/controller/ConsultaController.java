
package br.com.unigran.controller;

import br.com.unigran.DTO.ConsultaDTO;
import br.com.unigran.DTO.PacienteDTO;
import br.com.unigran.model.Consulta;
import br.com.unigran.model.Paciente;
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

    public List<Consulta> listar() {
        return consultaDao.listar();
    }
    
    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "valor", "paciente", "dentista", "agendamento"};
    }
    
    @Override
    public Object[] getDados(ConsultaDTO o) {
        ConsultaDTO dto = (ConsultaDTO) o;
        return new Object[]{dto.id, dto.valor ,dto.paciente, dto.dentista, dto.agendamento};
    }
    
    @Override
    public List getListaDados() {
        List<Consulta> dados = consultaDao.listar();
        ConsultaDTO consultaDTO = new ConsultaDTO();
        return consultaDTO.getListaDados(dados);
    }

 
}
