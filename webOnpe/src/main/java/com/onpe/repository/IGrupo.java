package com.onpe.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onpe.model.Grupo;

@Repository
public interface IGrupo {

	
	@Query(value= "{call usp_getGrupoVotacion (:id)}" , nativeQuery = true)
	Grupo gerGrupo(String id);
}
