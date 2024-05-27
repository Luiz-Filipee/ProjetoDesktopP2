package br.com.unigran.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Dao<T> {

    EntityManagerFactory emf=
            Persistence.
                    createEntityManagerFactory("br.com.unigran_ProjetoDesktopP2_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction etx = em.getTransaction();
    
    public void salvar(Object o){
        etx.begin();
        em.persist(o);
        etx.commit();
    }
    
    public void atualiza(Object o){
        etx.begin();
        em.merge(o);
        etx.commit();
    }
    
     public void remove(Object o){
        etx.begin();
        em.remove(o);
        etx.commit();
    }
     
    public void edita(Object o){
        try {
            em.merge(o); 
            etx.commit(); 
        } catch (Exception e) {
            etx.rollback(); 
        }
    }
   
    
}
