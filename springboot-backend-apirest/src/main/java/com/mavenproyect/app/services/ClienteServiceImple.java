package com.mavenproyect.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mavenproyect.app.entiry.Cliente;
import com.mavenproyect.app.repository.ClienteRepository;

@Service
public class ClienteServiceImple implements ClienteService {

	@Autowired	//ClienteRepository es un patron DAO
	private ClienteRepository clienteRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {

		return (List<Cliente>)this.clienteRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {

		return this.clienteRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {

		return this.clienteRepository.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		this.clienteRepository.deleteById(id);

	}

}
