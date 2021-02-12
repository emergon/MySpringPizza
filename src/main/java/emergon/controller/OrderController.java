/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.controller;

import emergon.entity.Sizes;
import emergon.service.SizeService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    SizeService sizeService;
    
    @ModelAttribute("sizes")
    public List<Sizes> getSizes(){
        return sizeService.findAll();
    }
    
    @GetMapping()
    public String showOrderForm(Model model){
        return "orderForm";
    }
    
    @PostMapping("/process")
    public String processOrder(
            @RequestParam("size") String size,
            @RequestParam("ingredients") List<String> ingredients,
            @RequestParam("payment") String payment,
            @RequestParam("name") String name,
            @RequestParam("age") String age,
            @RequestParam("order_date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate order_date,
            Model model){
        model.addAttribute("size",size);
        model.addAttribute("ingredients",ingredients);
        model.addAttribute("payment",payment);
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        model.addAttribute("order_date", order_date);
        return "showOrder";
    }
}