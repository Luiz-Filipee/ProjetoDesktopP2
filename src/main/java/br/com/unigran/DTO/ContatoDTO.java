/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Contato;

/**
 *
 * @author user
 */
public abstract class ContatoDTO extends GenericoDTO<Contato>{
    
    public String email;
    public String numeroContato1;
    public String numeroContato2;

    @Override
    public Contato builder() {
        Contato contato = new Contato();
        contato.setEmail(this.email);
        contato.setNumeroContato1(this.numeroContato1);
        contato.setNumeroContato2(this.numeroContato2);
        return contato;
    }
    
}
