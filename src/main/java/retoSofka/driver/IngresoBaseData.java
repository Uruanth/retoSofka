package retoSofka.driver;

import java.sql.*;
/**
 * Clase en la cual se configura la conexion y cierre de los objetos
 * necesarios para ingresar a la base de datos
 * @author Dairon Perilla
 *
 */
public class IngresoBaseData {
	
	private static String rutaBaseDatos = "jdbc:mysql://localhost:";
	private static String puerto = "3306";
	private static String nombreBaseDatos = "sofkareto";
	private static String usuarioBaseDatos = "root";
	private static String passwordBaseDatos = "admin";
	private static String rutaCompleta = rutaBaseDatos+puerto +"/"+nombreBaseDatos; 
	/**
	 * Genera la conexion con el servidor SQL con los atributos estaticos
	 * definidos al inicio
	 * @return
	 * @throws SQLException
	 */
	
	public static Connection getConexion() throws SQLException {
		//System.out.println("con ok \n");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error conexion");		
		}
		
		return DriverManager.getConnection(rutaCompleta, usuarioBaseDatos, passwordBaseDatos);
	}

	 /**
	 * Metodo estatico que cierra un objeto tipo conexion
	 * @param con
	 * @throws SQLException
	 */
	public static void close(Connection con) throws SQLException {
		con.close();
	}
	
	/**
	 * Metodo estatico que cierra un objeto tipo PreparedStatement
	 * @param ps
	 * @throws SQLException
	 */
	public static void  close(PreparedStatement ps) throws SQLException {
		ps.close();
	}
	
	/**
	 * Metodo estatico que cierra un objeto tipo Statement
	 * @param st
	 * @throws SQLException
	 */
	public static void  close(Statement st) throws SQLException {
		st.close();
	}
	
	/**
	 * Metodo estatico que cierra un objeto tipo ResultSet
	 * @param rs
	 * @throws SQLException
	 */
	public static void  close(ResultSet rs) throws SQLException {
		rs.close();
	}
}
