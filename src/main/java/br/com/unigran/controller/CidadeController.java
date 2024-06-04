/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.DTO.CidadeDTO;
import br.com.unigran.model.Cidade;
import br.com.unigran.persistencia.CidadeDao;
import br.com.unigran.persistencia.CidadeImp;
import java.util.List;

/**
 *
 * @author user
 */
public class CidadeController extends GenericoController<Cidade, CidadeDTO>{
    
    private final CidadeDao cidadeDao = new CidadeImp();

    @Override
    protected CidadeDao getDao() {
        return cidadeDao;
    }

    @Override
    protected Cidade builderEntity(CidadeDTO dto) {
        return dto.builder();
    }

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(CidadeDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
