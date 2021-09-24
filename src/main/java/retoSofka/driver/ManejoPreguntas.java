package retoSofka.driver;

import java.util.ArrayList;


import retoSofka.model.PreguntasDAO;
import retoSofka.model.PreguntasDTO;
import retoSofka.model.UsuarioDTO;

public class ManejoPreguntas {
	
	private PreguntasDAO preDAO=new PreguntasDAO();
	
	public void agregarBancoPreguntas(ArrayList<PreguntasDTO> lista) {
		
		for(PreguntasDTO pdto: lista) {
			 preDAO.agregarPregunta(pdto);
		}
	}
	
	public ArrayList<RondasPreguntas> preguntasRonda(UsuarioDTO us) {
		
		ArrayList<RondasPreguntas> bancoPreguntas = 
				new GeneradorPreguntasRespuestas().listaCompleta(us);
			
		return bancoPreguntas;
	}
 	
	
}
