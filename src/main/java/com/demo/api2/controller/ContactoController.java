package com.demo.api2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.api2.model.Contacto;
import com.demo.api2.service.IContactoService;

@RestController
@RequestMapping("v1/prueba")
public class ContactoController {
    
    @Autowired
    private IContactoService iContactoService;

    @PostMapping("/save")
    public void save(@RequestBody Contacto contacto) {
        this.iContactoService.save(contacto);
    }
    
    @DeleteMapping(value = "/delete/{codigo}")
    public void delete(@PathVariable Integer codigo) {
        this.iContactoService.deleteById(codigo);
    }

    @GetMapping("/getAll")
    public List<Contacto> getAll() {
        return iContactoService.findAll();
    }

    @GetMapping(value = "/getCode/{codigo}")
    public Optional<Contacto> getCode(@PathVariable Integer codigo) {
        return this.iContactoService.findCode(codigo);
    }
    
    @PutMapping("/update")
    public void update(@RequestBody Contacto contacto) {
        this.iContactoService.save(contacto);
    }
    
}
