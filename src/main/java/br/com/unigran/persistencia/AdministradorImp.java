/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.model.Dentista;
import br.com.unigran.model.Login;
import java.util.List;

/**
 *
 * @author user
 */
public class AdministradorImp extends AdministradorDao{

    @Override
    public void alteraAcesso(Login login) {
        em.createNativeQuery("UPDATE Login SET login = :novoLogin, senha = :novaSenha WHERE id = :idLogin")
            .setParameter("novoLogin", login.getLogin())
            .setParameter("novaSenha", login.getSenha())
            .setParameter("idLogin", login.getId())
            .executeUpdate();
    }

    @Override
    public List<Dentista> listaAdministradores() {
       return em.createNativeQuery("SELECT * FROM Administrador")
                .getResultList();
    }
    
}
