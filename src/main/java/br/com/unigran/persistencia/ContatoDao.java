/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.persistencia;

import br.com.unigran.DTO.ContatoDTO;

/**
 *
 * @author user
 */
public abstract class ContatoDao extends Dao{

    public abstract ContatoDTO buscaPorEmail(String email);
}
