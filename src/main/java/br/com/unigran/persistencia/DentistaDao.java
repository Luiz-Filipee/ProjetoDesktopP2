/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.DTO.DentistaDTO;
import br.com.unigran.model.Dentista;
import java.util.List;

/**
 *
 * @author user
 */
 public abstract class DentistaDao extends Dao{
     
    public abstract List<Dentista> listaDentistas();
    
    public abstract DentistaDTO buscaPorNome(String nome);
}
