
package br.com.unigran.controller;

import br.com.unigran.DTO.FuncaoDTO;
import br.com.unigran.model.Funcao;
import br.com.unigran.persistencia.FuncaoDao;
import br.com.unigran.persistencia.FuncaoImp;
import java.util.List;



public class FuncaoController extends GenericoController<Funcao, FuncaoDTO>{

    private final FuncaoDao funcaoDao = new FuncaoImp();
    
    @Override
    protected FuncaoDao getDao() {
        return funcaoDao;
    }

    @Override
    protected Funcao builderEntity(FuncaoDTO dto) {
        return dto.builder();
    }
    
    public List<FuncaoDTO> listar(){
        return funcaoDao.listar();
    }
    
    public FuncaoDTO buscarPorNome(String nome){
        return funcaoDao.buscaPorNome(nome);
    }

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(FuncaoDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
