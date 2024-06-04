
package br.com.unigran.DTO;

import br.com.unigran.model.Dentista;
import java.util.LinkedList;
import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DentistaDTO extends GenericoDTO<Dentista>{
    
    public Long id;
    public String nomeDentista;
    public LoginDTO login;

    public DentistaDTO(Dentista dentista) {
        this.id = dentista.getId();
    }
    
    @Override
    public Dentista builder(){
        Dentista dentista = new Dentista();
        dentista.setId(this.id);
        dentista.setNome(this.nomeDentista);
        if(login != null){
            dentista.setLogin(login.builder());
        }
        return dentista;
    }
    
    @Override
    public List getListaDados(List<Dentista> dados) {
        List dadosDTO = new LinkedList();
        for (Dentista dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
    
    @Override
    public Object converte(Dentista dentista) {
        
        DentistaDTO dto= new DentistaDTO();
        dto.nomeDentista = dentista.getNome();
        dto.id = dentista.getId();
        return dto;
    }
}
