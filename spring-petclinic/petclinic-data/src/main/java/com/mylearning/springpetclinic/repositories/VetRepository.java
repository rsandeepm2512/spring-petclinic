package com.mylearning.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mylearning.springpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
