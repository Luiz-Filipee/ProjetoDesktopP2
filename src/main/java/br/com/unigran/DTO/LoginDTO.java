/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Login;
import java.util.List;
import lombok.NoArgsConstructor;

/**
 *
 * @author user
 */
@NoArgsConstructor
public class LoginDTO extends GenericoDTO<Login>{
    
    public Long id;
    public String loginUsername;
    public String senha;
    public FuncaoDTO funcao;
    
    
    public LoginDTO(Login login) {
        this.id = login.getId();
        this.loginUsername = login.getLogin();
        this.senha = login.getSenha();
    }

    @Override
    public Login builder(){
        Login login = new Login();
        login.setId(this.id);
        login.setLogin(this.loginUsername);
        login.setSenha(this.senha);
        if(funcao != null){
            login.setFuncao(funcao.builder());
        }
        return login;
    }

    @Override
    public List getListaDados(List<Login> dados) {
        return List.of();
    }

    @Override
    public Object converte(Login l) {
        LoginDTO dto = new LoginDTO();
        dto.id = l.getId();
        dto.loginUsername = l.getLogin();
        dto.senha = l.getSenha();
//        dto.funcao = l.getFuncao();
        return dto;
    }

    @Override
    public String toString() {
        return "LoginDTO{" + "id=" + id + ", loginUsername=" + loginUsername + ", senha=" + senha + ", funcao=" + funcao + '}';
    }
    
    
    
}
