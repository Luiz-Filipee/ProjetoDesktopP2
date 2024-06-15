/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.DTO;

import br.com.unigran.model.GerenteClinica;
import br.com.unigran.model.Material;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class GerenteClinicaDTO extends GenericoDTO<GerenteClinica>{
    
    public Long id;
    public String nome;
    public LoginDTO login;
    public List<MaterialDTO> materias;

    @Override
    public GerenteClinica builder() {
        GerenteClinica gerenteClinica = new GerenteClinica();
        gerenteClinica.setId(id);
        gerenteClinica.setNome(this.nome);
        if(login != null){
            gerenteClinica.setLogin(login.builder());
        }
        if(materias != null && materias.isEmpty()){
            List<Material> materialEntidades = new ArrayList<>();
            for(MaterialDTO m : materias){
                materialEntidades.add(m.builder());
            }
            gerenteClinica.setMaterias(materialEntidades);
        }
        return gerenteClinica;
    }

    @Override
    public List getListaDados(List<GerenteClinica> dados) {
           return null;
    }

    @Override
    public Object converte(GerenteClinica t) {
           return null;
    }
    
}
