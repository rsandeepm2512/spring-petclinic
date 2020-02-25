package com.mylearning.springpetclinic.services;

import com.mylearning.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
