
package br.com.unigran.DTO;

import br.com.unigran.model.Administrador;


public class AdministradorDTO extends GenericoDTO<Administrador>{
    public String nome;
    private LoginDTO login;
    
    @Override
    public Administrador builder(){
        Administrador adminstrador = new Administrador();
        adminstrador.setNome(this.nome);
        if(login != null){
            adminstrador.setLogin(login.builder());
        }
        return adminstrador;
    }
}
