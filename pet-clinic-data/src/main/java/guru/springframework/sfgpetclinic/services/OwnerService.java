package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 21/01/2022 - 13:41
 */
public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
