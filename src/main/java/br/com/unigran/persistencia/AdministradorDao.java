/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.model.Login;

/**
 *
 * @author user
 */
public abstract class AdministradorDao extends Dao{
    
    public abstract void alteraAcesso(Login login);
}
