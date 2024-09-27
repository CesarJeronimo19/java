package Tipos;

import java.util.Iterator;

public class Cadenas {
	public void DeclaracionStrings() {
		//crear de forma implicita
		String curso="Programacion Java";
		
		//crear cadena de forma explicita
		String curso2=new String("Programacion Java");
		
		
		System.out.println(
				curso.equals(curso2)// compara por valor cadena con cadena2
				+"\n"+
				curso.equalsIgnoreCase(curso2)// compara por valor cadena con cadena2 ignorando el sensitive case
				);
	}
	
	public void Concatenacion() {
		String curso="Concatenacion Java";
		String texto="reaprendiendo metodos extras";
		
		String detalle=curso +", "+texto; //manera 1
		System.out.println(detalle);
		
		String detalle2=curso.concat(", ").concat(texto);  //manera2
		System.out.println(detalle2);
		
		//Por inmutabilidad
		
		String detalle3 = curso.transform(c -> { // manera 3 -> Utilizando funciones landa
			return c+ ", "+texto;
		});
		
		//----------------------
		//mutable
		StringBuilder sb=new StringBuilder(curso);
		sb.append(curso).append(", ").append(texto);
		
		System.out.println(sb.toString());
		
		String detalle4=detalle3.replace("o", "O"); //Sustitulle letras o texto en una cadena
		System.out.println(detalle4);
	}
	
	public void FuncionesVarias() {
		String cadenaTexto="Hola este es un texto en Java";
		boolean esBlanco=cadenaTexto.isBlank(); //verifica que la cadena no sea nula y que no solo tenga espacio en blanco sino letras
		int tamCaracteres=cadenaTexto.length(); //Tamaño de la cadena
		
		
		if(esBlanco==false) {
			System.out.println(cadenaTexto);
		}
		
		System.out.println(tamCaracteres);
		System.out.println(cadenaTexto.toUpperCase()); //Pasar texto a Mayusculas
		System.out.println(cadenaTexto.toLowerCase()); //Pasar texto a minusculas
		System.out.println(cadenaTexto.equals("Hola este es un texto en java")); //compara textos estrictamente y devuelve un boolean
		System.out.println(cadenaTexto.equalsIgnoreCase("Hola este es un texto en java")); //compara textos sin importar las mayusculas y minusculas y devuelve un boolean
		
		//Extraer textos
		System.out.println(cadenaTexto.charAt(0)); //trae un caracter definido, un espacio especifico en una cadena 
		System.out.println(cadenaTexto.substring(5)); //trae un caracter definido, un espacio especifico en una cadena 
		System.out.println(cadenaTexto.substring(5,15)); //trae una cadena de caracteres definido (inicio,termino) en una cadena 
		System.out.println("\n-----\n");
		String trabalenguas="trabalenguas";
		System.out.println(trabalenguas.replace("a", "@"));// remplaza caracteres de una cadena por uno asignado
		System.out.println(trabalenguas.indexOf("a")); //verifica si existe un cadena asignada devolviendo un entero
		System.out.println(trabalenguas.lastIndexOf("a")); //verifica la =ultima ocurrencia= en un cadena asignada devolviendo un entero
		System.out.println(trabalenguas.contains("a")); //verifica si existe un cadena asignada devolviendo un boolean
		
		System.out.println(trabalenguas); //quita espacios en blanco al inicio y al final
		
	}
	
	public void FuncionesVariasArreglos() {
		String CadenaTexto="Traba-lenguas";
		char[] arreglo=CadenaTexto.toCharArray(); //Pasar una cadena a un arreglo
		
		//Recorrer el arreglo
		for (int i = 0; i<arreglo.length;i++) {
			
			System.out.println("["+i+"] = "+arreglo[i]);
			
		}
		
		//----------
		System.out.println("---------------------");
		//----------
		
		//Separacion de cadena a partir de un caracter
		String[] arreglo2 = CadenaTexto.split("-");//*********[-]
		
		for (int i = 0; i < arreglo2.length; i++) {
			System.out.println("["+i+"] = "+arreglo2[i]);
		}
	}
	
	public void ConArchivos() {
		String archivo="reporte.Excel.xls";
		
		//Extraer la extension de un archivo
		System.out.println(
				archivo.substring(archivo.lastIndexOf(".")+1)  //Extrae la extension de un archivo aunque allan . antes de la extension
				);
	}

	public void Operadores() {
		//variable = (condicion) ? "si_es verdadero" : "Si es falso"
		int dato1=5;
		int dato2=6;
		
		//Operador ternario
		//variable = condicion ? si_es verdadero : si_es falso
		String DiferenciaNumeros = (dato1==dato2) ? "Son iguales": "Son diferentes";
		System.out.println(DiferenciaNumeros);
		
		//
		Integer numero=new Integer(3);//utilizado para declarar un numero entero -> int numero=3
		boolean N1=numero instanceof Integer; // instanceof utlizado para saber si el dato es una instancia de un objeto
		System.out.println(N1);
	}
	
}
