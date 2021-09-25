package retoSofka.driver;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

import retoSofka.model.UsuarioDAO;
import retoSofka.model.UsuarioDTO;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		UsuarioDTO usDTO=new UsuarioDTO(154, null, null, null);
		UsuarioDAO da=new UsuarioDAO();
		
		
		ManejoPreguntas mPreguntas=new ManejoPreguntas();
		ArrayList<RondasPreguntas> bancoPreguntas = mPreguntas.preguntasRonda(usDTO);
		System.out.println(bancoPreguntas.size());
		while(bancoPreguntas.size()>5) bancoPreguntas.remove(5);
		System.out.println(bancoPreguntas.size());
		for(RondasPreguntas r: bancoPreguntas) {
			System.out.println("");
			System.out.println(r);
			System.out.println("");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		/*
		 Se genero la base de datos de prueba 
		 System.out.println("inicio");
		 PreguntasRespuestasPruebas prn = new PreguntasRespuestasPruebas();
		 prn.iniciarBD();		
		 System.out.println("ok");
		
		  */
		 
		
		System.out.println("servlet pru");
	}

}
