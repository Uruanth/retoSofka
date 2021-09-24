package retoSofka.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import retoSofka.driver.IngresoBaseData;

public class RespuestasDAO {

	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public void crearRespuesta(RespuestasDTO rDTO) {
		
		String query="INSERT INTO bancorespuestas (id_pregunta, respuesta, tipo_respuesta) "
				+ "VALUES (?,?,?)";
		try {
			
			con=IngresoBaseData.getConexion();
			ps=con.prepareStatement(query);
			ps.setString(1, rDTO.getId_respuesta());
			ps.setString(2, rDTO.getRespuesta());
			ps.setString(3, rDTO.getTipo_respuesta());
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			
		} finally {
			try {
				IngresoBaseData.close(ps);
				IngresoBaseData.close(con);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	
	//Buscar por id de la pregunta
	public ArrayList<RespuestasDTO> respuestasById(String id){
		
		String query="SELECT * FROM bancorespuestas WHERE id_pregunta=?";
		ArrayList<RespuestasDTO> listaResp=new ArrayList<>();
		try {
			con=IngresoBaseData.getConexion();
			ps=con.prepareStatement(query);
			ps.setString(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				RespuestasDTO rdto= new RespuestasDTO();
				rdto.setId_respuesta(rs.getString(1));
				rdto.setRespuesta(rs.getString(2));
				rdto.setTipo_respuesta(rs.getString(3));
				listaResp.add(rdto);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				IngresoBaseData.close(rs);
				IngresoBaseData.close(ps);
				IngresoBaseData.close(con);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		return listaResp;
		
		
	}
}
