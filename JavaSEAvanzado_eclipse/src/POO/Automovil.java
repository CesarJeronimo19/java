package POO;

public class Automovil {
	
	//Atributos del objeto
	public String cadenaTexto; 
	private String fabricante;
	private String modelo;
	private String color;
	private double cilindrada;
	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	//
	public Automovil() {
	}
	
	public Automovil(String fabricante, String modelo, String color, double cilindrada) {
		this.setFabricante(fabricante);
		this.setModelo(modelo);
		this.setColor(color);
		this.setCilindrada(cilindrada);
	}
	
	public String verDetalle() {
		return "auto.fabricante: " + this.getFabricante()+
				"\nauto.modelo: " + this.getModelo()+
				"\nauto.color: " + this.getColor()+
				"\nauto.cilindrada: " + this.getCilindrada();
	}
	
	public String acelerar(int rpm) {
		return "El auto "+this.getFabricante()+" acelerando a "+rpm+" rpm";
	}
	
	public String frenar() {
		return this.getFabricante()+" "+this.getModelo()+" frenando !";
	}
	
	public String acelerarFrenar(int rpm) {
		return this.acelerar(rpm)+"\n"+this.frenar();
	}


	
}
