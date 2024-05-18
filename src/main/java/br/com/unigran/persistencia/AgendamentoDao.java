/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.model.Agendamento;
import br.com.unigran.model.Consulta;

/**
 *
 * @author user
 */
public abstract class AgendamentoDao extends Dao{
    
    public abstract void marcarConsulta(Agendamento agendamento);
    
    public abstract void cancelarConsulta(Consulta consulta);

}
