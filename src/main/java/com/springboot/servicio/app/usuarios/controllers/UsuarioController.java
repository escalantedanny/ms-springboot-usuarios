package com.springboot.servicio.app.usuarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.servicio.app.usuarios.models.service.UsuarioService;
import com.springboot.servicio.app.usuarios.models.entity.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService; 
	
	@GetMapping("/listar")
	public List<Usuario> listar(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Usuario detalle(@PathVariable Long id){
		return usuarioService.findById(id);
	}
	
}
