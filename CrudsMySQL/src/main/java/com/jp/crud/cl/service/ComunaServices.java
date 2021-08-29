package com.jp.crud.cl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.crud.cl.model.Comuna;
import com.jp.crud.cl.repo.ComunaRepo;

@Service
public class ComunaServices {

	private final ComunaRepo comunaRepo;

	@Autowired
	public ComunaServices(ComunaRepo comunaRepo) {
		this.comunaRepo = comunaRepo;
	}
	

	public Comuna addComuna(Comuna comuna) {
		return comunaRepo.save(comuna);
		
	}
	
	public List<Comuna> findAllComunas() {
		return (List<Comuna>) comunaRepo.findAll();
		
	}
	
	public Comuna updateComuna(Comuna comuna) {
		return comunaRepo.save(comuna);
	}
	
	public Comuna findComunaById(int idPueblo) {
		Optional<Comuna> opcinalComuna = comunaRepo.findById(idPueblo);
		Comuna comuna = opcinalComuna.get();
		return comuna;
	}
	
	public void deleteComuna(int idPueblo) {	
		comunaRepo.deleteById(idPueblo);
	}
	
	
	
	
}
