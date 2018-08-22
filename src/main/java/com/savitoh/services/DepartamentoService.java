package com.savitoh.services;

import java.util.List;

import com.savitoh.domain.Departamento;

public interface DepartamentoService {
	
	public void salvar(Departamento departamento);
	
	public void editar(Departamento departamento);
	
	public void excluir(Long id);
	
	public Departamento buscarPorId(Long id);
	
	public List<Departamento> buscarTodos();
	
	public boolean departamentoTemCargos(Long id);

}
