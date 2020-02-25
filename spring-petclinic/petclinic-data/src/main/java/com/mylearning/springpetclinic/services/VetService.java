package com.mylearning.springpetclinic.services;

import java.util.Set;

import com.mylearning.springpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
