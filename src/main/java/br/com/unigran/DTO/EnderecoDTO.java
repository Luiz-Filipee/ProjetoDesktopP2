/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Endereco;

/**
 *
 * @author user
 */
public class EnderecoDTO extends GenericoDTO<Endereco>{
    
    private String rua;
    private String estado;
    private PacienteDTO paciente;
    private CidadeDTO cidadeEntity;

    @Override
    public Endereco builder() {
        Endereco endereco = new Endereco();
        endereco.setRua(this.rua);
        endereco.setEstado(this.rua);
        if(paciente != null){
            endereco.setPaciente(paciente.builder());
        }
        if(cidadeEntity != null){
            endereco.setCidade(cidadeEntity.builder());
        }
        return endereco;
    }
    
}
