package retoSofka.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import retoSofka.driver.IngresoBaseData;

public class PendientesDAO {

	
//Clase para manejar los juegos pausados y retomados despues
	
	public void crear(PendientesDTO pdto) {
		
		String query="INSERT INTO pendientes (id_user, id_categoria) VALUES (?,?)";
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con = IngresoBaseData.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, pdto.getId_user());
			ps.setInt(2, pdto.getCategoriaPregunta());
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
	
//Consultar pendientes	
	public PendientesDTO consultar(PendientesDTO pdto) {
		
		String query = "SELECT * FROM pendientes WHERE id_user=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =  null;
		
		try {
			con = IngresoBaseData.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, pdto.getId_user());
			rs=ps.executeQuery();
			try {
				rs.next();
				pdto.setCategoriaPregunta(rs.getInt("id_categoria"));
			} catch (Exception e) {
				pdto = null;
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
		
		
		
		return pdto;
	}
	
	
//Borrar pendientes
	public void pendientes(PendientesDTO pdto) {
		
		String query ="DELETE FROM pendientes WHERE id_user=?";
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=IngresoBaseData.getConexion();
			ps=con.prepareStatement(query);
			ps.setInt(1, pdto.getId_user());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	
//actualizar	
	public void actualizar(PendientesDTO p) {
		String query="UPDATE pendientes SET id_categoria=? WHERE id_user=?";
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=IngresoBaseData.getConexion();
			ps=con.prepareStatement(query);
			ps.setInt(1, p.getCategoriaPregunta());
			ps.setInt(2, p.getId_user());
			ps.executeUpdate();
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
