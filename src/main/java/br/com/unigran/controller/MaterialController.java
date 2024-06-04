/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.DTO.MaterialDTO;
import br.com.unigran.model.Material;
import br.com.unigran.persistencia.MaterialDao;
import br.com.unigran.persistencia.MaterialImp;
import java.util.List;

/**
 *
 * @author user
 */
public class MaterialController extends GenericoController<Material, MaterialDTO>{
    
    private final MaterialDao materialDao = new MaterialImp();

    @Override
    protected MaterialDao getDao() {
        return materialDao;
    }

    @Override
    protected Material builderEntity(MaterialDTO dto) {
        return dto.builder();
    }

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(MaterialDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
