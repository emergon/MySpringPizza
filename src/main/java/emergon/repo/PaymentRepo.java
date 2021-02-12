/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.repo;

import emergon.entity.Payment;
import java.util.List;

/**
 *
 * @author user
 */
// SOLID principle
public interface PaymentRepo {
    
    List<Payment> findAll();

    public Payment findById(int id);
    
}
