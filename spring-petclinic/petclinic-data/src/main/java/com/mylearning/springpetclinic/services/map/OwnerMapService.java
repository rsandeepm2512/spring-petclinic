package com.mylearning.springpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.mylearning.springpetclinic.model.Owner;
import com.mylearning.springpetclinic.model.Pet;
import com.mylearning.springpetclinic.services.OwnerService;
import com.mylearning.springpetclinic.services.PetService;
import com.mylearning.springpetclinic.services.PetTypeService;

@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;
	private final PetService petService;
	
	public OwnerMapService(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		if(object != null) {
			if(object.getPets() != null) {
				object.getPets().forEach(pet -> {
					if(pet.getPetType() != null) {
						if(pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet Type is required");
					}
					if(pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(object);
		}
		return null;
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}
}
