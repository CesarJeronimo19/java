package Main;

import Tipos.Cadenas;
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
		ManejoArchivos ma=new ManejoArchivos();
		ma.AccediendoConfigProperties();
	}

}
