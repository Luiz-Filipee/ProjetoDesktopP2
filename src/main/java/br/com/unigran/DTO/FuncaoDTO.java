
package br.com.unigran.DTO;

import br.com.unigran.model.Funcao;

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
}
