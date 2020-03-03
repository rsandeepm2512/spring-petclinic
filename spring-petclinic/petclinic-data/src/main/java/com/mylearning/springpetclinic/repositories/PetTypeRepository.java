package com.mylearning.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mylearning.springpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
