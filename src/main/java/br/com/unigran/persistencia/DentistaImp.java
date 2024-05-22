
package br.com.unigran.persistencia;

import br.com.unigran.model.Dentista;
import java.util.List;

public class DentistaImp extends DentistaDao{

    @Override
    public List<Dentista> listaDentistas() {
        return em.createNativeQuery("SELECT * FROM Dentista")
                .getResultList();
    }
  }
