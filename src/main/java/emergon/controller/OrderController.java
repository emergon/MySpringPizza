/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.controller;

import emergon.entity.Ingredient;
import emergon.entity.Orders;
import emergon.entity.Payment;
import emergon.entity.Sizes;
import emergon.service.IngredientService;
import emergon.service.PaymentService;
import emergon.service.SizeService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    SizeService sizeService;
    @Autowired
    PaymentService paymentService;
    @Autowired
    IngredientService ingredientService;
    
    @ModelAttribute("sizes")
    public List<Sizes> getSizes(){
        return sizeService.findAll();
    }
    
    @ModelAttribute("payments")
    public List<Payment> getPayments(){
        return paymentService.findAll();
    }
    
    @ModelAttribute("ingredients")
    public List<Ingredient> getIngredients(){
        return ingredientService.findAll();
    }
    
    @GetMapping()
    public String showOrderForm(@ModelAttribute("paragelia") Orders order){
        return "orderForm";
    }
    
    @PostMapping("/process")
    public String processOrder(@ModelAttribute("paragelia") @Valid Orders order,
            BindingResult result){//Binding result must come after the @Valid object
        
        if(result.hasErrors()){
            return "orderForm";
        }
        //save object in DB
        return "showOrder";
    }
}