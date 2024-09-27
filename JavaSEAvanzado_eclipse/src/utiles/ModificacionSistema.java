package utiles;

import java.util.Properties;

public class ModificacionSistema {
	
	public void SystemAcceso(){
		String username=System.getProperty("user.name");
		System.out.println(username);
		
		String home=System.getProperty("user.home");
		System.out.println(home);
		
		String workspace=System.getProperty("user.dir");
		System.out.println(workspace);
		
		String java=System.getProperty("java.version");
		System.out.println(java);
		
		Properties p=System.getProperties();
		p.list(System.out);
		
	}
}
