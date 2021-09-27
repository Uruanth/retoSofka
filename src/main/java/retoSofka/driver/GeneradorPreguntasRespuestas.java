package retoSofka.driver;

/**Clase que aprovehca otros objetos para generar una lista
 * con las preguntas y respuestas en la Base de datos
 * @author Dairon Perilla
 */


import java.util.ArrayList;

import retoSofka.model.PendientesDAO;
import retoSofka.model.PendientesDTO;
import retoSofka.model.PreguntasDAO;
import retoSofka.model.PreguntasDTO;
import retoSofka.model.RespuestasDAO;
import retoSofka.model.RespuestasDTO;
import retoSofka.model.UsuarioDTO;

public class GeneradorPreguntasRespuestas {

	/**
	 * Devuelve un ArrayList con las preguntas de la base de datos
	 * @param us recibe un usuario, con un valor minimo obligatorio de id
	 * @return ArrayList<RondasPreguntas\>
	 */
	public ArrayList<RondasPreguntas> listaCompleta(UsuarioDTO us) {
		
		ArrayList<RondasPreguntas> lista=new ArrayList<>();
		
		//Si tiene pendientes, en que categoria se asigna
		int categoria =1;
		if(verificarPendientes(us.getId())!=null) 
			categoria=verificarPendientes(us.getId()).getCategoriaPregunta();
		
		PreguntasDTO preDTO=new PreguntasDTO();
		PreguntasDAO preDAO = new PreguntasDAO();
		
		RespuestasDAO resDAO=new RespuestasDAO();
		RespuestasDTO resDTO = new RespuestasDTO();
		if(categoria>5)categoria=0;
		preDTO.setCatPregunt(categoria);
		for(int i=categoria; i<=5; i++) {
			ArrayList<PreguntasDTO> preguntas=preDAO.consultaByCategoria(i);
			
			for(PreguntasDTO p: preguntas) {
				ArrayList<RespuestasDTO> res=resDAO.respuestasById(p.getId_pregunta());
				try {
					RondasPreguntas rp = new RondasPreguntas(p, res.get(0), res.get(1),
							 res.get(2), res.get(3));
					lista.add(rp);
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					
					System.out.println("error crear rp");
				}
				
				
				
				
			}
			
		}
		return lista;
	}
	
	/**
	 * Verifica si el usuario tiene alguna sesión pendiente
	 * @param us
	 * @return
	 */
	private PendientesDTO verificarPendientes(int us) {
		PendientesDAO penDAO = new PendientesDAO(); 
		PendientesDTO penDTO = new PendientesDTO();
		penDTO.setId_user(us);
		penDTO.setCategoriaPregunta(1);
		penDTO = penDAO.consultar(penDTO);
		if(penDTO!=null) {
			penDTO = penDAO.consultar(penDTO);
			return penDTO;
		} else {
			PendientesDTO penDTO2=new PendientesDTO(us, 1);
			penDAO.crear(penDTO2);
			return penDTO2;
		}
		
	}
	
}
