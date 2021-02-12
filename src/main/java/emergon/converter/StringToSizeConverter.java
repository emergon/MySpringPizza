package emergon.converter;

import emergon.entity.Sizes;
import emergon.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class StringToSizeConverter implements Converter<String, Sizes>{

    @Autowired
    SizeService service;
    
    @Override
    public Sizes convert(String s) {
        int id = Integer.parseInt(s);
        Sizes size = service.findById(id);
        return size;
    }
    
}
