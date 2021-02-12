package emergon.repo;

import java.util.List;
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
}
