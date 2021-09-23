package retoSofka.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import retoSofka.driver.IngresoBaseData;

public class PreguntasDAO {
	
	//Leer preguntas por categoria
	public ArrayList<PreguntasDTO> consultaByCategoria(PreguntasDTO pdto){
		
		String query="SELECT * FROM bancopreguntas WHERE categoriaPregunta=?";
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ArrayList<PreguntasDTO> lista=new ArrayList<>();
    		
		try {
			con = IngresoBaseData.getConexion();
			ps = con.prepareStatement(query);
			ps.setInt(1, pdto.getCatPregunt());
			rs=ps.executeQuery();
			while(rs.next()) {
				PreguntasDTO pregDTO = new PreguntasDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
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
 
	
	public void agregarPregunta(PreguntasDTO pdto) {
		String query = "INSERT INTO bancopreguntas (id_pregunta,"
				+ "pregunta, tipo_pregunta, categoriaPregunta) VALUES (?,?,?,?)";
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=IngresoBaseData.getConexion();
			ps=con.prepareStatement(query);
			ps.setString(1, pdto.getId_pregunta());
			ps.setString(2, pdto.getPregunta());
			ps.setString(3, pdto.getTipoPregunta());
			ps.setInt(4, pdto.getCatPregunt());
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
