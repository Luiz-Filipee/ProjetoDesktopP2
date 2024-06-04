/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.DTO.ProntuarioDTO;
import br.com.unigran.model.Consulta;
import br.com.unigran.model.Prontuario;
import java.util.List;

/**
 *
 * @author user
 */
public abstract class ProntuarioDao extends Dao{
    
    public abstract Prontuario getProntuario(Long id);
    
    public abstract List<Consulta> getHistorico();

    public abstract ProntuarioDTO buscaPorId(Long idBusca);
}
