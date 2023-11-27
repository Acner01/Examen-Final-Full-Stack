package com.cesur.fullstack.Examen.Final.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cesur.fullstack.Examen.Final.dto.AutorDTO;
import com.cesur.fullstack.Examen.Final.dto.LibroDTO;
import com.cesur.fullstack.Examen.Final.services.AutorService;
import com.cesur.fullstack.Examen.Final.services.LibroService;

@RestController
@RequestMapping("/libro")
public class LibroRestController {

	@Autowired
	LibroService libroService;
	
	@PostMapping
	ResponseEntity<?> createCourse(@RequestBody LibroDTO libroDTO) {

		LibroDTO libro = libroService.createlIBRO(libroDTO);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + libro.getId())
				.buildAndExpand(libro.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
}
