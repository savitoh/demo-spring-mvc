package com.savitoh.dao;

import java.util.List;

import com.savitoh.domain.Cargo;

public interface CargoDao {

	public void save(Cargo departamento);
	
	public void update(Cargo departamento);
	
	public void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
}
