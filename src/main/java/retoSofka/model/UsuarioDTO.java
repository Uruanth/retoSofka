package retoSofka.model;

import java.sql.Connection;
import java.sql.SQLException;

import retoSofka.driver.IngresoBaseData;

public class UsuarioDTO {
	
	
	public void pru() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		con=IngresoBaseData.getConexion();
		IngresoBaseData.close(con);
	}
	
	
	
	

}
