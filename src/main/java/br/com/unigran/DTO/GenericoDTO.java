/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import java.util.List;

/**
 *
 * @author user
 * @param <T>
 */
public abstract class GenericoDTO<T> {
    
    public abstract T builder();
    public abstract List getListaDados(List<T> dados);
    public abstract Object converte(T t);
}
