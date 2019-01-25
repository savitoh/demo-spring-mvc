package com.savitoh.repository;

import com.savitoh.domain.Cargo;
import org.springframework.data.repository.Repository;

import java.util.List;


@org.springframework.stereotype.Repository
public interface CargoRepository extends Repository<Cargo, Long> {

     Cargo save(Cargo cargo);

     //Cargo update(Cargo cargo);

     void delete(Cargo cargo);

     List<Cargo> findAll();

     Cargo findById(Long id);

}