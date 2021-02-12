/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.repo;

import emergon.entity.Sizes;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public class SizesRepoImpl extends HibernateUtil<Sizes> implements SizesRepo{
    
    @Override
    public List<Sizes> findAll() {
        return super.findAll("Sizes.findAll");
    }
    
}
