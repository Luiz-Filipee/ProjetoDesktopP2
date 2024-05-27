/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.DTO.EstadoDTO;
import br.com.unigran.model.Estado;
import br.com.unigran.persistencia.EstadoDao;
import br.com.unigran.persistencia.EstadoImp;

/**
 *
 * @author user
 */
public class EstadoController extends GenericoController<Estado, EstadoDTO>{
    
    private final EstadoDao estadoDao = new EstadoImp();

    @Override
    protected EstadoDao getDao() {
        return estadoDao;
    }

    @Override
    protected Estado builderEntity(EstadoDTO dto) {
        return dto.builder();
    }
    
}