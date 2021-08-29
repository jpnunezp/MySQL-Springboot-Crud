package com.jp.crud.cl.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.jp.crud.cl.model.ApiError;
import com.jp.crud.cl.model.Comuna;
import com.jp.crud.cl.service.ComunaServices;

@RestController
@RequestMapping("/comuna")
public class ComunaController {

	@Autowired
	private final ComunaServices comunaServices;

	public ComunaController(ComunaServices comunaServices) {
		this.comunaServices = comunaServices;
	}

	@GetMapping("/allComunas")
	public ResponseEntity<List<Comuna>> getAllComunas() {
		List<Comuna> comunas = comunaServices.findAllComunas();
		return new ResponseEntity<>(comunas, HttpStatus.OK);
		
	}
	
	@GetMapping("/find/{idPueblo}")
	public ResponseEntity<Comuna> getComunasById(@PathVariable("idPueblo") int idPueblo) {
		Comuna comuna = comunaServices.findComunaById(idPueblo);
		return new ResponseEntity<>(comuna, HttpStatus.OK);
		
	}
	
	@PostMapping("/addComuna")
	public ResponseEntity<Comuna> addComuna(@RequestBody Comuna comuna){
		Comuna newComuna = comunaServices.addComuna(comuna);
		return new ResponseEntity<>(newComuna, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/updateComuna")
	public ResponseEntity<Comuna> updateComuna(@RequestBody Comuna comuna){
		Comuna updateComuna = comunaServices.updateComuna(comuna);
		return new ResponseEntity<>(updateComuna, HttpStatus.CREATED);
		
	}
	
	
	@DeleteMapping("/deleteComuna/{idPueblo}")
	public ResponseEntity<?> deleteComuna(@PathVariable("idPueblo") int idPueblo){
		comunaServices.deleteComuna(idPueblo);
		return new ResponseEntity<>(HttpStatus.OK);
	}
		
}
