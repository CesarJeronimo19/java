package utiles;

import java.io.FileInputStream;
import java.util.Properties;

public class ManejoArchivos {
	
	public void AccediendoConfigProperties(){
		//Creamos el archivo con extension .properties
		try {
			FileInputStream archivo=new FileInputStream("src/utiles/config.properties"); //Ruta de donde se encuentra el archivo .properties
			Properties p=new Properties(System.getProperties()); //generamos el objeto para despues acceder a el
			p.load(archivo); //cargamos el archivo properties al objeto creado
			p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto java"); //agregamos una propiedad fuera del archivo .properties
			System.setProperties(p);  //asignamos los datos al sistema
			
			Properties ps=System.getProperties(); //Creamos el objeto propeties
			System.out.println("mi.propiedad.personalizada="+ps.getProperty("mi.propiedad.personalizada"));//obtenemos la propiedad del objeto
			
			ps.list(System.out); //obtenemos todo el listado de las propiedades del sistema
			
		} catch (Exception e) {
			System.out.println("No existe el archivo = "+e);
		}
		
		
	}
}
