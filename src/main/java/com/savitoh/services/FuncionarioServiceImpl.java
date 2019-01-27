package com.savitoh.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.savitoh.repository.CargoRepository;
import com.savitoh.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.savitoh.domain.Funcionario;


@Service
@Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Autowired
	private CargoRepository cargoRepository;
	
	@Override
	public void salvar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		funcionarioRepository.save(funcionario);
	}

	@Override
	public void editar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		funcionarioRepository.save(funcionario);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		funcionarioRepository.delete(this.buscarPorId(id));
	}

	@Override
	@Transactional(readOnly = true)
	public Funcionario buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return funcionarioRepository.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Funcionario> buscarTodos() {
		// TODO Auto-generated method stub
		return funcionarioRepository.findAll();
	}

	@Override
	public List<Funcionario> buscaPorNome(String nome) {
		return funcionarioRepository.findByNomeContainingIgnoreCase(nome);
	}

	@Override
	public List<Funcionario> buscaPorCargo(String id) {
		var cargo = cargoRepository.findById(Long.valueOf(id)).get();
		return funcionarioRepository.findByCargo(cargo);
	}

	@Override
	public List<Funcionario> buscaPorDatas(LocalDate entrada, LocalDate saida) {
		if(entrada != null && saida != null){
			return funcionarioRepository.findByDataEntradaGreaterThanEqualOrDataSaidaLessThanEqualOrderByDataEntrada(entrada, saida);
		} else if(entrada != null) {
			return funcionarioRepository.findByDataEntradaGreaterThanEqualOrderByDataEntrada(entrada);
		} else if(saida != null) {
			return funcionarioRepository.findByDataSaidaLessThanEqualOrderByDataEntrada(saida);
		}
		return new ArrayList<>();
	}

}
