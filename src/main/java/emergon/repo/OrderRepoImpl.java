/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.repo;

import emergon.entity.Orders;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepoImpl extends HibernateUtil<Orders> implements OrderRepo {

    @Override
    public void save(Orders order) {
        super.save(order);
    }
    
}
