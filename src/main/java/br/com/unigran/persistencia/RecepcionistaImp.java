/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.DTO.PacienteDTO;
import br.com.unigran.DTO.RecepcionistaDTO;
import br.com.unigran.model.Consulta;
import br.com.unigran.model.Paciente;
import br.com.unigran.model.Recepcionista;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author user
 */
public class RecepcionistaImp extends RecepcionistaDao{

    @Override
    public void registraPagamento(Consulta consulta) {
        em.createNativeQuery("UPDATE Consulta SET valor = valorPago WHERE id =: idConsulta", Consulta.class)
                .setParameter("valorPago", consulta.getValor())
                .setParameter("idConsulta",consulta.getId());
    }

    @Override
    public List<Recepcionista> listar() {
        return em.createNativeQuery("SELECT * FROM Recepcionista")
                .getResultList();
    }

    @Override
    public RecepcionistaDTO buscaPorNome(String text) {
        try {
            Recepcionista recepcionista = em.createQuery("SELECT l FROM Recepcionista l WHERE l.nome = :filtro", Recepcionista.class)
                            .setParameter("filtro", text)
                            .getSingleResult();
            return new RecepcionistaDTO(recepcionista); 
        } catch (NoResultException e) {
            return null; 
        }    
    }
    
    
}
