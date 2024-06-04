/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.DTO.EstadoDTO;
import br.com.unigran.model.Estado;
import br.com.unigran.persistencia.EstadoDao;
import br.com.unigran.persistencia.EstadoImp;
import java.util.List;

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

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(EstadoDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}