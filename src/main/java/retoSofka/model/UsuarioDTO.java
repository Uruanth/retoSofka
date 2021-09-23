package retoSofka.model;

public class UsuarioDTO {
	
	private int id;
	private String nombre;
	private String username;
	private String email;
	
	public UsuarioDTO() {
		
	}

	public UsuarioDTO(int id, String nombre, String username, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.username = username;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", nombre=" + nombre + ", username=" + username + ", email=" + email + "]";
	}
	
	
}
