package com.spc.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spc.models.*;
import com.spc.services.*;
import com.spc.services.map.*;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerSerivce;
	private final VetService vetService;
	
	@Autowired
	public DataLoader(OwnerService ownerSerivce, VetService vetService) {
		super();
		this.ownerSerivce = ownerSerivce;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFrstName("Michael");
		owner1.setLastname("Weston");
		
		this.ownerSerivce.save(owner1.getId(), owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFrstName("Fiona");
		owner2.setLastname("Glenanne");
		
		this.ownerSerivce.save(owner2.getId(), owner2);
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFrstName("Sam");
		vet1.setLastname("Axe");
		
		this.vetService.save(vet1.getId(), vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFrstName("Jessie");
		vet2.setLastname("Porter");
		
		this.vetService.save(vet2.getId(), vet2);
		
		System.out.println("Loaded Vets...");

	}

}
