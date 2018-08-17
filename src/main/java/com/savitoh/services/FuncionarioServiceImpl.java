package com.savitoh.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.savitoh.dao.FuncionarioDao;
import com.savitoh.domain.Funcionario;


@Service
@Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService {

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

}
