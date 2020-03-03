package com.mylearning.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mylearning.springpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
