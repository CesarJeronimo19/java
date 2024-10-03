package Main;

import POO.Automovil;
import Tipos.Cadenas;
import enumClases.color;
import modelos.Persona;
import modelos.PersonajesMarvel;
import utiles.Estructuras;
import utiles.HerramientaMaps;
import utiles.ManejoArchivos;
import utiles.ModificacionSistema;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Declaracion de objetos y creacion de un personaje a base del objeto
		//PersonajesMarvel p1=new PersonajesMarvel("Spiderman","Lanzar telarañas",new Persona("Petter Parker", "Queens", "Hombre"));
		//System.out.println(p1.toString());
		
		//2. Herencia (extends)
		
		//------------Extras
		//---Maps
		//HerramientaMaps hm=new HerramientaMaps();
		//hm.ContadorPalabras();
		
		//Aplicando forEach
		//Estructuras es=new Estructuras();
		//es.AplicandoForEach();
		
		//Reforzando Aprendido
		//Cadenas cd=new Cadenas();
		//cd.DeclaracionStrings();  // cadena1.equals(cadena2) ->Comparar 2 cadenas
		//cd.Concatenacion(); 		// cadena1.concat(", ").concat(cadena2) -> Concatenar cadenas
		//cd.FuncionesVarias();
		//cd.FuncionesVariasArreglos();
		//cd.ConArchivos();
		//cd.Operadores();
		
		//Acceso al Sistema
		//ModificacionSistema ms=new ModificacionSistema();
		//ms.SystemAcceso();
		
		//Archivos
		//ManejoArchivos ma=new ManejoArchivos();
		//ma.AccediendoConfigProperties();
		
		//POO
		//Automovil auto=new Automovil(); //Instancia de un objeto
		//auto.cadenaTexto="Estoy accediendo a un valor de un objeto libremente porque es publico"; //dando un valor al atributo fabricante
				//En el objeto el fabricante esta declarado como public String fabricante: por eso es que puedo acceder a el atributo
		//System.out.println("El texto nos dice: "+auto.cadenaTexto);
		
		Automovil chevrolet=new Automovil("Chrevrolet","2024","Negro",3.0);
		System.out.println(chevrolet.verDetalle());
		System.out.println(chevrolet.acelerar(3000));
		System.out.println(chevrolet.frenar());
		
		System.out.println(chevrolet.acelerarFrenar(4000));
		
		System.out.println(chevrolet);
		System.out.println(chevrolet.toString());
		

		//Paquetes-> contenedores que nos permiten agrupar y organizar nuestras clases
		//Se puede utilizar de la sig manera pero no es lo correcto
		com.jjeronimo.paquete.hogar.Persona p=new com.jjeronimo.paquete.hogar.Persona();
		p.nombre="Cesar Jeronimo";
		System.out.println(p.nombre);
	}

}
