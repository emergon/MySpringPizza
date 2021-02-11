package emergon.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping()
    public String showOrderForm(){
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
        model.addAttribute("order_date",order_date);
        return "showOrder";
    }
}