package com.savitoh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.savitoh.dao.DepartamentoDao;
import com.savitoh.domain.Departamento;


@Service
@Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	private DepartamentoDao departamentoDao;

	@Override
	public void salvar(Departamento departamento) {
		// TODO Auto-generated method stub
		departamentoDao.save(departamento);
	}

	@Override
	public void editar(Departamento departamento) {
		// TODO Auto-generated method stub
		departamentoDao.update(departamento);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		departamentoDao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return departamentoDao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		// TODO Auto-generated method stub
		return departamentoDao.findAll();
	}

	@Override
	public boolean departamentoTemCargos(Long id) {
		if(buscarPorId(id).getCargos().isEmpty()) {
			return false;
		}
		return true;
	}

}
