/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.service;

import emergon.entity.Ingredient;
import emergon.repo.IngredientRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    IngredientRepo ingredientRepo;
    
    @Override
    public List<Ingredient> findAll() {
        return ingredientRepo.findAll();
    }
    
}
