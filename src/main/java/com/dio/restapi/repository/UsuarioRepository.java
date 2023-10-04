package com.dio.restapi.repository;

import com.dio.restapi.handler.BusinessException;
import com.dio.restapi.model.Usuario;
import org.springframework.stereotype.Repository;
import java.util.*;


@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){

        if (usuario.getLogin() == null) {
            throw new BusinessException("O campo login é obrigatório!");
        }




        if (usuario.getId() == null) {
            System.out.println("SAVE");
        } else {
            System.out.println("UPDATE");
        }


        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void delete(Integer id){
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Vinicius","senha2"));
        usuarios.add(new Usuario("João","senha1"));
        System.out.println(usuarios.toString());
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.printf("FIND/id - Recebendo o id: %d para localizar um usuário%n", id);
        return new Usuario("Vinicius","password");
    }

    public Usuario findByNome(String nome) {
        System.out.printf("FIND/nome - Recebendo o nome: %s para localizar um usuário%n", nome);
        return new Usuario(nome,"password");
    }
}
