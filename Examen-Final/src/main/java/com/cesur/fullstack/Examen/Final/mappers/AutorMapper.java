package com.cesur.fullstack.Examen.Final.mappers;

import java.util.ArrayList;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cesur.fullstack.Examen.Final.dto.AutorDTO;
import com.cesur.fullstack.Examen.Final.dto.LibroDTO;
import com.cesur.fullstack.Examen.Final.persistences.entity.AutorEntity;
import com.cesur.fullstack.Examen.Final.persistences.entity.LibroEntity;

@Mapper(componentModel = "spring", uses = {LibroMapper.class})
public interface AutorMapper {

	//@Mapping(target = "estudiantes", ignore = true)
    AutorDTO toDto(AutorEntity autor);
    AutorEntity toEntity(AutorDTO autorDTO);
    List<LibroDTO> tolistDTO(List<LibroEntity> autor);
    
    @Mapping(target = "libros", ignore = true)
    AutorDTO toDtoWithoutStudents(AutorEntity autor);
    
}
