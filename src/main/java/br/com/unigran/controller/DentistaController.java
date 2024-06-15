/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unigran.controller;

import br.com.unigran.DTO.DentistaDTO;
import br.com.unigran.model.Dentista;
import br.com.unigran.persistencia.DentistaDao;
import br.com.unigran.persistencia.DentistaImp;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DentistaController extends GenericoController<Dentista, DentistaDTO>{
    
    private final DentistaDao dentistaDao = new DentistaImp();
   
    @Override
    protected DentistaDao getDao() {
        return dentistaDao;
    }

    @Override
    protected Dentista builderEntity(DentistaDTO dto) {
        return dto.builder();
    }
    
    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }
    
    @Override
    public Object[] getDados(DentistaDTO o) {
        DentistaDTO dto = (DentistaDTO) o;
        return new Object[]{dto.id, dto.nomeDentista};
    }
    
    @Override
    public List getListaDados() {
        List<Dentista> dados = dentistaDao.listaDentistas();
        DentistaDTO dentistaDTO = new DentistaDTO();
        return dentistaDTO.getListaDados(dados);
    }

    public DentistaDTO buscaPorNome(String text) {
        return dentistaDao.buscaPorNome(text);
    }
    
}
