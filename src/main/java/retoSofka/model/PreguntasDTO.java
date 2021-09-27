package retoSofka.model;

/**
 * Clase para generar objetos de PreguntasDTO
 * 
 * @author Dairon Perilla
 *
 */
public class PreguntasDTO {

	private String id_pregunta;
	private String pregunta;

	private int catPregunt;

	/**
	 * Constructor vacio
	 */
	public PreguntasDTO() {

	}

	/**
	 * Constructor, id pregunta, pregunta y categoria de la pregunta
	 * 
	 * @param id_pregunta String
	 * @param pregunta    String
	 * @param catPregunt  int
	 */
	public PreguntasDTO(String id_pregunta, String pregunta, int catPregunt) {
		super();
		this.id_pregunta = id_pregunta;
		this.pregunta = pregunta;
		this.catPregunt = catPregunt;
	}

	/**
	 * Obtener el identificador de la pregunta
	 * 
	 * @return String
	 */
	public String getId_pregunta() {
		return id_pregunta;
	}

	/**
	 * Asignar identificador de pregunta
	 * 
	 * @param id_pregunta String
	 */
	public void setId_pregunta(String id_pregunta) {
		this.id_pregunta = id_pregunta;
	}

	/**
	 * Obtener la pregunta
	 * 
	 * @return String
	 */
	public String getPregunta() {
		return pregunta;
	}

	/**
	 * Asignar una pregunta al objeto
	 * 
	 * @param pregunta String
	 */
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	/**
	 * Obtiene la categoria de la pregunta
	 * 
	 * @return int
	 */
	public int getCatPregunt() {
		return catPregunt;
	}

	/**
	 * Asigna la categoria a la pregunta
	 * 
	 * @param catPregunt int
	 */
	public void setCatPregunt(int catPregunt) {
		this.catPregunt = catPregunt;
	}

	/**
	 * Sobreescribe el metodo toString
	 */
	@Override
	public String toString() {
		return "PreguntasDTO [id_pregunta=" + id_pregunta + ", pregunta=" + pregunta + ", catPregunt=" + catPregunt
				+ "]";
	}

}
