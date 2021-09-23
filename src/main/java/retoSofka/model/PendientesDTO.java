package retoSofka.model;

public class PendientesDTO {

	private int id_user, categoriaPregunta;

	public PendientesDTO(int id_user, int categoriaPregunta) {
		super();
		this.id_user = id_user;
		this.categoriaPregunta = categoriaPregunta;
	}
	
	public PendientesDTO() {
		
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getCategoriaPregunta() {
		return categoriaPregunta;
	}

	public void setCategoriaPregunta(int categoriaPregunta) {
		this.categoriaPregunta = categoriaPregunta;
	}

	@Override
	public String toString() {
		return "PendientesDTO [id_user=" + id_user + ", categoriaPregunta=" + categoriaPregunta + "]";
	}
	
	
	
}
