/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.DTO.ProntuarioDTO;
import br.com.unigran.model.Prontuario;
import br.com.unigran.persistencia.ProntuarioDao;
import br.com.unigran.persistencia.ProntuarioImp;

/**
 *
 * @author user
 */
public class ProntuarioController extends GenericoController<Prontuario, ProntuarioDTO>{

    private final ProntuarioDao prontuarioDao = new ProntuarioImp();
    
    @Override
    protected ProntuarioDao getDao() {
        return prontuarioDao;
    }

    @Override
    protected Prontuario builderEntity(ProntuarioDTO dto) {
        return dto.builder();
    }
    
}
