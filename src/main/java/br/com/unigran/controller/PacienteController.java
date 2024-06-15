
package br.com.unigran.controller;

import br.com.unigran.DTO.PacienteDTO;
import br.com.unigran.model.Paciente;
import br.com.unigran.persistencia.PacienteDao;
import br.com.unigran.persistencia.PacienteImp;
import java.util.List;

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
    
    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome" ,"Cpf","Nascimento"};
    }
    
    @Override
    public Object[] getDados(PacienteDTO o) {
        PacienteDTO dto = (PacienteDTO) o;
        return new Object[]{dto.id, dto.nome, dto.cpf, dto.dataNascimento};
    }
    
    @Override
    public List getListaDados() {
        List<Paciente> dados = pacienteDao.listaPacientes();
        PacienteDTO pacienteDTO = new PacienteDTO();
        return pacienteDTO.getListaDados(dados);
    }

    public PacienteDTO buscaPorNome(String text) {
        return pacienteDao.buscaPaciente(text);
    }
}
