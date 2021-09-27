package retoSofka.model;

/**
 * Clase generar objetos RespuestasDTO
 * 
 * @author Dairon Perilla
 *
 */
public class RespuestasDTO {

	private String id_respuesta;
	private String respuesta;
	private String tipo_respuesta;

	/**
	 * Constructor que recibe id de las respuesta, igual al de la pregunta asociada
	 * la respuesta y si la respuesta es correcta o incorrecta (C/I)
	 * 
	 * @param id_respuesta
	 * @param respuesta
	 * @param tipo_respuesta
	 */
	public RespuestasDTO(String id_respuesta, String respuesta, String tipo_respuesta) {
		super();
		this.id_respuesta = id_respuesta;
		this.respuesta = respuesta;
		this.tipo_respuesta = tipo_respuesta;
	}

	/**
	 * Constructor vacio
	 */
	public RespuestasDTO() {
	}

	/**
	 * Obtener el identifiador de la respuesta
	 * 
	 * @return String
	 */
	public String getId_respuesta() {
		return id_respuesta;
	}

	/**
	 * Asignar identificador a la respuesta
	 * 
	 * @param id_respuesta String
	 */
	public void setId_respuesta(String id_respuesta) {
		this.id_respuesta = id_respuesta;
	}

	/**
	 * Obtiene la respuesta
	 * 
	 * @return String
	 */
	public String getRespuesta() {
		return respuesta;
	}

	/**
	 * Asignar la respuesta al objeto
	 * 
	 * @param respuesta
	 */
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	/**
	 * Obtener el tipo de la respuesta
	 * 
	 * @return String
	 */
	public String getTipo_respuesta() {
		return tipo_respuesta;
	}

	/**
	 * Asignar el tipo de respuesta (C/I)
	 * 
	 * @param tipo_respuesta String
	 */
	public void setTipo_respuesta(String tipo_respuesta) {
		this.tipo_respuesta = tipo_respuesta;
	}

	/**
	 * Sobreescribir el metodo toString
	 */
	@Override
	public String toString() {
		return "RespuestasDTO [id_respuesta=" + id_respuesta + ", respuesta=" + respuesta + ", tipo_respuesta="
				+ tipo_respuesta + "]";
	}

}
