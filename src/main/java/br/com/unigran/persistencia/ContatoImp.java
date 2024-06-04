/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.DTO.ContatoDTO;
import br.com.unigran.model.Contato;
import javax.persistence.NoResultException;

/**
 *
 * @author user
 */
public class ContatoImp extends ContatoDao{

    @Override
    public ContatoDTO buscaPorEmail(String email) {
        try {
            Contato contato = em.createQuery("SELECT l FROM Contato l WHERE l.email = :email", Contato.class)
                            .setParameter("email", email)
                            .getSingleResult();
            return new ContatoDTO(contato); 
        } catch (NoResultException e) {
            return null; 
        }    
    }
}
