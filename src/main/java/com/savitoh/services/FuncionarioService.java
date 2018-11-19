package com.savitoh.services;

import java.time.LocalDate;
import java.util.List;

import com.savitoh.domain.Funcionario;

public interface FuncionarioService {
	
	public void salvar(Funcionario funcionario);
	
	public void editar(Funcionario funcionario);
	
	public void excluir(Long id);
	
	public Funcionario buscarPorId(Long id);
	
	public List<Funcionario> buscarTodos();

	public List<Funcionario> buscaPorNome(String nome);

	public List<Funcionario> buscaPorCargo(String id);

	public List<Funcionario> buscaPorDatas(LocalDate entrada, LocalDate saida);
}
