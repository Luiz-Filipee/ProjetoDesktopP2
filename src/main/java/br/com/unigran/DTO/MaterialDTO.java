/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.Material;

/**
 *
 * @author user
 */
public class MaterialDTO extends GenericoDTO<Material>{
    
    public String nome;
    public int quantidade;
    public int quantidadeMinima;
    public GerenteClinicaDTO gerente;

    @Override
    public Material builder() {
        Material material = new Material();
        material.setNome(this.nome);
        material.setQuantidade(this.quantidade);
        material.setQuantidadeMinima(this.quantidadeMinima);
        if(gerente != null){
            material.setGerente(gerente.builder());
        }
        return material;
    }
    
}
