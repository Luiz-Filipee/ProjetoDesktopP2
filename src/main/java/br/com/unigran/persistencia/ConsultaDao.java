
package br.com.unigran.persistencia;

import br.com.unigran.DTO.ConsultaDTO;
import br.com.unigran.model.Agendamento;
import br.com.unigran.model.Consulta;
import java.util.List;

public abstract class ConsultaDao extends Dao {
    
    public abstract void agendarHorario(Agendamento agendamento);
    
    public abstract void registrarConsulta(Consulta consulta);

    public abstract List<Consulta> listar();
}
