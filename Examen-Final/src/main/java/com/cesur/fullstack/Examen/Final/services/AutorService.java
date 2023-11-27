package com.cesur.fullstack.Examen.Final.services;

import java.util.ArrayList;
import java.util.List;

import com.cesur.fullstack.Examen.Final.dto.AutorDTO;
import com.cesur.fullstack.Examen.Final.dto.LibroDTO;


public interface AutorService {

	AutorDTO createCourse(AutorDTO cursoDTO);
	List<LibroDTO> getlibros();
}
