package br.com.crud.bo;

import br.com.crud.entity.Aluno;
import br.com.crud.util.JPAUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by eosilva on 04/12/2015.
 */
@Dependent
@Transactional
public class AlunoBO {

    private EntityManager em;

    public AlunoBO() {
        em = JPAUtil.openConnection();
    }

    public Aluno save(Aluno aluno){
        return em.merge(aluno);
    };

    public Boolean remove(List<Long> ids){
        try {
            for (Long id : ids)
                em.remove(em.find(Aluno.class, id));
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public Aluno findById(Long id){
        return em.find(Aluno.class, id);
    };

    public List<Aluno> listAll(){
        return em.createQuery("SELECT a FROM Aluno a").getResultList();
    }

    public List<Aluno> listByFilter(String search, String filter, Boolean active){
        Session session = (Session) em.getDelegate();
        Criteria filtroC = session.createCriteria(Aluno.class);

        if(search!=null && filter!=null && !search.isEmpty() && !filter.isEmpty()){
            if(filter.equals("Nome")){
                filtroC.add(Restrictions.ilike("nome", search+"%"));
            }else{
                filtroC.add(Restrictions.eq("id", Integer.parseInt(search)));
            }
        }

        if(active!=null && active){
            filtroC.add(Restrictions.eq("ativo", active));
        }
        if(active!=null && !active){
            filtroC.add(Restrictions.eq("ativo", active));
        }

        filtroC.addOrder(Order.asc("nome"));

        return filtroC.list();
    }
}
