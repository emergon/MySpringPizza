/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.service;

import emergon.entity.Payment;
import java.util.List;


/**
 *
 * @author user
 */
public interface PaymentService {

    List<Payment> findAll();
    
}
