/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.model.Consulta;

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
    
    
}
