package com.cesur.fullstack.Examen.Final.persistences.entity;


import java.util.ArrayList;
import java.util.List;

import com.cesur.fullstack.Examen.Final.dto.LibroDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AutorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String nombre;

	private String nacionalidad;
	
	 @OneToMany(mappedBy = "autor")
	 private List<LibroEntity> libros = new ArrayList<>();
	
	
}
