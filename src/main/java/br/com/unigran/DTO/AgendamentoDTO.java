
package br.com.unigran.DTO;

import br.com.unigran.model.Agendamento;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
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

    @Override
    public List getListaDados(List<Agendamento> dados) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object converte(Agendamento t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
