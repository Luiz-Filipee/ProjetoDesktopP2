
package br.com.unigran.persistencia;

import br.com.unigran.model.Agendamento;
import br.com.unigran.model.Consulta;

public class ConsultaImp extends ConsultaDao{

    @Override
    public void agendarHorario(Agendamento agendamento) {
         em.createNativeQuery("INSERT INTO Agendamento(paciente, dentista, horario, dataAgendamento)"
                + "VALUES (:paciente, :dentista, :horario, :dataAgendamento)")
                .setParameter("pacienteId", agendamento.getPaciente())
                .setParameter("dentistaId", agendamento.getDentista())
                .setParameter("horario", agendamento.getHorario())
                .setParameter("dataAgendamento", agendamento.getDataAgendamento())
                .executeUpdate();
    }

    @Override
    public void registrarConsulta(Consulta consulta) {
        em.createNativeQuery("INSERT INTO Consulta(paciente, dentista, observacoes, anexos, valor)"
                + "VALUES (:paciente, :dentista, :observacoes, :anexos, :valor)")
                .setParameter("pacienteId", consulta.getPaciente())
                .setParameter("dentistaId", consulta.getDentista())
                .setParameter("observacoes", consulta.getObservacoes())
                .setParameter("anexos", consulta.getAnexos())
                .setParameter("valor", consulta.getValor())
                .executeUpdate();
    }

    
}
