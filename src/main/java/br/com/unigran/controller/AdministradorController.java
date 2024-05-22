
package br.com.unigran.controller;

import br.com.unigran.DTO.AdministradorDTO;
import br.com.unigran.DTO.DentistaDTO;
import br.com.unigran.model.Dentista;
import br.com.unigran.persistencia.AdministradorDao;
import br.com.unigran.persistencia.AdministradorImp;
import java.util.List;

public class AdministradorController {
    AdministradorDao administradorDao = new AdministradorImp();
    
    public void salvar(AdministradorDTO administradorDTO) throws Exception{
        administradorDao.salvar(administradorDTO.builder());
    }
    
    public void atualizar(DentistaDTO dentistaDTO) throws Exception{
        administradorDao.atualiza(dentistaDTO.builder());
    }
    
    public List<Dentista> listarAdministradores(){
        return administradorDao.listaAdministradores();
    }
}
