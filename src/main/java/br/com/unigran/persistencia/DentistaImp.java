
package br.com.unigran.persistencia;

import br.com.unigran.DTO.DentistaDTO;
import br.com.unigran.model.Dentista;
import java.util.List;
import javax.persistence.NoResultException;

public class DentistaImp extends DentistaDao{

    @Override
    public List<Dentista> listaDentistas() {
        return em.createNativeQuery("SELECT * FROM Dentista")
                .getResultList();
    }

    @Override
    public DentistaDTO buscaPorNome(String nome) {
         try {
            Dentista dentista = em.createQuery("SELECT l FROM Dentista l WHERE l.nome = :filtro", Dentista.class)
                            .setParameter("filtro", nome)
                            .getSingleResult();
            return new DentistaDTO(dentista); 
        } catch (NoResultException e) {
            return null; 
        }    
    }
  }
