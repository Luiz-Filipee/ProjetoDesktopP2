/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.DTO.ContatoDTO;
import br.com.unigran.model.Contato;
import br.com.unigran.persistencia.ContatoDao;
import br.com.unigran.persistencia.ContatoImp;
import java.util.List;

/**
 *
 * @author user
 */
public class ContatoController extends GenericoController<Contato, ContatoDTO>{
    
    private final ContatoDao contatoDao = new ContatoImp();

    @Override
    protected ContatoDao getDao() {
        return contatoDao;
    }

    @Override
    protected Contato builderEntity(ContatoDTO dto) {
        return dto.builder();
    }

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(ContatoDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public ContatoDTO buscaPorEmail(String email){
        return contatoDao.buscaPorEmail(email);
    }
    
}
