
package br.com.unigran.controller;

import br.com.unigran.DTO.AgendamentoDTO;
import br.com.unigran.model.Agendamento;
import br.com.unigran.persistencia.AgendamentoDao;
import br.com.unigran.persistencia.AgendamentoImp;
import java.util.List;


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

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(AgendamentoDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
