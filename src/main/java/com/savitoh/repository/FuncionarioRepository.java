package com.savitoh.repository;

import com.savitoh.domain.Cargo;
import com.savitoh.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {


    List<Funcionario> findByNomeContainingIgnoreCase(String nome);

    List<Funcionario> findByDataEntradaGreaterThanEqualOrderByDataEntrada(LocalDate dataEntrada);

    List<Funcionario> findByDataSaidaLessThanEqualOrderByDataEntrada(LocalDate dataEntrada);

    List<Funcionario> findByDataEntradaGreaterThanEqualOrDataSaidaLessThanEqualOrderByDataEntrada(LocalDate dataEntrada,
                                                                                                  LocalDate dataSaida);
    List<Funcionario> findByCargo(Cargo cargo);

}