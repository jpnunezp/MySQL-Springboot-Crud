package com.jp.crud.cl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Comunas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comuna implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false, updatable = false)
	private int IdPueblo;
	
	private String Pueblo;
	private int Codigo;
	private String Sucursal;
	private int IdZona;


}
