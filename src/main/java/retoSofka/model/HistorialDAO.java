package retoSofka.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import retoSofka.driver.IngresoBaseData;

/**
 * Objeto para consultar y recuperar la información del historial
 * 
 * @author Dairon Perilla
 *
 */
public class HistorialDAO {

	/**
	 * Crear nuevo registro en el historial
	 * 
	 * @param hdto HistorialDTO
	 */
	public void create(HistorialDTO hdto) {

		String query = "INSERT INTO historial (id_user, numeroIntento, puntaje) VALUES (?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = IngresoBaseData.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, hdto.getId_user());
			ps.setInt(2, hdto.getNumeroIntento());
			ps.setInt(3, hdto.getPuntaje());
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

	/**
	 * Consultar todo el historial de un usuario
	 * 
	 * @param hdto HistorialDTO
	 * @return ArrayList HistorialDTO
	 */
	public ArrayList<HistorialDTO> registros(HistorialDTO hdto) {

		ArrayList<HistorialDTO> lista = new ArrayList<>();
		String query = "SELECT * FROM historial WHERE id_user=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = IngresoBaseData.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, hdto.getId_user());
			rs = ps.executeQuery();
			while (rs.next()) {
				HistorialDTO hisDTO = new HistorialDTO(rs.getInt("id_user"), rs.getInt("numeroIntento"),
						rs.getInt("puntaje"));
				lista.add(hisDTO);
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
	 * Metodo para actualizar el historial
	 * 
	 * @param hdto HistorialDTO
	 */
	public void actualizar(HistorialDTO hdto) {
		String query = "UPDATE historial SET numeroIntento=?, puntaje=??" + "WHERE id_user=?";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = IngresoBaseData.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, hdto.getNumeroIntento());
			ps.setInt(2, hdto.getPuntaje());
			ps.setInt(4, hdto.getId_user());
			ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			try {
				IngresoBaseData.close(ps);
				IngresoBaseData.close(con);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
