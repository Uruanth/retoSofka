package retoSofka.driver;

import java.sql.*;

public class IngresoBaseData {
	
	private static String rutaBaseDatos = "jdbc:mysql:localhost:";
	private static String puerto = "3306";
	private static String nombreBaseDatos = "sofkareto";
	private static String usuarioBaseDatos = "root";
	private static String passwordBaseDatos = "admin";
	
	private static String rutaCompleta = rutaBaseDatos+puerto +"/"+nombreBaseDatos; 
	
	public static Connection getConexion() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("conexion ok");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error conexion");		
		}
		
		return DriverManager.getConnection(rutaCompleta, usuarioBaseDatos, passwordBaseDatos);
	}

	public static void close(Connection con) throws SQLException {
		con.close();
	}
	
	public static void  close(PreparedStatement ps) throws SQLException {
		ps.close();
	}
	
	public static void  close(Statement st) throws SQLException {
		st.close();
	}
	
	public static void  close(ResultSet rs) throws SQLException {
		rs.close();
	}
}
