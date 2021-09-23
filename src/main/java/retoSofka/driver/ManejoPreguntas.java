package retoSofka.driver;

import java.util.ArrayList;

import retoSofka.model.PendientesDAO;
import retoSofka.model.PendientesDTO;
import retoSofka.model.PreguntasDAO;
import retoSofka.model.PreguntasDTO;
import retoSofka.model.UsuarioDTO;

public class ManejoPreguntas {
	
	private PreguntasDAO preDAO=new PreguntasDAO();
	ArrayList<PreguntasDTO> listaPreguntas;
	
	private void generarBancoPreguntas(ArrayList<PreguntasDTO> lista) {
		
		for(PreguntasDTO pdto: lista) {
			 preDAO.agregarPregunta(pdto);
		}
	}
	
	public void preguntasRonda(UsuarioDTO us) {
		
		
		
	}
	
	private PendientesDTO verificarPendientes(UsuarioDTO us) {
		PendientesDAO penDAO = new PendientesDAO(); 
		PendientesDTO penDTO = new PendientesDTO();
		penDTO.setId_user(us.getId());
		penDTO = penDAO.consultar(penDTO);
		return penDTO;
		
	}
	

}
