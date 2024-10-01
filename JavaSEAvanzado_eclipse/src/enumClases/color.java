package enumClases;

public enum color {
	ROJO("rojo"),
	GRIS("gris oxford"),
	BLANCO("Blanco bandera"),
	NEGRO("Negro mate"),
	DORADO("Dorado Ligote"),
	VERDE("verde pasto"),
	AMARILLO("Amarillo pollo");
	
	private final String color;
	
	color(String color){
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	
}
