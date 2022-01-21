package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 21/01/2022 - 13:41
 */
public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
