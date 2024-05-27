/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Recepcionista;

public class RecepcionistaDTO extends GenericoDTO<Recepcionista>{

    public String nome;
    public LoginDTO login;
    
    @Override
    public Recepcionista builder() {
        Recepcionista recepcionista = new Recepcionista();
        recepcionista.setNome(this.nome);
        if(login != null){
            recepcionista.setLogin(login.builder());
        }
        return recepcionista;
    }
    
}
