package com.deposito.app.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "usuarios")
public class Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_persona",length = 20, nullable = false)
	private String name;
	@Column(name = "apellido",length = 15)
	private String firstName;
	@Column(name = "celular",length = 13, unique = true)
	private String phone;
	@Column(name = "direccion",length = 40)
	private String address;
	@Column(name = "usuario",length = 10, nullable = false, unique = true)
	private String user;
	@Column(name = "contrasena",length = 20, nullable = false)
	private String password;
	

}
