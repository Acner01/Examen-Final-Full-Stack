package com.cesur.fullstack.Examen.Final.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibroDTO {

	private Long id;

	private String titulo;

	private String isbn;

	private BigDecimal precio;

	private Long autorId;
	
}
