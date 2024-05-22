/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.DTO.DentistaDTO;
import br.com.unigran.model.Dentista;
import br.com.unigran.persistencia.DentistaDao;
import br.com.unigran.persistencia.DentistaImp;


public class DentistaController extends GenericoController<Dentista, DentistaDTO>{
    
    DentistaDao dentistaDao = new DentistaImp();
   
    @Override
    protected DentistaDao getDao() {
        return dentistaDao;
    }

    @Override
    protected Dentista builderEntity(DentistaDTO dto) {
        return dto.builder();
    }
    
}
