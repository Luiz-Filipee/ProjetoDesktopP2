
package br.com.unigran.controller;

import br.com.unigran.DTO.GenericoDTO;
import br.com.unigran.DTO.GerenteClinicaDTO;
import br.com.unigran.model.GerenteClinica;
import br.com.unigran.persistencia.GerenteClinicaDao;
import br.com.unigran.persistencia.GerenteClinicaImp;
import java.util.List;

public class GerenteClinicaController extends GenericoController<GerenteClinica, GerenteClinicaDTO>{
    
    private final GerenteClinicaDao gerenteClinicaDao = new GerenteClinicaImp();

    @Override
    protected GerenteClinicaDao getDao() {
        return gerenteClinicaDao;
    }

    @Override
    protected GerenteClinica builderEntity(GerenteClinicaDTO dto) {
        return dto.builder();
    }

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(GerenteClinicaDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


}
