/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.model.Agendamento;
import br.com.unigran.model.Consulta;

/**
 *
 * @author user
 */
public class AgendamentoImp extends AgendamentoDao{

    @Override
    public void marcarConsulta(Agendamento agendamento) {
        em.createNativeQuery("INSERT INTO Agendamento(paciente, dentista, horario, dataAgendamento)"
                + "VALUES (:paciente, :dentista, :horario, :dataAgendamento)")
                .setParameter("paciente", agendamento.getPaciente())
                .setParameter("dentista", agendamento.getDentista())
                .setParameter("horario", agendamento.getHorario())
                .setParameter("dataAgendamento", agendamento.getDataAgendamento())
                .executeUpdate();
    }

    @Override
    public void cancelarConsulta(Consulta consulta) {
        em.createNativeQuery("DELETE FROM Consulta WHERE id = :idConsulta ")
                .setParameter("idConsulta", consulta.getId())
                .executeUpdate();
    }
   
    
}
