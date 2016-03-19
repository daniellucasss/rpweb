package com.daniapp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Perfil implements Serializable {

	private static final long serialVersionUID = -8323274417933200876L;

	private Long id;
	
	private String nome;
	
	private Long nivel;
}
