/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.DTO.RecepcionistaDTO;
import br.com.unigran.model.Consulta;
import br.com.unigran.model.Recepcionista;
import java.util.List;

/**
 *
 * @author user
 */
public abstract class RecepcionistaDao extends Dao{
    
    public abstract void registraPagamento(Consulta consulta);
    
    public abstract List<Recepcionista> listar();

    public abstract RecepcionistaDTO buscaPorNome(String text);
}
