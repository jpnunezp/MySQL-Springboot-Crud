package com.jp.crud.cl.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jp.crud.cl.model.Comuna;

public interface ComunaRepo extends CrudRepository<Comuna, Integer>{

//	@Query("delete from comuna c where c.idpueblo = ?1")
//	void deleteComunaById(int idPueblo);
//	
//	@Query("select c from comuna c where c.idpueblo = ?1")
//	Comuna findComunaById(int idPueblo);
//	
	
}
