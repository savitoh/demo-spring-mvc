package com.savitoh.services;

import java.util.List;

import com.savitoh.domain.Funcionario;

public interface FuncionarioService {
	
	public void salvar(Funcionario funcionario);
	
	public void editar(Funcionario funcionaro);
	
	public void excluir(Long id);
	
	public Funcionario buscarPorId(Long id);
	
	public List<Funcionario> buscarTodos();
}
