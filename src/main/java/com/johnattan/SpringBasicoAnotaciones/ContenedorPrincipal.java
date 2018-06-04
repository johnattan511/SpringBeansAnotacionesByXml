package com.johnattan.SpringBasicoAnotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import interfaces.EquipoFutbolAnotaciones;

public class ContenedorPrincipal {
	
	@Autowired
	@Qualifier(value="EquipoFutbolMillos")
     private EquipoFutbolAnotaciones futbolAnotaciones;

	public EquipoFutbolAnotaciones getFutbolAnotaciones() {
		return futbolAnotaciones;
	}

	//@Required
	public void setFutbolAnotaciones(EquipoFutbolAnotaciones futbolAnotaciones) {
		this.futbolAnotaciones = futbolAnotaciones;
	}
     
     
}
