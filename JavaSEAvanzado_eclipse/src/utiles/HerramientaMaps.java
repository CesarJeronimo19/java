package utiles;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HerramientaMaps {
	public void ContadorPalabras() {
		Scanner sc=new Scanner(System.in);
		String cadenaTexto;
		System.out.println("Ingresa una cadena de texto");
		cadenaTexto=sc.nextLine();
		
		String[] palabras= cadenaTexto.split(" ");
		Map<String, Integer> contadorPalabras =new HashMap<>();
		
		for (String palabra : palabras) {
			contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0)+1);
		}
		
		for(Map.Entry<String, Integer> entry: contadorPalabras.entrySet()) {
			System.out.println(entry.getKey()+ ": "+entry.getValue());
		}
	}
}
