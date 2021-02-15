package emergon.repo;

import java.util.List;
import java.util.Map;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateUtil<E> {
    
    @Autowired
    SessionFactory sessionFactory;
    
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    
    protected List<E> findAll(String namedQuery){
        Query query = getSession().createNamedQuery(namedQuery);
        List<E> list = query.getResultList();
        return list;
    }
    
    protected E findById(String namedQuery, int id){
        Query query = getSession().createNamedQuery(namedQuery);
        query.setParameter("id", id);
        E e = (E) query.getSingleResult();
        return e;
    }
    
    //protected List<E> findByNamedQueryDynamic(String namedQuery, Map<String, Object> parameters){
        //for(Entry e : parameters){
        //    query.setParameter(e.key, e.value);
        //}
    //}
}
