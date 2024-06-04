
package br.com.unigran.DTO;

import br.com.unigran.model.Funcao;
import java.util.LinkedList;
import java.util.List;

public class FuncaoDTO extends GenericoDTO<Funcao> {
    public String nome;
    public String descricao;
    
    @Override
    public Funcao builder(){
        Funcao funcao = new Funcao();
        funcao.setNome(this.nome);
        funcao.setDescricao(this.descricao);
        return funcao;
    }

    @Override
    public List getListaDados(List<Funcao> dados) {
        List dadosDTO = new LinkedList();
        for (Funcao dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;    }

    @Override
    public Object converte(Funcao f) {
        FuncaoDTO dto= new FuncaoDTO();
        dto.nome = f.getNome();
        dto.descricao = f.getDescricao();
        return dto;
    }
}
