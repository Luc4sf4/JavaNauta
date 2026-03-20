package com.javanauta.aprendendo_spring.infrastructure.Repositories;

import com.javanauta.aprendendo_spring.infrastructure.Entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
