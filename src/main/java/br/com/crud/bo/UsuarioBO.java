package br.com.crud.bo;

import br.com.crud.entity.Usuario;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by eosilva on 04/12/2015.
 */
@Dependent
@Transactional
public class UsuarioBO {
    @PersistenceContext(name = "CrudUnit")
    private EntityManager em;

    public Usuario save(Usuario usuario){
        return em.merge(usuario);
    };

    public Boolean remove(List<Long> ids){
        try {
            for (Long id : ids)
                em.remove(em.find(Usuario.class, id));
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public Usuario findById(Long id){
        return em.find(Usuario.class, id);
    };

    public List<Usuario> listAll(){
        return em.createQuery("SELECT u FROM Usuario u").getResultList();
    }
}
