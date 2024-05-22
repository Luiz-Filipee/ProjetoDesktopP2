/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.model.Funcao;

/**
 *
 * @author user
 */
public abstract class FuncaoDao extends Dao{
    
    public abstract void alterarFuncao(Funcao funcao);
}
