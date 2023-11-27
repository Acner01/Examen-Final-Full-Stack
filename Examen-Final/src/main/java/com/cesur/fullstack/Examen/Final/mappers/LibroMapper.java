package com.cesur.fullstack.Examen.Final.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.cesur.fullstack.Examen.Final.dto.LibroDTO;
import com.cesur.fullstack.Examen.Final.persistences.entity.AutorEntity;
import com.cesur.fullstack.Examen.Final.persistences.entity.LibroEntity;



@Mapper(componentModel = "spring")
public interface LibroMapper {
	@Mapping(source = "autor", target = "id", qualifiedByName = "mapAutorId")
    LibroDTO toDto(LibroEntity libroentity);

    LibroEntity toEntity(LibroDTO libroDTO);

    @Named("mapAutorId")
    default Long mapCursoId(AutorEntity autor) {
        if (autor == null) {
            return null;
        }
        return autor.getId();
    }

}
