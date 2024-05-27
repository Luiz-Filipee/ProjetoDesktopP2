/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.persistencia.Dao;

/**
 *
 * @author user
 * @param <T>
 * @param <DTO>
 */
public abstract class GenericoController<T, DTO> {
    
    protected abstract Dao<T> getDao();
    
    protected abstract T builderEntity(DTO dto);
        
    public void salvar(DTO dto) throws Exception {
        getDao().salvar(builderEntity(dto));
    }

    public void atualizar(DTO dto) throws Exception {
        getDao().atualiza(builderEntity(dto));
    }
    
    public void remover(DTO dto) throws Exception{
        getDao().remove(builderEntity(dto));
    }
    
    
 
}
