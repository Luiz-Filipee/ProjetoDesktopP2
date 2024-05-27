
package br.com.unigran.DTO;

import br.com.unigran.model.Dentista;

public class DentistaDTO extends GenericoDTO<Dentista>{
    
    public String nomeDentista;
    public LoginDTO login;
    
    @Override
    public Dentista builder(){
        Dentista dentista = new Dentista();
        dentista.setNome(nomeDentista);
        if(login != null){
            dentista.setLogin(login.builder());
        }
        return dentista;
    }
}
