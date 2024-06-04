/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.DTO.LoginDTO;
import br.com.unigran.DTO.PacienteDTO;
import br.com.unigran.model.Login;
import br.com.unigran.model.Paciente;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author user
 */
public class PacienteImp extends PacienteDao{

    @Override
    public PacienteDTO buscaPaciente(String filtro) {
         try {
            Paciente paciente = em.createQuery("SELECT l FROM Paciente l WHERE l.nome = :filtro", Paciente.class)
                            .setParameter("filtro", filtro)
                            .getSingleResult();
            return new PacienteDTO(paciente); 
        } catch (NoResultException e) {
            return null; 
        }
    }

    @Override
    public List<Paciente> listaPacientes() {
         return em.createNativeQuery("SELECT * FROM Paciente", Paciente.class)
                .getResultList();
    }
    
   
}
