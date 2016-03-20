package com.daniapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.daniapp.model.Usuario;
import com.daniapp.service.UsuarioService;

@RestController
public class HomeController {
	
	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		Usuario user = usuarioService.findById(1L);
		System.out.println(user.getNome());
		return new ModelAndView("index");
	}
	
}
