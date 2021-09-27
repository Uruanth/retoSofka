package retoSofka.model;

/**
 * Clase para crear objetos UsuariosDTO
 * 
 * @author Dairon Perilla
 *
 */
public class UsuarioDTO {

	private int id;
	private String nombre;
	private String username;
	private String email;

	/**
	 * Constructor vacio
	 */
	public UsuarioDTO() {

	}

	/**
	 * Constructor objetos UsuarioDTO
	 * 
	 * @param id       id usuario int
	 * @param nombre   String
	 * @param username usuario unico String
	 * @param email    String
	 */
	public UsuarioDTO(int id, String nombre, String username, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.username = username;
		this.email = email;
	}

	/**
	 * Obtener identificacion
	 * 
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * Asignar id al usuario
	 * 
	 * @param id int
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Obtener nombre del usuario
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asignar nombre al usuario
	 * 
	 * @param nombre String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener nombre unico del usuario
	 * 
	 * @return String
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Asignar nombre de usuario unico
	 * 
	 * @param username String
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Obtener email del usuario
	 * 
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Asignar email al usuario
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Sobreescribir el metodo toString
	 */
	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", nombre=" + nombre + ", username=" + username + ", email=" + email + "]";
	}

}
