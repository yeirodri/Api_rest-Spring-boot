package com.demo.api2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.api2.model.Contacto;

public interface IContactoRepository extends JpaRepository<Contacto, Integer> {
    /*@Query(value = "SELECT * FROM VARIPP I WHERE I.ANIO BETWEEN ?1 AND ?2", nativeQuery = true)
	List<VarIpp> getAllAnio(Integer desde, Integer hasta);*/
}
