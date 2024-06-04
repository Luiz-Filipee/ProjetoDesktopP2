
package br.com.unigran.persistencia;

import br.com.unigran.DTO.FuncaoDTO;
import br.com.unigran.model.Funcao;
import java.util.List;
import javax.persistence.NoResultException;


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

    @Override
    public List<FuncaoDTO> listar() {
        return em.createNativeQuery("SELECT * FROM Funcao")
                .getResultList();
    }

    @Override
    public FuncaoDTO buscaPorNome(String nome) {
        try {
            return em.createQuery("SELECT f FROM Funcao f WHERE f.nome LIKE :nome", FuncaoDTO.class)
                 .setParameter("nome", "%" + nome + "%")
                 .getSingleResult();
        } catch (NoResultException e) {
             return null;
         }
    }
    
}
