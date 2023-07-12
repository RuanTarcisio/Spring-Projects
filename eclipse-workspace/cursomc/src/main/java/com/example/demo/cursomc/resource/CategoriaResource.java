package com.example.demo.cursomc.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cursomc.domain.Categoria;
import com.example.demo.cursomc.service.CategoriaService;

@RestController
@RequestMapping(value="categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	
	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> search (@PathVariable Integer id) {
		Categoria obj = service.find(id); 
//		List<Categoria> lista = new ArrayList<Categoria>();
//		Categoria cat1 = new Categoria(1, "Informatica");
//		Categoria cat2 = new Categoria(2, "Escritório");
//		
//		lista.add(cat1);
//		lista.add(cat2);
		
		return ResponseEntity.ok().body(obj);
		
	}
}
