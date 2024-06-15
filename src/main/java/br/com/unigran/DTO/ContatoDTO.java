/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Contato;
import java.util.List;

/**
 *
 * @author user
 */
public class ContatoDTO extends GenericoDTO<Contato>{
    
    public Long id;
    public String email;
    public String numeroContato1;
    public String numeroContato2;
    
    public ContatoDTO(Contato contato){
        this.id = contato.getId();
    }

    @Override
    public Contato builder() {
        Contato contato = new Contato();
        contato.setId(this.id);
        contato.setEmail(this.email);
        contato.setNumeroContato1(this.numeroContato1);
        contato.setNumeroContato2(this.numeroContato2);
        return contato;
    }

    @Override
    public List getListaDados(List<Contato> dados) {
        return null;
    }

    @Override
    public Object converte(Contato t) {
        return null;
    }
    
}
