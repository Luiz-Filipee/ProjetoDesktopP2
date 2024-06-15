/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.DTO.LoginDTO;
import br.com.unigran.model.Login;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author user
 */
public class LoginImp extends LoginDao{
    @Override
    public List listarLogins(){
        return em.createNativeQuery("SELECT * FROM Login", Login.class)
                .getResultList();
    }

    @Override
    public LoginDTO autenticaUsuario(String usuario, String senha) {
        try {
            Login login = em.createQuery("SELECT l FROM Login l WHERE l.login = :usuario AND l.senha = :senha", Login.class)
                            .setParameter("usuario", usuario)
                            .setParameter("senha", senha)
                            .getSingleResult();
            return new LoginDTO(login); 
        } catch (NoResultException e) {
            return null; 
        }
    }

    @Override
    public LoginDTO buscaIdDoLogin(Long id) {
        return (LoginDTO) em.createNativeQuery("SELECT id FROM Login WHERE id =: id")
                .setParameter("id", id)
                .getSingleResult();
    }
}
