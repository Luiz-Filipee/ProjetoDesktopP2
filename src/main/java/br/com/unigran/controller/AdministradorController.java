
package br.com.unigran.controller;

import br.com.unigran.DTO.AdministradorDTO;
import br.com.unigran.model.Administrador;
import br.com.unigran.persistencia.AdministradorDao;
import br.com.unigran.persistencia.AdministradorImp;

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
}
