package retoSofka.model;

public class HistorialDTO {

	private int id_user;
	private int numeroIntento;
	private int puntaje;

	/**
	 * Constructor vacio
	 */
	public HistorialDTO() {

	}

	/**
	 * Constructor HistorialDTO
	 * 
	 * @param id_user       identificacion usuario
	 * @param numeroIntento numero de intento actual
	 * @param puntaje       puntaje de la ronda
	 */
	public HistorialDTO(int id_user, int numeroIntento, int puntaje) {
		super();
		this.id_user = id_user;
		this.numeroIntento = numeroIntento;
		this.puntaje = puntaje;
	}

	/**
	 * Obtener identificacion del usuario
	 * 
	 * @return int
	 */
	public int getId_user() {
		return id_user;
	}

	/**
	 * Asignar id de usuario al objeto
	 * 
	 * @param id_user int
	 */
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	/**
	 * Obtener intento actual
	 * 
	 * @return int
	 */
	public int getNumeroIntento() {
		return numeroIntento;
	}

	/**
	 * Asigna el intento actual
	 * 
	 * @param numeroIntento int
	 */
	public void setNumeroIntento(int numeroIntento) {
		this.numeroIntento = numeroIntento;
	}

	/**
	 * Obtiene el puntaje de la ronda
	 * 
	 * @return int
	 */
	public int getPuntaje() {
		return puntaje;
	}

	/**
	 * Asigna el puntaje de la ronda
	 * 
	 * @param puntaje int
	 */
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	/**
	 * Sobreescribe el metodo toString
	 */
	@Override
	public String toString() {
		return "HistorialDTO [id_user=" + id_user + ", numeroIntento=" + numeroIntento + ", puntaje=" + puntaje + "]";
	}

}
