package com.mylearning.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mylearning.springpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {

}
