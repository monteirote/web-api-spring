package com.dio.restapi.controller;

import com.dio.restapi.model.Usuario;
import com.dio.restapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> getUsuarios() {
         return usuarioRepository.listAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return usuarioRepository.findByNome(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        usuarioRepository.delete(id);
    }

    @PutMapping
    public void postUser(@RequestBody Usuario user) {
        usuarioRepository.save(user);
    }
}
