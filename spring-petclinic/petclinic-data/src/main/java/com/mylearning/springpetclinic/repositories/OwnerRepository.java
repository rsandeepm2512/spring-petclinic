package com.mylearning.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mylearning.springpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

	Owner findByLastName(String lastName);
}
