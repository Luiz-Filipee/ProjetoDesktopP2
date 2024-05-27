/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Login;

/**
 *
 * @author user
 */
public class LoginDTO extends GenericoDTO<Login>{
    
    public Long id;
    public String loginUsername;
    public String senha;
    public FuncaoDTO funcao;
    
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
    
}
