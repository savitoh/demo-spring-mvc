package com.savitoh.controller.conversor;

import com.savitoh.domain.Cargo;
import com.savitoh.services.CargoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToCargoConverter implements Converter<String, Cargo> {

    @Autowired
    private CargoService cargoService;

    @Override
    public Cargo convert(String text) {
        if (text.isEmpty()) {
            return null;
        }
        var id = Long.valueOf(text);
        return cargoService.buscarPorId(id);
    }
    
}
