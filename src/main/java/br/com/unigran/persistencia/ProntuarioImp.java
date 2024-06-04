/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.DTO.ProntuarioDTO;
import br.com.unigran.model.Consulta;
import br.com.unigran.model.Prontuario;
import java.util.List;

/**
 *
 * @author user
 */
public class ProntuarioImp extends ProntuarioDao{

    @Override
    public Prontuario getProntuario(Long idBusca) {
        return (Prontuario) em.createNativeQuery("SELECT * FROM Paciente WHERE id = :?", Prontuario.class)
                .setParameter(1, "idBusca")
                .getSingleResult();
              
    }

    @Override
    public List<Consulta> getHistorico() {
        return em.createNativeQuery("SELECT * FROM Consulta", Consulta.class)
                .getResultList();
    }

    @Override
    public ProntuarioDTO buscaPorId(Long idBusca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
