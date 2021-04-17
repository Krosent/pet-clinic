package com.krosent.petclinic.services;

import com.krosent.petclinic.model.Owner;
import com.krosent.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
