package retoSofka.driver;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import retoSofka.model.UsuarioDTO;

/**
 * Servlet implementation class ManejoFinPrueba
 */
@WebServlet("/ManejoFinPrueba")
public class ManejoFinPrueba extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManejoFinPrueba() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
				
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
if(request.getParameter("fin")!=null) {
			
			int id=Integer.parseInt(request.getParameter("id"));
			request.setAttribute("idus", id);
			RequestDispatcher rd;
			rd=request.getRequestDispatcher("resultado.jsp");
			rd.forward(request, response);
			
		}
		
		if(request.getParameter("continuar")!=null) {
			int id=Integer.parseInt(request.getParameter("id"));
			if(request.getParameter("c").equals("C")) {
				
				//Asignar banco de preguntas
				UsuarioDTO usDTO =new UsuarioDTO();
				usDTO.setId(id);
				ManejoPreguntas mPreguntas=new ManejoPreguntas();
				ArrayList<RondasPreguntas> bancoPreguntas = mPreguntas.preguntasRonda(usDTO);
				while(bancoPreguntas.size()>5) bancoPreguntas.remove(5);
				for(RondasPreguntas r: bancoPreguntas) {
					//System.out.println("");
					//System.out.println(r.getPreguntas().getId_pregunta());
				}
				
				request.setAttribute("Preguntas", bancoPreguntas);
				
				request.setAttribute("idus", usDTO.getId());
				RequestDispatcher rd;
				rd=request.getRequestDispatcher("juego.jsp");
				rd.forward(request, response);
				
			}else {
				request.setAttribute("idus", id);
				response.sendRedirect("/resultado.jsp");
				
			}
			
			
			
		}
	}

}
