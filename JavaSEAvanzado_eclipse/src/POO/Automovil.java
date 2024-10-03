package POO;

public class Automovil {
	/*
	 * Atributos
	 * metodos
	 * getters and setters
	 * metodos de operacion
	 * metodos a sobreescribir/remplazar
	 */
	//Atributos del objeto
	public String cadenaTexto; 
	private String fabricante;
	private String modelo;
	private String color;
	private double cilindrada;
	
	static String patenteColor = "Naranja";
	
	public Automovil() {
	}
	
	public Automovil(String fabricante, String modelo) {
		this.fabricante=fabricante;
		this.modelo=modelo;
	}
	
	public Automovil(String fabricante, String modelo, String color, double cilindrada) {
		this(fabricante,modelo);	//Polimorfismo y reutilizacion-> esta haciendo enfasis en el contructor anterirmente creado
		this.setColor(color);
		this.setCilindrada(cilindrada);
	}

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
	
	public String verDetalle() {
		return "auto.fabricante: " + this.getFabricante()+
				"\nauto.modelo: " + this.getModelo()+
				"\nauto.color: " + this.getColor()+
				"\nauto.patenteColor: "+ patenteColor +
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

	//Sobre escritura de metodo
	//(en este caso) clase padre objeto
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	//Sobreescribiendo metodo toString
	@Override
	public String toString() {
		return "Automovil [cadenaTexto=" + cadenaTexto + 
							", fabricante=" + fabricante + 
							", modelo=" + modelo
							+ ", color=" + color + 
							", cilindrada=" + cilindrada + 
							"]";
	}
	

}
