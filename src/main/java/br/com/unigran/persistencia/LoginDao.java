/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.DTO.LoginDTO;
import java.util.List;

/**
 *
 * @author user
 */
public abstract class LoginDao extends Dao{
    
    public abstract List listarLogins();

    public abstract LoginDTO autenticaUsuario(String usuario, String senha);

    public abstract LoginDTO buscaIdDoLogin(Long id);
}
