/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.model.Login;
import java.util.List;

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
}
