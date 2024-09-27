package modelos;

public class Persona {
	private String nombrePersonal;
	private String ciudad;
	private String sexo;
	
	public Persona() {}
	
	public Persona(String nombreR, String ciudad, String sexo) {
		this.nombrePersonal=nombreR;
		this.ciudad=ciudad;
		this.sexo=sexo;
	}

	public String getNombrePersonal() {
		return nombrePersonal;
	}

	public void setNombrePersonal(String nombrePersonal) {
		this.nombrePersonal = nombrePersonal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombrePersonal=" + nombrePersonal + ", ciudad=" + ciudad + ", sexo=" + sexo + "]";
	}
	
	
}
