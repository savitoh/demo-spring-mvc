package com.savitoh.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.savitoh.dao.FuncionarioDao;
import com.savitoh.domain.Funcionario;


@Service
@Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDao funcionarioDao;
	
	@Override
	public void salvar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		funcionarioDao.save(funcionario);
	}

	@Override
	public void editar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		funcionarioDao.update(funcionario);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		funcionarioDao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Funcionario buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return funcionarioDao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Funcionario> buscarTodos() {
		// TODO Auto-generated method stub
		return funcionarioDao.findAll();
	}

	@Override
	public List<Funcionario> buscaPorNome(String nome) {
		return funcionarioDao.findByNome(nome);
	}

	@Override
	public List<Funcionario> buscaPorCargo(String id) {
		return funcionarioDao.findByCargo(Long.valueOf(id));
	}

	@Override
	public List<Funcionario> buscaPorDatas(LocalDate entrada, LocalDate saida) {
		if(entrada != null && saida != null){
			return funcionarioDao.findByDataEntradaDataSaida(entrada, saida);
		} else if(entrada != null) {
			return funcionarioDao.findByDataEntrada(entrada);
		} else if(saida != null) {
			return funcionarioDao.findByDataSaida(saida);
		} else {
			return new ArrayList<>();
		}
	}

}
