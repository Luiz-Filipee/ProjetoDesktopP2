
package br.com.unigran.controller;

import br.com.unigran.DTO.RecepcionistaDTO;
import br.com.unigran.model.Recepcionista;
import br.com.unigran.persistencia.RecepcionistaDao;
import br.com.unigran.persistencia.RecepcionistaImp;
import java.util.List;

public class RecepcionistaController extends GenericoController<Recepcionista, RecepcionistaDTO> {
    
    private final RecepcionistaDao recepcionistaDao = new RecepcionistaImp();

    @Override
    protected RecepcionistaDao getDao() {
        return recepcionistaDao;
    }

    @Override
    protected Recepcionista builderEntity(RecepcionistaDTO dto) {
        return dto.builder();
    }

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }
    
    @Override
    public Object[] getDados(RecepcionistaDTO o) {
        RecepcionistaDTO dto = (RecepcionistaDTO) o;
        return new Object[]{dto.id, dto.nome};
    }
    
    @Override
    public List getListaDados() {
        List<Recepcionista> dados = recepcionistaDao.listar();
        RecepcionistaDTO recepcionistaDTO = new RecepcionistaDTO();
        return recepcionistaDTO.getListaDados(dados);
    }

    public RecepcionistaDTO buscaPorNome(String text) {
        return recepcionistaDao.buscaPorNome(text);
    }

    
}
