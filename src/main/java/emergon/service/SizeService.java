/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.service;

import emergon.entity.Sizes;
import java.util.List;


/**
 *
 * @author user
 */
public interface SizeService {
    
    List<Sizes> findAll();

    public Sizes findById(int id);
}
