package retoSofka.driver;

import java.util.ArrayList;

import retoSofka.model.HistorialDAO;
import retoSofka.model.HistorialDTO;
import retoSofka.model.PendientesDAO;
import retoSofka.model.PendientesDTO;
import retoSofka.model.UsuarioDAO;

/**
 * Clase para obtener el historial de puntajes del usuario
 * 
 * @author Dairon Perilla
 *
 */
public class ManejoPuntaje {
	/**
	 * Metodo para obtener el Id del usuario activo
	 * 
	 * @return Id del usuario activo
	 */
	private int consultarID() {
		UsuarioDAO ua = new UsuarioDAO();
		int id;
		try {
			id = ua.leerByEstado(1);
		} catch (Exception e) {
			id = 0;
			System.out.println("error consultar id");
		}

		return id;
	}

	/**
	 * Metodo para determinar la categoria de la ultima ronda jugada
	 * 
	 * @return categoria actual
	 */
	private int consultarCate() {
		int id = consultarID();
		if (id == 0) {
			return 0;
		} else {
			PendientesDTO pt = new PendientesDTO();
			pt.setId_user(id);
			PendientesDAO pa = new PendientesDAO();
			pt = pa.consultar(pt);
			int cat = pt.getCategoriaPregunta();
			pa.pendientes(pt);
			return cat;
		}

	}

	/**
	 * Metodo para obtener un ArrayList con el historial del usuario
	 * 
	 * @return ArrayList HistorialDTO
	 */
	public ArrayList<HistorialDTO> lista() {
		ArrayList<HistorialDTO> lista = new ArrayList<HistorialDTO>();

		HistorialDAO ha = new HistorialDAO();
		HistorialDTO ht = new HistorialDTO();
		ht.setId_user(consultarID());
		if (ht.getId_user() != 0) {

			lista = ha.registros(ht);
			ht.setNumeroIntento(lista.size() + 1);
			ht.setPuntaje(consultarCate());
			lista.add(ht);
			ha.create(ht);
			UsuarioDAO usDAO = new UsuarioDAO();
			usDAO.cambiarEstado(consultarID(), 0);
			return lista;
		}

		return null;
	}

}
