package com.andy.petclinic.bootstrap;

import com.andy.petclinic.model.Owner;
import com.andy.petclinic.model.Vet;
import com.andy.petclinic.services.OwnerService;
import com.andy.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerServiceMap;
    private final VetService vetServiceMap;

    public DataLoader(OwnerService ownerServiceMap, VetService vetServiceMap) {
        this.ownerServiceMap = ownerServiceMap;
        this.vetServiceMap = vetServiceMap;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("West");

        ownerServiceMap.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glann");

        ownerServiceMap.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Serious");

        vetServiceMap.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Din");
        vet2.setLastName("Mitchel");

        vetServiceMap.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
