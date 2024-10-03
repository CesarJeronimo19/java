package com.jjeronimo.paquete.jardin;

import com.jjeronimo.paquete.hogar.*;

public class IniciandoPaquete {
	public static void main(String[] args) {
		Persona p=new Persona();
		p.setNombre("Cesar Jeronimo");
		System.out.println(p.getNombre());
		
		Perro perro = new Perro();
		perro.nombre="Firulais";
		perro.raza="Pastor Aleman";
		
		String jugando = perro.jugar(p);
	}
}
