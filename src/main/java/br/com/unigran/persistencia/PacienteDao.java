/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.model.Paciente;
import java.util.List;

/**
 *
 * @author user
 */
public abstract class PacienteDao extends Dao{
    
    public abstract Paciente buscaPaciente(String filtro);
    
    public abstract List<Paciente> listaPacientes();
   
}
