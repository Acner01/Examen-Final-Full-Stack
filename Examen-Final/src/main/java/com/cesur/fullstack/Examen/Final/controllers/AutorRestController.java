package com.cesur.fullstack.Examen.Final.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cesur.fullstack.Examen.Final.dto.AutorDTO;
import com.cesur.fullstack.Examen.Final.services.AutorService;


@RestController
@RequestMapping("/autor")
public class AutorRestController {

	@Autowired
	AutorService autorService;
	
	@PostMapping
	ResponseEntity<?> createCourse(@RequestBody AutorDTO autorDTO) {

		AutorDTO autor = autorService.createCourse(autorDTO);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + autor.getId())
				.buildAndExpand(autor.getId()).toUri();

		return ResponseEntity.created(location).build();

	}

	@GetMapping()
	ResponseEntity<?> getLibros() {

		return ResponseEntity.ok(autorService.getlibros());
	}
}
