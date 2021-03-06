package com.savitoh.controller.conversor;

import com.savitoh.domain.Departamento;
import com.savitoh.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento> {

    @Autowired
    private DepartamentoService service;

    @Override
    public Departamento convert(String text) {
        if (text.isEmpty()) {
            return null;
        }
        var id = Long.valueOf(text);
        return service.buscarPorId(id);
    }

}
