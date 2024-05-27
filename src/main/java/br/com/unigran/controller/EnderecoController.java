
package br.com.unigran.controller;

import br.com.unigran.DTO.EnderecoDTO;
import br.com.unigran.model.Endereco;
import br.com.unigran.persistencia.EnderecoDao;
import br.com.unigran.persistencia.EnderecoImp;

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
    
}
