package retoSofka.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import retoSofka.driver.IngresoBaseData;

public class HistorialDAO {
	
	//Crear nuevo registro de juego
	public void create(HistorialDTO hdto) {
		
		String query="INSERT INTO historial (id_user, numeroIntento, puntaje, premioAcumulado) VALUES (?,?,?,?)";
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=IngresoBaseData.getConexion();
			ps=con.prepareStatement(query);
			ps.setInt(1, hdto.getId_user());
			ps.setInt(2, hdto.getNumeroIntento());
			ps.setInt(3, hdto.getPuntaje());
			ps.setInt(4, hdto.getAcumulado());
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

	//Leer los registros de juego
	public ArrayList<HistorialDTO> registros(HistorialDTO hdto){
		
		ArrayList<HistorialDTO> lista=new ArrayList<>();
		String query = "SELECT * FROM historial WHERE id_user=?";
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			con=IngresoBaseData.getConexion();
			ps=con.prepareStatement(query);
			ps.setInt(1, hdto.getId_user());
			rs=ps.executeQuery();
			while(rs.next()) {
				HistorialDTO hisDTO = new HistorialDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
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
	

	//Actualizar
	public void actualizar(HistorialDTO hdto) {
		String query="UPDATE historial SET numeroIntento=?, puntaje=?, premioAcumulado=?"
				+ "WHERE id_user=?";
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=IngresoBaseData.getConexion();
			ps=con.prepareStatement(query);
			ps.setInt(1, hdto.getNumeroIntento());
			ps.setInt(2, hdto.getPuntaje());
			ps.setInt(3, hdto.getAcumulado());
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
