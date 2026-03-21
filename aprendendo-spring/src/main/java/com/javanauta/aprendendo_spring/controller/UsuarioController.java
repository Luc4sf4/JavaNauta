package com.javanauta.aprendendo_spring.controller;

import com.javanauta.aprendendo_spring.business.UsuarioService;
import com.javanauta.aprendendo_spring.infrastructure.Entities.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> saveUser(@RequestBody Usuario usuario){
       return ResponseEntity.ok(usuarioService.salvarUsuario(usuario));
    }

}
