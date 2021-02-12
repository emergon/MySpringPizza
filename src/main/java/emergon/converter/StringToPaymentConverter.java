package emergon.converter;

import emergon.entity.Payment;
import emergon.entity.Sizes;
import emergon.service.PaymentService;
import emergon.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class StringToPaymentConverter implements Converter<String, Payment>{

    @Autowired
    PaymentService service;
    
    @Override
    public Payment convert(String s) {
        int id = Integer.parseInt(s);
        Payment payment = service.findById(id);
        return payment;
    }
    
}
