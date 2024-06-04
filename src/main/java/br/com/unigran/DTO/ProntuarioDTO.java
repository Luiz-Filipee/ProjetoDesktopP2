/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Prontuario;

/**
 *
 * @author user
 */
public abstract class ProntuarioDTO extends GenericoDTO<Prontuario>{
    
    public String historico;
    public PacienteDTO paciente;

    @Override
    public Prontuario builder() {
        Prontuario prontuario = new Prontuario();
        prontuario.setHistorico(this.historico);
        if(paciente != null){
            prontuario.setPaciente(paciente.builder());
        }
        return prontuario;
    }
    
}
