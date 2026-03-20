package com.javanauta.aprendendo_spring.infrastructure.Repositories;

import com.javanauta.aprendendo_spring.infrastructure.Entities.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
