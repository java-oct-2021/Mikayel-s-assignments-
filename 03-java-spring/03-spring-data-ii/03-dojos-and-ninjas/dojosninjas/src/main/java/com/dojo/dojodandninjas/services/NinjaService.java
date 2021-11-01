package com.dojo.dojodandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.dojodandninjas.models.Ninja;
import com.dojo.dojodandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepository nRepo;
	
	
	public List<Ninja> getAll(){
		return this.nRepo.findAll();
		}
	
	public Ninja create(Ninja k) {
		return this.nRepo.save(k);
	}
	
	public void delete(Long id) {
		this.nRepo.deleteById(id);
	}
	
	public Ninja getOne(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	
	public Ninja update(Ninja updt) {
		return this.nRepo.save(updt);
	}

}

