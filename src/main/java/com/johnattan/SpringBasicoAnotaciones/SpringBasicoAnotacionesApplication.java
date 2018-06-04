package com.johnattan.SpringBasicoAnotaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import interfaces.EquipoFutbolAnotaciones;

@SpringBootApplication
public class SpringBasicoAnotacionesApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBasicoAnotacionesApplication.class, args);
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("Beans.xml");
		
		ContenedorPrincipal contenedor = (ContenedorPrincipal) ap.getBean("ContenedorPrincipal");
		
		contenedor.getFutbolAnotaciones().nombreEquipo();
		
	}
}
