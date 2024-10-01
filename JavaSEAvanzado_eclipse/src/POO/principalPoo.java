package POO;

public class principalPoo {
	public static void main(String[] args) {

		Automovil chevrolet=new Automovil("Chrevrolet","2024","Negro",3.0);
		System.out.println(chevrolet.verDetalle());
		Automovil.patenteColor="Azul";
		
		Automovil mazda=new Automovil("Mazda","2025","Negro",4.0);
		System.out.println("\n"+chevrolet.verDetalle());
		//POJO-BEANS(algunos frameworks) -> el encapsulamiento
		
		
		
	}
}
