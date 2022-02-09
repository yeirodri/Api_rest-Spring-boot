package com.demo.api2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.api2.model.Contacto;
import com.demo.api2.repository.IContactoRepository;
import com.demo.api2.service.IContactoService;

@Service
public class ContactoServiceImpl implements IContactoService {

    @Autowired
    private IContactoRepository iContactoRepository;

	@Override
	public List<Contacto> findAll() {
		// TODO Auto-generated method stub
		List<Contacto> lis = iContactoRepository.findAll();
 		System.out.println(lis);
		return lis;
	}

	@Override
	public Optional<Contacto> findCode(Integer codigo) {
		// TODO Auto-generated method stub
		return iContactoRepository.findById(codigo);
	}

	@Override
	public void save(Contacto contacto) {
		// TODO Auto-generated method stub
		iContactoRepository.save(contacto);
	}

	@Override
	public void deleteById(Integer codigo) {
		// TODO Auto-generated method stub
		iContactoRepository.deleteById(codigo);
	}

	@Override
	public void update(Contacto contacto) {
		// TODO Auto-generated method stub
		iContactoRepository.save(contacto);
	}
    
}
