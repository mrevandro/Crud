package br.com.crud.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by eosilva on 08/12/2015.
 */
public class JPAUtil {
    private static final EntityManagerFactory emf;
    private static final EntityManager em;

    static{
        emf = Persistence.createEntityManagerFactory("CrudUnit");
        em = emf.createEntityManager();
    }

    public static EntityManager openConnection(){
        return em;
    }
}
