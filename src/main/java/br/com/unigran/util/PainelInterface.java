/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.util;

import br.com.unigran.DTO.GenericoDTO;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public abstract class PainelInterface extends JPanel{
    
    public abstract GenericoDTO salvar();
    public abstract void preencheCampos(GenericoDTO dto);
    
}
