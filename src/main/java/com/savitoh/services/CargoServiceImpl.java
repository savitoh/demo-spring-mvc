package com.savitoh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.savitoh.dao.CargoDao;
import com.savitoh.domain.Cargo;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {
	
	@Autowired
	private CargoDao cargoDao;

	@Override
	public void salvar(Cargo cargo) {
		// TODO Auto-generated method stub
		cargoDao.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		// TODO Auto-generated method stub
		cargoDao.update(cargo);	
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		cargoDao.delete(id);
	}

	@Override
	@Transactional(readOnly = false)
	public Cargo buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return cargoDao.findById(id);
	}

	@Override
	@Transactional(readOnly = false)
	public List<Cargo> buscarTodos() {
		// TODO Auto-generated method stub
		return cargoDao.findAll();
	}

}
