package com.springboot.servicio.app.usuarios.models.service;

import java.util.List;

import com.springboot.servicio.app.usuarios.models.entity.Usuario;

public interface UsuarioService {

	public List<Usuario> findAll();
	public Usuario findById(Long id);
	
}
