package retoSofka.driver;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import retoSofka.model.PreguntasDAO;
import retoSofka.model.PreguntasDTO;
import retoSofka.model.UsuarioDAO;
import retoSofka.model.UsuarioDTO;

/**
 * Servlet que recibe la información de juego.jsp y concluye el siguiente paso
 * 
 * @author Dairon Perilla
 *
 */
@WebServlet("/ManejoFinJuego")
public class ManejoFinJuego extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ManejoFinJuego() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * El metodo doGet recibe la informacion y determina si la respuesta fue
	 * contestada correctamente, el jugador finalizo la partida o perdio. 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id = Integer.parseInt(request.getParameter("id"));
		if (request.getParameter("fin") != null) {

			response.sendRedirect("./resultado.jsp");

		}

		if (request.getParameter("continuar") != null) {

			if (request.getParameter("c").equals("C")) {

				// Asignar banco de preguntas
				UsuarioDTO usDTO = new UsuarioDTO();
				usDTO.setId(id);
				ManejoPreguntas mPreguntas = new ManejoPreguntas();
				ArrayList<RondasPreguntas> bancoPreguntas = mPreguntas.preguntasRonda(usDTO);
				while (bancoPreguntas.size() > 5)
					bancoPreguntas.remove(5);
				for (RondasPreguntas r : bancoPreguntas) {
					// System.out.println("");
					// System.out.println(r.getPreguntas().getId_pregunta());
				}

				request.setAttribute("Preguntas", bancoPreguntas);

				request.setAttribute("idus", usDTO.getId());
				RequestDispatcher rd;
				rd = request.getRequestDispatcher("juego.jsp");
				rd.forward(request, response);

			} else {
				response.sendRedirect("./resultado.jsp");
			}

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
