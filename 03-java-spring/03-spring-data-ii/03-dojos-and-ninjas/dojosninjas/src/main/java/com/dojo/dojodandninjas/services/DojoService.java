package com.dojo.dojodandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.dojodandninjas.models.Dojo;
import com.dojo.dojodandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepository dRepo;
	
	
	public List<Dojo> getAll(){
		return this.dRepo.findAll();
		}
	
	public Dojo create(Dojo k) {
		return this.dRepo.save(k);
	}
	
	public void delete(Long id) {
		this.dRepo.deleteById(id);
	}
	
	public Dojo getOne(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	public Dojo update(Dojo updt) {
		return this.dRepo.save(updt);
	}

}
