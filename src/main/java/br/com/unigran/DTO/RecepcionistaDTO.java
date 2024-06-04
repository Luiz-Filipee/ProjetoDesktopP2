/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Recepcionista;
import java.util.LinkedList;
import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RecepcionistaDTO extends GenericoDTO<Recepcionista>{

    public Long id;
    public String nome;
    public LoginDTO login;

    public RecepcionistaDTO(Recepcionista recepcionista) {
        this.id = recepcionista.getId();
    }
    
    @Override
    public Recepcionista builder() {
        Recepcionista recepcionista = new Recepcionista();
        recepcionista.setId(this.id);
        recepcionista.setNome(this.nome);
        if(login != null){
            recepcionista.setLogin(login.builder());
        }
        return recepcionista;
    }
    
    @Override
    public List getListaDados(List<Recepcionista> dados) {
        List dadosDTO = new LinkedList();
        for (Recepcionista dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
    
    @Override
    public Object converte(Recepcionista recepcionista) {
        RecepcionistaDTO dto= new RecepcionistaDTO();
        dto.nome = recepcionista.getNome();
        dto.id = recepcionista.getId();
        return dto;
    }
    
}
