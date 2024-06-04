
package br.com.unigran.controller;

import br.com.unigran.DTO.AdministradorDTO;
import br.com.unigran.model.Administrador;
import br.com.unigran.persistencia.AdministradorDao;
import br.com.unigran.persistencia.AdministradorImp;
import java.util.List;

public class AdministradorController extends GenericoController<Administrador, AdministradorDTO>{
    
    private final AdministradorDao administradorDao = new AdministradorImp();
        
    @Override
    protected AdministradorDao getDao() {
        return administradorDao;
    }

    @Override
    protected Administrador builderEntity(AdministradorDTO dto) {
        return dto.builder();
    }

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(AdministradorDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
