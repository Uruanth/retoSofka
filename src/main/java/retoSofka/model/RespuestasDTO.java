package retoSofka.model;

public class RespuestasDTO {

	private String id_respuesta;
	private String respuesta;
	private String tipo_respuesta;
	
	public RespuestasDTO(String id_respuesta, String respuesta, String tipo_respuesta) {
		super();
		this.id_respuesta = id_respuesta;
		this.respuesta = respuesta;
		this.tipo_respuesta = tipo_respuesta;
	}

	public RespuestasDTO() {
	}

	public String getId_respuesta() {
		return id_respuesta;
	}

	public void setId_respuesta(String id_respuesta) {
		this.id_respuesta = id_respuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public String getTipo_respuesta() {
		return tipo_respuesta;
	}

	public void setTipo_respuesta(String tipo_respuesta) {
		this.tipo_respuesta = tipo_respuesta;
	}

	@Override
	public String toString() {
		return "RespuestasDTO [id_respuesta=" + id_respuesta + ", respuesta=" + respuesta + ", tipo_respuesta="
				+ tipo_respuesta + "]";
	}
	
	
	
}
