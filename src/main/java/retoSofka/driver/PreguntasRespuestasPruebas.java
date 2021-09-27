package retoSofka.driver;

import java.util.ArrayList;

import retoSofka.model.PreguntasDAO;
import retoSofka.model.PreguntasDTO;
import retoSofka.model.RespuestasDAO;
import retoSofka.model.RespuestasDTO;
/**
 * Clase diseñada para agregar una base de datos con 26 preguntas y sus
 * respectivas respuestas correctas e incorrectas
 * @author Dairon Perilla
 *
 */
public class PreguntasRespuestasPruebas {

	
	/**
	 * Con ayuda de la clase IngresoBaseData agrega 26 preguntas y
	 * sus respectivas respuestas correctas e incorrectas
	 */
	public void iniciarBD() {
		
		
		ArrayList<PreguntasDTO> ap=new ArrayList<>();

		ap.add(new PreguntasDTO("1_0001", "¿Cual es el resultado de 2+2?", 1));
		ap.add(new PreguntasDTO("1_0002", "¿Cual es el resultado de 4+2?", 1));
		ap.add(new PreguntasDTO("1_0003", "¿Cual es el resultado de 2+8?", 1));
		ap.add(new PreguntasDTO("1_0004", "¿Cual es el resultado de 12+8?", 1));
		ap.add(new PreguntasDTO("1_0005", "¿Cual es el resultado de 21+2?", 1));
		ap.add(new PreguntasDTO("1_0006", "¿Cual es el resultado de 2+7?", 1));
		ap.add(new PreguntasDTO("2_0001", "¿Cual es el resultado de 7*2?", 2));
		ap.add(new PreguntasDTO("2_0002", "¿Cual es el resultado de 2*8?", 2));
		ap.add(new PreguntasDTO("2_0003", "¿Cual es el resultado de 2*5?", 2));
		ap.add(new PreguntasDTO("2_0004", "¿Cual es el resultado de 2*9?", 2));
		ap.add(new PreguntasDTO("2_0005", "¿Cual es el resultado de 2*12?", 2));
		ap.add(new PreguntasDTO("3_0001", "¿Cual es el resultado de 7/2?", 3));
		ap.add(new PreguntasDTO("3_0002", "¿Cual es el resultado de 2/8?", 3));
		ap.add(new PreguntasDTO("3_0003", "¿Cual es el resultado de 2/5?", 3));
		ap.add(new PreguntasDTO("3_0004", "¿Cual es el resultado de 2/9?", 3));
		ap.add(new PreguntasDTO("3_0005", "¿Cual es el resultado de 2/1?", 3));
		ap.add(new PreguntasDTO("4_0001", "¿Cual es el resultado de 7*27*2?", 4));
		ap.add(new PreguntasDTO("4_0002", "¿Cual es el resultado de 2*82*8?", 4));
		ap.add(new PreguntasDTO("4_0003", "¿Cual es el resultado de 2*52*5?", 4));
		ap.add(new PreguntasDTO("4_0004", "¿Cual es el resultado de 2*92*9?", 4));
		ap.add(new PreguntasDTO("4_0005", "¿Cual es el resultado de 2*12*17?", 4));
		ap.add(new PreguntasDTO("5_0001", "¿Cual es el resultado de (7*27)/2", 5));
		ap.add(new PreguntasDTO("5_0002", "¿Cual es el resultado de (2*82)/8", 5));
		ap.add(new PreguntasDTO("5_0003", "¿Cual es el resultado de (2*52)/5", 5));
		ap.add(new PreguntasDTO("5_0004", "¿Cual es el resultado de (2*92)/9", 5));
		ap.add(new PreguntasDTO("5_0005", "¿Cual es el resultado de (2*12)/1", 5));
		ap.add(new PreguntasDTO("5_0006", "¿Cual es el resultado de 2/(2*7)?", 5));
		
		
		ArrayList<RespuestasDTO> ar=new ArrayList<>();

		ar.add(new RespuestasDTO("1_0001", "El resultado es: 4.", "C"));
		ar.add(new RespuestasDTO("1_0002", "El resultado es: 6.", "C"));
		ar.add(new RespuestasDTO("1_0003", "El resultado es: 10.", "C"));
		ar.add(new RespuestasDTO("1_0004", "El resultado es: 20.", "C"));
		ar.add(new RespuestasDTO("1_0005", "El resultado es: 23.", "C"));
		ar.add(new RespuestasDTO("1_0006", "El resultado es: 9.", "C"));

		ar.add(new RespuestasDTO("1_0001", "El resultado esta en tu corazon.", "I"));
		ar.add(new RespuestasDTO("1_0002", "El resultado esta no es", "I"));
		ar.add(new RespuestasDTO("1_0003", "El resultado esta cerca.", "I"));
		ar.add(new RespuestasDTO("1_0004", "El resultado esta cerca.", "I"));
		ar.add(new RespuestasDTO("1_0005", "El resultado esta cerca.", "I"));
		ar.add(new RespuestasDTO("1_0006", "El resultado esta cerca.", "I"));

		ar.add(new RespuestasDTO("1_0001", "El resultado es: 35,72.", "I"));
		ar.add(new RespuestasDTO("1_0002", "El resultado es: 35,72.", "I"));
		ar.add(new RespuestasDTO("1_0003", "El resultado es: 35,72.", "I"));
		ar.add(new RespuestasDTO("1_0004", "El resultado es: 35,728.", "I"));
		ar.add(new RespuestasDTO("1_0005", "El resultado es: 35,722.", "I"));
		ar.add(new RespuestasDTO("1_0006", "El resultado es: 35,72.", "I"));

		ar.add(new RespuestasDTO("1_0001", "El resultado es: dos gatos y un perro", "I"));
		ar.add(new RespuestasDTO("1_0002", "El resultado es: dos gatos y un perro", "I"));
		ar.add(new RespuestasDTO("1_0003", "El resultado es: dos gatos y un perro", "I"));
		ar.add(new RespuestasDTO("1_0004", "El resultado es: dos gatos y un perro", "I"));
		ar.add(new RespuestasDTO("1_0005", "El resultado es: dos gatos y un perro", "I"));
		ar.add(new RespuestasDTO("1_0006", "El resultado es: dos gatos y un perro", "I"));

		ar.add(new RespuestasDTO("2_0001", "El resultado es: 14.", "C"));
		ar.add(new RespuestasDTO("2_0002", "El resultado es: 16.", "C"));
		ar.add(new RespuestasDTO("2_0003", "El resultado es: 10.", "C"));
		ar.add(new RespuestasDTO("2_0004", "El resultado es: 18.", "C"));
		ar.add(new RespuestasDTO("2_0005", "El resultado es: 24.", "C"));

		ar.add(new RespuestasDTO("2_0001", "El resultado es: -24.", "I"));
		ar.add(new RespuestasDTO("2_0002", "El resultado es: -24.", "I"));
		ar.add(new RespuestasDTO("2_0003", "El resultado es: -24.", "I"));
		ar.add(new RespuestasDTO("2_0004", "El resultado es: -24.", "I"));
		ar.add(new RespuestasDTO("2_0005", "El resultado es: -242.","I"));

		ar.add(new RespuestasDTO("2_0001", "El resultado es: 18,3", "I"));
		ar.add(new RespuestasDTO("2_0002", "El resultado es: 18,3", "I"));
		ar.add(new RespuestasDTO("2_0003", "El resultado es: 18,3", "I"));
		ar.add(new RespuestasDTO("2_0004", "El resultado es: 18,3", "I"));
		ar.add(new RespuestasDTO("2_0005", "El resultado es: 18,3", "I"));

		ar.add(new RespuestasDTO("2_0001", "El resultado es: una ballena remolacando un agila", "I"));
		ar.add(new RespuestasDTO("2_0002", "El resultado es: una ballena remolacando un agila", "I"));
		ar.add(new RespuestasDTO("2_0003", "El resultado es: una ballena remolacando un agila", "I"));
		ar.add(new RespuestasDTO("2_0004", "El resultado es: una ballena remolacando un agila", "I"));
		ar.add(new RespuestasDTO("2_0005", "El resultado es: una ballena remolacando un agila", "I"));

		ar.add(new RespuestasDTO("3_0001", "El resultado es: 3.5", "C"));
		ar.add(new RespuestasDTO("3_0002", "El resultado es: 0.25", "C"));
		ar.add(new RespuestasDTO("3_0003", "El resultado es: 0.4.", "C"));
		ar.add(new RespuestasDTO("3_0004", "El resultado es: 0.222", "C"));
		ar.add(new RespuestasDTO("3_0005", "El resultado es: 2", "C"));

		ar.add(new RespuestasDTO("3_0001", "El resultado es: 1.5", "I"));
		ar.add(new RespuestasDTO("3_0002", "El resultado es: 1.5", "I"));
		ar.add(new RespuestasDTO("3_0003", "El resultado es: 1.5", "I"));
		ar.add(new RespuestasDTO("3_0004", "El resultado es: 1.5", "I"));
		ar.add(new RespuestasDTO("3_0005", "El resultado es: 1.5", "I"));

		ar.add(new RespuestasDTO("3_0001", "El resultado es: -0.25", "I"));
		ar.add(new RespuestasDTO("3_0002", "El resultado es: -0.25", "I"));
		ar.add(new RespuestasDTO("3_0003", "El resultado es: -0.25", "I"));
		ar.add(new RespuestasDTO("3_0004", "El resultado es: -0.25", "I"));
		ar.add(new RespuestasDTO("3_0005", "El resultado es: -0.25", "I"));

		ar.add(new RespuestasDTO("3_0001", "El resultado es: 0.422", "I"));
		ar.add(new RespuestasDTO("3_0002", "El resultado es: 0.422", "I"));
		ar.add(new RespuestasDTO("3_0003", "El resultado es: 0.422", "I"));
		ar.add(new RespuestasDTO("3_0004", "El resultado es: 0.422", "I"));
		ar.add(new RespuestasDTO("3_0005", "El resultado es: 0.422", "I"));

		ar.add(new RespuestasDTO("4_0001", "El resultado es: 378", "C"));
		ar.add(new RespuestasDTO("4_0002", "El resultado es: 1312", "C"));
		ar.add(new RespuestasDTO("4_0003", "El resultado es: 520", "C"));
		ar.add(new RespuestasDTO("4_0004", "El resultado es: 1656", "C"));
		ar.add(new RespuestasDTO("4_0005", "El resultado es: 408", "C"));

		ar.add(new RespuestasDTO("4_0001", "El resultado es: 1712", "I"));
		ar.add(new RespuestasDTO("4_0002", "El resultado es: 1712", "I"));
		ar.add(new RespuestasDTO("4_0003", "El resultado es: 1712", "I"));
		ar.add(new RespuestasDTO("4_0004", "El resultado es: 1712", "I"));
		ar.add(new RespuestasDTO("4_0005", "El resultado es: 1712", "I"));

		ar.add(new RespuestasDTO("4_0001", "El resultado es: 412", "I"));
		ar.add(new RespuestasDTO("4_0002", "El resultado es: 412", "I"));
		ar.add(new RespuestasDTO("4_0003", "El resultado es: 412", "I"));
		ar.add(new RespuestasDTO("4_0004", "El resultado es: 412", "I"));
		ar.add(new RespuestasDTO("4_0005", "El resultado es: 412", "I"));

		ar.add(new RespuestasDTO("4_0001", "El resultado es: 1287", "I"));
		ar.add(new RespuestasDTO("4_0002", "El resultado es: 1287", "I"));
		ar.add(new RespuestasDTO("4_0003", "El resultado es: 1287", "I"));
		ar.add(new RespuestasDTO("4_0004", "El resultado es: 1287", "I"));
		ar.add(new RespuestasDTO("4_0005", "El resultado es: 1287", "I"));

		ar.add(new RespuestasDTO("5_0001", "El resultado es: 94,5", "C"));
		ar.add(new RespuestasDTO("5_0002", "El resultado es: 20,5", "C"));
		ar.add(new RespuestasDTO("5_0003", "El resultado es: 20,8", "C"));
		ar.add(new RespuestasDTO("5_0004", "El resultado es: 20,44", "C"));
		ar.add(new RespuestasDTO("5_0005", "El resultado es: 24", "C"));
		ar.add(new RespuestasDTO("5_0006", "El resultado es: 0,14", "C"));


		ar.add(new RespuestasDTO("5_0001", "El resultado es: 25", "I"));
		ar.add(new RespuestasDTO("5_0002", "El resultado es: 25", "I"));
		ar.add(new RespuestasDTO("5_0003", "El resultado es: 25", "I"));
		ar.add(new RespuestasDTO("5_0004", "El resultado es: 25", "I"));
		ar.add(new RespuestasDTO("5_0005", "El resultado es: 25", "I"));
		ar.add(new RespuestasDTO("5_0006", "El resultado es: 25", "I"));

		ar.add(new RespuestasDTO("5_0001", "El resultado es: 22.3", "I"));
		ar.add(new RespuestasDTO("5_0002", "El resultado es: 22.3", "I"));
		ar.add(new RespuestasDTO("5_0003", "El resultado es: 22.3", "I"));
		ar.add(new RespuestasDTO("5_0004", "El resultado es: 22.3", "I"));
		ar.add(new RespuestasDTO("5_0005", "El resultado es: 22.3", "I"));
		ar.add(new RespuestasDTO("5_0006", "El resultado es: 22.3", "I"));

		ar.add(new RespuestasDTO("5_0001", "El resultado es: 1,8", "I"));
		ar.add(new RespuestasDTO("5_0002", "El resultado es: 1,8", "I"));
		ar.add(new RespuestasDTO("5_0003", "El resultado es: 1,8", "I"));
		ar.add(new RespuestasDTO("5_0004", "El resultado es: 1,8", "I"));
		ar.add(new RespuestasDTO("5_0005", "El resultado es: 1,8", "I"));
		ar.add(new RespuestasDTO("5_0006", "El resultado es: 1,8", "I"));
		
		
		PreguntasDAO pda=new PreguntasDAO();
		RespuestasDAO rdao=new RespuestasDAO();
		
		for(PreguntasDTO p: ap) {
			pda.agregarPregunta(p);
		}
		
		for(RespuestasDTO r: ar) {
			rdao.crearRespuesta(r);
		}
	}
	
	
}
