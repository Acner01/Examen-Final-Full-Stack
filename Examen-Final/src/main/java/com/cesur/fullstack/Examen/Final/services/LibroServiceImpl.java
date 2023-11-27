package com.cesur.fullstack.Examen.Final.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesur.fullstack.Examen.Final.dto.LibroDTO;
import com.cesur.fullstack.Examen.Final.mappers.LibroMapper;
import com.cesur.fullstack.Examen.Final.persistences.entity.AutorEntity;
import com.cesur.fullstack.Examen.Final.persistences.entity.LibroEntity;
import com.cesur.fullstack.Examen.Final.persistences.repositories.AutorRepository;
import com.cesur.fullstack.Examen.Final.persistences.repositories.LibroRepository;


@Service
public class LibroServiceImpl implements LibroService{
	
	
	@Autowired
	public LibroRepository libroRepository;
	@Autowired
	public AutorRepository autorRepository;
	@Autowired
	public LibroMapper LibroMapper;

	@Override
	public LibroDTO createlIBRO(LibroDTO libroDTO) {
		
		LibroEntity libro = LibroMapper.toEntity(libroDTO);
	    
		if (libroDTO.getId() != null) {
	        AutorEntity autor = autorRepository.findById(libroDTO.getId())
	                            .orElseThrow(() -> new RuntimeException("curso no encontrado"));
	        
	        libro.setAutor(autor);
	    }
		
	    libro = libroRepository.save(libro);
	    return LibroMapper.toDto(libro);
	}

}
