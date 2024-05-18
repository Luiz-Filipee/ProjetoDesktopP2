/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.model.Paciente;
import java.util.List;

/**
 *
 * @author user
 */
public class PacienteImp extends PacienteDao{

    @Override
    public Paciente buscaPaciente(String filtro) {
        return (Paciente) em.createNativeQuery("SELECT * FROM Paciente WHERE nome = :filtro", Paciente.class)
                .setParameter(filtro, "filtro")
                .getSingleResult();
    }

    @Override
    public List<Paciente> listaPacientes() {
         return em.createNativeQuery("SELECT * FROM Paciente", Paciente.class)
                .getResultList();
    }
    
}
