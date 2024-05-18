
package br.com.unigran.persistencia;

import br.com.unigran.model.Agendamento;
import br.com.unigran.model.Consulta;

public abstract class ConsultaDao extends Dao {
    
    public abstract void agendarHorario(Agendamento agendamento);
    
    public abstract void registrarConsulta(Consulta consulta);
}
