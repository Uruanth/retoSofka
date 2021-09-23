package retoSofka.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import retoSofka.driver.IngresoBaseData;

public class UsuarioDAO {
	
	//Crear usuario en la Base de datos 
	public void cear(UsuarioDTO udto) {
		String query = "INSERT INTO usuarios (id, nombre, username, email) VALUES (?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con=IngresoBaseData.getConexion();
			ps=con.prepareStatement(query);
			ps.setInt(1, udto.getId());
			ps.setString(2, udto.getNombre());
			ps.setString(3, udto.getUsername());
			ps.setString(4, udto.getEmail());
			ps.executeQuery();
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

	//Leer usuario por su Id
	public UsuarioDTO leerById(UsuarioDTO udto) {
		String query = "SELECT * FROM usuarios WHERE id=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = IngresoBaseData.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, udto.getId());
			rs=ps.executeQuery();
			rs.next();
			try {
				udto.setNombre(rs.getString(2));
				udto.setUsername(rs.getString(3));
				udto.setEmail(rs.getString(4));
			} catch (Exception e) {
				udto = null;
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
		
		return udto;
	}

	
}
