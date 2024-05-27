
package br.com.unigran.DTO;

import br.com.unigran.model.Agendamento;
import java.util.Date;

public class AgendamentoDTO extends GenericoDTO<Agendamento>{
    
    public String horario;
    public Date dataAgendamento;
    public PacienteDTO paciente;
    public DentistaDTO dentista;
    public RecepcionistaDTO recepcionista;
    public ConsultaDTO consulta;
    
    @Override
    public Agendamento builder(){
        Agendamento agendamento = new Agendamento();
        agendamento.setHorario(this.horario);
        agendamento.setDataAgendamento(this.dataAgendamento);
        if(paciente != null){
            agendamento.setPaciente(paciente.builder());
        }
        if(dentista != null){
            agendamento.setDentista(dentista.builder());
        }
        if(recepcionista != null){
            agendamento.setRecepcionista(recepcionista.builder());
        }
        if(consulta != null){
            agendamento.setConsulta(consulta.builder());
        }
        return agendamento;
    }
}
