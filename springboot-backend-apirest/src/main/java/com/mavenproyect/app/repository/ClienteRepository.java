package com.mavenproyect.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.mavenproyect.app.entiry.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
