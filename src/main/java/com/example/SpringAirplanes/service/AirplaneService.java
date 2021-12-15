package com.example.SpringAirplanes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SpringAirplanes.domain.Airplane;
import com.example.SpringAirplanes.repo.AirplaneRepo;



@Service
public class AirplaneService implements ServiceMethods<Airplane> {
	
	private AirplaneRepo repo;
	
	
	// constructor
	public AirplaneService(AirplaneRepo repo) {
		this.repo = repo;
	}

	@Override
	public Airplane create(Airplane airplane) {
		return this.repo.save(airplane);
	}

	@Override
	public List<Airplane> getAll() {
		return this.repo.findAll();
	}

	@Override
	public Airplane getById(long id) {
		Optional<Airplane> optionalAirplane = this.repo.findById(id);
		if(optionalAirplane.isPresent()) {
			return optionalAirplane.get();
		}
		return null;
	}

	@Override
	public Airplane update(long id, Airplane airplane) {
		Optional<Airplane> existingAirplane = this.repo.findById(id);
		if(existingAirplane.isPresent()) {
			Airplane existing = existingAirplane.get();
			existing.setAge(airplane.getAge());
			existing.setName(airplane.getName());
			existing.setType(airplane.getType());
			
			return this.repo.saveAndFlush(existing);
		
		}
		return null;
	}

	@Override
	public boolean delete(long id) {
		    this.repo.deleteById(id);;
		    return !this.repo.existsById(id);
		
	}

}
