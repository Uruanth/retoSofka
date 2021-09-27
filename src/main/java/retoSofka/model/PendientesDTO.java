package retoSofka.model;

/**
 * Objeto para almacenar id y categoria de la sesion actual
 * 
 * @author Dairon Perilla
 *
 */
public class PendientesDTO {

	private int id_user, categoriaPregunta;

	/**
	 * Constructor PendientesDTO
	 * 
	 * @param id_user           int
	 * @param categoriaPregunta int
	 */
	public PendientesDTO(int id_user, int categoriaPregunta) {
		super();
		this.id_user = id_user;
		this.categoriaPregunta = categoriaPregunta;
	}

	/**
	 * Constructor vacio
	 */
	public PendientesDTO() {

	}

	/**
	 * Obtiene el id del usuario
	 * 
	 * @return int
	 */
	public int getId_user() {
		return id_user;
	}

	/**
	 * Asignar id de usuario a la sesion
	 * 
	 * @param id_user
	 */
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	/**
	 * Obtiene la categoria de la sesion
	 * 
	 * @return int
	 */
	public int getCategoriaPregunta() {
		return categoriaPregunta;
	}

	/**
	 * Asignar categoria a la sesion
	 * 
	 * @param categoriaPregunta int
	 */
	public void setCategoriaPregunta(int categoriaPregunta) {
		this.categoriaPregunta = categoriaPregunta;
	}

	/**
	 * Sobreescribe el metodo toString
	 */
	@Override
	public String toString() {
		return "PendientesDTO [id_user=" + id_user + ", categoriaPregunta=" + categoriaPregunta + "]";
	}

}
