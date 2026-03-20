package com.javanauta.aprendendo_spring.business;

import com.javanauta.aprendendo_spring.infrastructure.Entities.Usuario;
import com.javanauta.aprendendo_spring.infrastructure.Repositories.UsuarioRepository;
import com.javanauta.aprendendo_spring.infrastructure.exceptions.ConflictException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

//    @Autowired
//    private UsuarioRepository usuarioRepository;

    private final UsuarioRepository usuarioRepository;


    //Responsavel apenas para salvar o usuario
    public Usuario salvarUsuario(Usuario usuario){
        try{
            emailExiste(usuario.getEmail());
            return usuarioRepository.save(usuario);
        } catch (ConflictException e) {
            throw new ConflictException("Email ja cadastrado" + e.getCause());
        }
    }

    //Responsavel apenas para verificar se o email existe
    public void emailExiste(String email){
        try {
            boolean  existe = verificaEmailExistente(email);
            if(existe){
                throw new ConflictException("Email ja cadastrado " + email);
            }
        }catch (ConflictException e){
            throw new ConflictException("Email ja cadastrado" + e.getCause());
        }
    }

    //Responsavel apenas para chamar a function da repository
    public boolean verificaEmailExistente(String email){
        return usuarioRepository.existsByEmail(email);
    }
}
