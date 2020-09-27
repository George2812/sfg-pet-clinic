package com.dialynas.sfgpetclinic.repositories;

import com.dialynas.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
