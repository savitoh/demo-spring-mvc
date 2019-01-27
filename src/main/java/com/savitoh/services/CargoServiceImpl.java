package com.savitoh.services;

import java.util.List;

import com.savitoh.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.savitoh.domain.Cargo;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoRepository cargoRepository;

	@Override
	public void salvar(Cargo cargo) {
		// TODO Auto-generated method stub
		cargoRepository.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		// TODO Auto-generated method stub
		cargoRepository.save(cargo);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		cargoRepository.delete(this.buscarPorId(id));
	}

	@Override
	@Transactional(readOnly = false)
	public Cargo buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return cargoRepository.findById(id).get();
	}

	@Override
	@Transactional(readOnly = false)
	public List<Cargo> buscarTodos() {
		// TODO Auto-generated method stub
		return cargoRepository.findAll();
	}

	@Override
	public boolean cargoTemFuncionario(Long id) {
		// TODO Auto-generated method stub
		if(this.buscarPorId(id).getFuncionarios().isEmpty()) {
			return false;
		}
		return true;
	}

}
