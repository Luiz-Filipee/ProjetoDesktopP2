/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.model.Cidade;
import java.util.List;

/**
 *
 * @author user
 */
public abstract class CidadeDao extends Dao{
    
    public abstract List<Cidade> listarCidades();
}
