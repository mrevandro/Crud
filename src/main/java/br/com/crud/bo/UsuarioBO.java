package br.com.crud.bo;

import br.com.crud.entity.Usuario;
import br.com.crud.util.JPAUtil;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by eosilva on 04/12/2015.
 */
@Dependent
@Transactional
public class UsuarioBO {

    private EntityManager em;

    public UsuarioBO() {
        em = JPAUtil.openConnection();
    }

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
