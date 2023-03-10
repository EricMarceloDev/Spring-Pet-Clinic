package com.spc.services.map;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.spc.models.Specialty;
import com.spc.models.Vet;
import com.spc.services.SpecialtyService;
import com.spc.services.VetService;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialtyService specialtyService;
	
	@Autowired
	public VetMapService(SpecialtyService specialtyService) {
		super();
		this.specialtyService = specialtyService;
	}

	@Override
	public Set<Vet> findAll() {
		
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		
		return super.findById(id);
	}

	@Override
	public Vet save(Vet type) {
		
		if(type.getSpecialities().size() > 0) {
			type.getSpecialities().forEach(specialty -> {
				if(specialty.getId() == null) {
					Specialty savedSpecialty =this.specialtyService.save(specialty);
					specialty.setId(savedSpecialty.getId());
				}
			} );
		}
		return super.save(type);
	}

	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
	}

	@Override
	public void delete(Vet type) {
		
		super.delete(type);
	}

	


}
