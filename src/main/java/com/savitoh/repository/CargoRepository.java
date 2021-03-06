package com.savitoh.repository;

import com.savitoh.domain.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {

}