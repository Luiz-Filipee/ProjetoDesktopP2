/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.DTO.AgendamentoDTO;
import br.com.unigran.DTO.DentistaDTO;
import br.com.unigran.model.Agendamento;
import br.com.unigran.model.Consulta;
import br.com.unigran.model.Dentista;
import javax.persistence.NoResultException;

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

    @Override
    public AgendamentoDTO buscaPorNome(Long idBusca) {
         try {
            Agendamento agendamento = em.createQuery("SELECT l FROM Agendamento l WHERE l.id = :idBusca", Agendamento.class)
                            .setParameter("idBusca", idBusca)
                            .getSingleResult();
            return new AgendamentoDTO(agendamento); 
        } catch (NoResultException e) {
            return null; 
        }    
    }
   
    
}
