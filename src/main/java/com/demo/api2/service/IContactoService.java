package com.demo.api2.service;

import java.util.List;
import java.util.Optional;

import com.demo.api2.model.Contacto;

public interface IContactoService {
    
    public List<Contacto> findAll();

    public Optional<Contacto> findCode(Integer codigo);

    public void save(Contacto contacto);

    public void deleteById(Integer codigo);

    public void update(Contacto contacto);
}
