package com.mavenproyect.app.services;

import java.util.List;

import com.mavenproyect.app.entiry.Cliente;

public interface ClienteService {

	public List<Cliente> findAll();

	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);

	public void delete(Long id);

}
