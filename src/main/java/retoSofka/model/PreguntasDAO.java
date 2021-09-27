package retoSofka.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import retoSofka.driver.IngresoBaseData;

/**
 * Clase para general consultas en la base de datos con objetos de tipo
 * PreguntasDTO
 * 
 * @author Dairon Perilla
 *
 */
public class PreguntasDAO {

	/**
	 * Selecciona todas las preguntas de una categoria especifica
	 * 
	 * @param pdto PreguntasDTO
	 * @return ArrayList PreguntasDTO
	 */
	public ArrayList<PreguntasDTO> consultaByCategoria(int pdto) {

		String query = "SELECT * FROM bancopreguntas WHERE categoriaPregunta=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<PreguntasDTO> lista = new ArrayList<>();

		try {
			con = IngresoBaseData.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, pdto);
			rs = ps.executeQuery();
			while (rs.next()) {
				PreguntasDTO pregDTO = new PreguntasDTO(rs.getString(1), rs.getString(2), rs.getInt(3));
				lista.add(pregDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				IngresoBaseData.close(rs);
				IngresoBaseData.close(ps);
				IngresoBaseData.close(con);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return lista;
	}

	/**
	 * Agrega objetos tipo PreguntasDTO a la base de datos
	 * 
	 * @param pdto PreguntasDTO
	 */
	public void agregarPregunta(PreguntasDTO pdto) {
		String query = "INSERT INTO bancopreguntas (id_pregunta," + "pregunta, categoriaPregunta) VALUES (?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = IngresoBaseData.getConexion();
			ps = con.prepareStatement(query);
			ps.setString(1, pdto.getId_pregunta());
			ps.setString(2, pdto.getPregunta());
			ps.setInt(3, pdto.getCatPregunt());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				IngresoBaseData.close(ps);
				IngresoBaseData.close(con);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
