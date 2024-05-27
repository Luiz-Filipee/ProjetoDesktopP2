
package br.com.unigran.controller;

import br.com.unigran.DTO.GerenteClinicaDTO;
import br.com.unigran.model.GerenteClinica;
import br.com.unigran.persistencia.GerenteClinicaDao;
import br.com.unigran.persistencia.GerenteClinicaImp;

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
    
}
