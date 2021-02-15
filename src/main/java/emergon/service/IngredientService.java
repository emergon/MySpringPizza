/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.service;

import emergon.entity.Ingredient;
import java.util.List;

/**
 *
 * @author user
 */
public interface IngredientService {
    List<Ingredient> findAll();

    public Ingredient findById(int id);
}
