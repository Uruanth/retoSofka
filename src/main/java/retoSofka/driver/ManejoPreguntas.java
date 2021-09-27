package retoSofka.driver;

import java.util.ArrayList;

import retoSofka.model.PreguntasDAO;
import retoSofka.model.PreguntasDTO;
import retoSofka.model.UsuarioDTO;

/**
 * Clase para agregar preguntas y obtenerlas de la base de datos
 * 
 * @author Dairon Perilla
 *
 */
public class ManejoPreguntas {

	private PreguntasDAO preDAO = new PreguntasDAO();

	/**
	 * Recibe un ArrayList de preguntas para agregarlas a la Base de datos
	 * 
	 * @param lista ArrayList PreguntasDTO
	 */
	public void agregarBancoPreguntas(ArrayList<PreguntasDTO> lista) {

		for (PreguntasDTO pdto : lista) {
			preDAO.agregarPregunta(pdto);
		}
	}

	/**
	 * Devuelve un ArrayList con preguntas y respuestas de la base de datos
	 * @param us UsuaraioDTO con minimo Id
	 * @return ArrayList de RondasPreguntas
	 */
	public ArrayList<RondasPreguntas> preguntasRonda(UsuarioDTO us) {

		ArrayList<RondasPreguntas> bancoPreguntas = new GeneradorPreguntasRespuestas().listaCompleta(us);

		return bancoPreguntas;
	}

}
