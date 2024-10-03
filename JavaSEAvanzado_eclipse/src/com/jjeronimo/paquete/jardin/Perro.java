package com.jjeronimo.paquete.jardin;

import com.jjeronimo.paquete.hogar.*;

public class Perro {
	protected String nombre;
	protected String raza;
	
	String jugar(Persona persona) {
		return persona.lanzarPelota();
	}
}
