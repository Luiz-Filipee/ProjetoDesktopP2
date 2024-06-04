/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Estado;

/**
 *
 * @author user
 */
public abstract class EstadoDTO extends GenericoDTO<Estado>{

    @Override
    public Estado builder() {
        Estado estado = new Estado();
        return estado;
    }
    
}
