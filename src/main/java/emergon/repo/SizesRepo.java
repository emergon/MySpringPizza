/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.repo;

import emergon.entity.Sizes;
import java.util.List;

/**
 *
 * @author user
 */
// SOLID principle
public interface SizesRepo {
    
    List<Sizes> findAll();

    public Sizes findById(int id);
    
}
