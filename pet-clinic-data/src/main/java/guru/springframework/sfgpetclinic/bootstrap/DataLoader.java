package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 22/01/2022 - 15:42
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Alex");
        owner1.setLastName("Ivanov");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Max");
        owner2.setLastName("Petrov");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Vasya");
        vet1.setLastName("Pupkin");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Max");
        vet2.setLastName("Ivanov");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
