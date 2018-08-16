package com.savitoh.dao;

import java.util.List;

import com.savitoh.domain.Departamento;

public interface DepartamentoDao {
	
	public void save(Departamento departamento);
	
	public void update(Departamento departamento);
	
	public void delete(Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();

}
