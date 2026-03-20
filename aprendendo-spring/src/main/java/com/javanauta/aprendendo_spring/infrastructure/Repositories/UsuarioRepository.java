package com.javanauta.aprendendo_spring.infrastructure.Repositories;

import com.javanauta.aprendendo_spring.infrastructure.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);
}
