package com.mylearning.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.mylearning.springpetclinic.model.Specialty;
import com.mylearning.springpetclinic.model.Vet;
import com.mylearning.springpetclinic.services.SpecialtyService;
import com.mylearning.springpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	
	private final SpecialtyService specialtyService;
	
	public VetServiceMap(SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		if(object.getSpecialties().size() > 0) {
			object.getSpecialties().forEach(specialty -> {
				if(specialty.getId() == null) {
					Specialty savedSpecialty = specialtyService.save(specialty);
					specialty.setId(savedSpecialty.getId());
				}
			});
		}
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
}
