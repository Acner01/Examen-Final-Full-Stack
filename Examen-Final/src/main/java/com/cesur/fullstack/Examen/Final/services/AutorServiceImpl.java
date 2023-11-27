package com.cesur.fullstack.Examen.Final.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesur.fullstack.Examen.Final.dto.AutorDTO;
import com.cesur.fullstack.Examen.Final.dto.LibroDTO;
import com.cesur.fullstack.Examen.Final.mappers.AutorMapper;
import com.cesur.fullstack.Examen.Final.persistences.entity.LibroEntity;
import com.cesur.fullstack.Examen.Final.persistences.repositories.AutorRepository;
import com.cesur.fullstack.Examen.Final.persistences.repositories.LibroRepository;

@Service
public class AutorServiceImpl implements AutorService{
	
	@Autowired
	public AutorRepository autorRepository;
	@Autowired
	public LibroRepository libroRepository;
	@Autowired
	public AutorMapper autorMapper;

	@Override
	public AutorDTO createCourse(AutorDTO autorDTO) {
		
		return autorMapper.toDto(autorRepository.save(autorMapper.toEntity(autorDTO)));
	}

	@Override
	public List<LibroDTO> getlibros() {
		List<LibroEntity> libros=libroRepository.findAll();
		return autorMapper.tolistDTO(libros);
	}

}
