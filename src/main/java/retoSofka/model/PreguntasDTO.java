package retoSofka.model;

public class PreguntasDTO {

	private String id_pregunta;
	private String pregunta;
	
	private int catPregunt;
		
	public PreguntasDTO() {
		
	}

	public PreguntasDTO(String id_pregunta, String pregunta,  int catPregunt) {
		super();
		this.id_pregunta = id_pregunta;
		this.pregunta = pregunta;
		this.catPregunt = catPregunt;
	}

	public String getId_pregunta() {
		return id_pregunta;
	}

	public void setId_pregunta(String id_pregunta) {
		this.id_pregunta = id_pregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	
	public int getCatPregunt() {
		return catPregunt;
	}

	public void setCatPregunt(int catPregunt) {
		this.catPregunt = catPregunt;
	}

	@Override
	public String toString() {
		return "PreguntasDTO [id_pregunta=" + id_pregunta + ", pregunta=" + pregunta + 
				", catPregunt=" + catPregunt + "]";
	}
	
	
	
	
}
