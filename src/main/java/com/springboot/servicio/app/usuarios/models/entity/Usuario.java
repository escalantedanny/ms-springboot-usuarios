package com.springboot.servicio.app.usuarios.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="usuarios")
@Data
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7979404181280795430L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String rut;
	String application;
	String name;
	String lastName;
	String secondLastName;
	String gender;
	String dateBirth;
	String email;
	String phone;
	
}
