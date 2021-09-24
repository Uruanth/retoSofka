package retoSofka.driver;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import retoSofka.model.UsuarioDAO;
import retoSofka.model.UsuarioDTO;

@WebServlet("/ManejoPeticiones")
public class ManejoUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ManejoUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		System.out.println("ingreso usuario");
		UsuarioDTO usDTO = new UsuarioDTO();
		UsuarioDAO usDAO = new UsuarioDAO();
		
		try {
			usDTO.setId(Integer.parseInt(request.getParameter("id")));
			System.out.println("documento "+ request.getParameter("id"));
			System.out.println(usDTO);
			
			//Verificar existencia de usuario, solo requiere id
			if(existeUsuario(usDTO, usDAO)) usDTO=usDAO.leerById(usDTO);
			else {
				
			//Crear usuario
				usDTO.setEmail(request.getParameter("email"));
				usDTO.setNombre(request.getParameter("nombre"));
				usDTO.setUsername(request.getParameter("username"));
				usDAO.cear(usDTO);
				
				
				/*if(request.getParameter("email")==null
						|| request.getParameter("nombre")==null
						|| request.getParameter("username")==null) {
					System.out.println("ingrese todos los datos");
				}else {
					usDTO.setEmail(request.getParameter("email"));
					usDTO.setNombre(request.getParameter("nombre"));
					usDTO.setUsername(request.getParameter("username"));	
				}*/
				
			}
			
			//Asignar banco de preguntas
			ManejoPreguntas mPreguntas=new ManejoPreguntas();
			ArrayList<RondasPreguntas> bancoPreguntas = mPreguntas.preguntasRonda(usDTO);
			
			//Definir atributos para reenviar y e iniciar el juego
			request.setAttribute("Preguntas", bancoPreguntas);

			RequestDispatcher rd;
			rd=request.getRequestDispatcher("juego.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			//Usuario no existe Solicitar datos de inscripcion 
			usDTO=null;
			System.out.println("hubo un error");
		
		}
		System.out.println("fin dopost");
		
	}
	
	private boolean existeUsuario(UsuarioDTO us, UsuarioDAO usDAO) {
		if(usDAO.leerById(us) == null) 	return false;
		return true;
	}
	

}
