package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 21/01/2022 - 13:41
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
