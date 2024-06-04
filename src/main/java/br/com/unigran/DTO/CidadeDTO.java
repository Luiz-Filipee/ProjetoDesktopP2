/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Cidade;
import br.com.unigran.model.Endereco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public abstract class CidadeDTO extends GenericoDTO<Cidade>{
    
   
    private EstadoDTO estado;
    private List<EnderecoDTO> enderecos;
    
    @Override
    public Cidade builder(){
        Cidade cidade = new Cidade();
        if(estado != null){
            cidade.setEstado(estado.builder());
        }
        if(!enderecos.isEmpty() && enderecos != null){
            List<Endereco> enderecoEntidades = new ArrayList<>();
            for (EnderecoDTO enderecoDTO : enderecos){
                enderecoEntidades.add(enderecoDTO.builder());
            }
            cidade.setEnderecos(enderecoEntidades);
        }
        return cidade;
    }
}
