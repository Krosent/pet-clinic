package com.krosent.petclinic.services;

import com.krosent.petclinic.model.Owner;
import com.krosent.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
