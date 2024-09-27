package modelos;

public class PersonajesMarvel {
	private String nombre;
	private String poder;
	private Persona persona;
	
	public PersonajesMarvel() {}
	
	public PersonajesMarvel(String nombre, String poder, Persona p) {
		this.nombre=nombre;
		this.poder=poder;
		this.persona=p;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Super Heroe [nombre=" + nombre + ", poder=" + poder + ", persona=" + persona + "]";
	}
	
}
