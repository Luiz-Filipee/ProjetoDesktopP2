
package br.com.unigran.controller;

import br.com.unigran.DTO.EnderecoDTO;
import br.com.unigran.model.Endereco;
import br.com.unigran.persistencia.EnderecoDao;
import br.com.unigran.persistencia.EnderecoImp;
import java.util.List;

public class EnderecoController extends GenericoController<Endereco, EnderecoDTO>{
    
    private final EnderecoDao enderecoDao = new EnderecoImp();

    @Override
    protected EnderecoDao getDao() {
        return enderecoDao;
    }

    @Override
    protected Endereco builderEntity(EnderecoDTO dto) {
        return dto.builder();
    }

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(EnderecoDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
