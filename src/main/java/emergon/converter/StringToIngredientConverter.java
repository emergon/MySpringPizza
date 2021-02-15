package emergon.converter;

import emergon.entity.Ingredient;
import emergon.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class StringToIngredientConverter implements Converter<String, Ingredient>{

    @Autowired
    IngredientService service;
    
    @Override
    public Ingredient convert(String s) {
        int id = Integer.parseInt(s);
        System.out.println(">>>>>>>>>Trying to find ingredient with id:"+id);
        Ingredient ingredient = service.findById(id);
        System.out.println(">>>>>>>>>id:"+id+" is the ingredient:"+ingredient.getIname());
        return ingredient;
    }
    
}
