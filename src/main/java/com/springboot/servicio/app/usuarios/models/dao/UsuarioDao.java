package com.springboot.servicio.app.usuarios.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.servicio.app.usuarios.models.entity.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long>{

}
