
package br.com.unigran.persistencia;

import br.com.unigran.model.Funcao;


public class FuncaoImp extends FuncaoDao{

    @Override
    public void alterarFuncao(Funcao funcao) {
        try {
            em.createNativeQuery("UPDATE Funcao SET nome = :novoNome, descricao = :novaDescricao WHERE id = :idFuncao")
                    .setParameter("novoNome", funcao.getNome())
                    .setParameter("novaDescricao", funcao.getDescricao())
                    .setParameter("idFuncao", funcao.getId())
                        .executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a funcao", e);
        }
    }
    
}
