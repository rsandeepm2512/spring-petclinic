package com.mylearning.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mylearning.springpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
