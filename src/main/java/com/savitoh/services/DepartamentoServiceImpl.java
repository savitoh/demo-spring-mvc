package com.savitoh.services;

import java.util.List;

import com.savitoh.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.savitoh.domain.Departamento;


@Service
@Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	@Override
	public void salvar(Departamento departamento) {
		// TODO Auto-generated method stub
		departamentoRepository.save(departamento);
	}

	@Override
	public void editar(Departamento departamento) {
		// TODO Auto-generated method stub
		departamentoRepository.save(departamento);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		departamentoRepository.delete(this.buscarPorId(id));
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return departamentoRepository.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		// TODO Auto-generated method stub
		return departamentoRepository.findAll();
	}

	@Override
	public boolean departamentoTemCargos(Long id) {
		if(this.buscarPorId(id).getCargos().isEmpty()) {
			return false;
		}
		return true;
	}

}
