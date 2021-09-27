package retoSofka.driver;

import java.util.ArrayList;

import retoSofka.model.PreguntasDTO;
import retoSofka.model.RespuestasDTO;

/**
 * Objeto que almacena la pregunta y sus posibles respuestas por ronda
 * 
 * @author Dairon Perilla
 *
 */
public class RondasPreguntas {

	private PreguntasDTO preguntas;
	private RespuestasDTO respuesta1, respuesta2, respuesta3, respuesta4;

	/**
	 * Constructor vacio
	 */
	public RondasPreguntas() {

	}

	/**
	 * Contructor
	 * 
	 * @param preguntas  PreguntasDTO
	 * @param respuesta1 RespuestasDTO
	 * @param respuesta2 RespuestasDTO
	 * @param respuesta3 RespuestasDTO
	 * @param respuesta4 RespuestasDTO
	 */
	public RondasPreguntas(PreguntasDTO preguntas, RespuestasDTO respuesta1, RespuestasDTO respuesta2,
			RespuestasDTO respuesta3, RespuestasDTO respuesta4) {
		super();
		this.preguntas = preguntas;
		this.respuesta1 = respuesta1;
		this.respuesta2 = respuesta2;
		this.respuesta3 = respuesta3;
		this.respuesta4 = respuesta4;
	}

	/**
	 * Obtiene la pregunta
	 * 
	 * @return PreguntasDTO
	 */
	public PreguntasDTO getPreguntas() {
		return preguntas;
	}

	/**
	 * Asigna los parametros de la pregunta
	 * 
	 * @param preguntas PreguntasDTO
	 */
	public void setPreguntas(PreguntasDTO preguntas) {
		this.preguntas = preguntas;
	}

	/**
	 * Obtiene los parametros de la primera respuesta
	 * 
	 * @return RespuestaDTO
	 */
	public RespuestasDTO getRespuesta1() {
		return respuesta1;
	}

	/**
	 * Asigna los parametros de la primera respuesta
	 * 
	 * @param respuesta1
	 */
	public void setRespuesta1(RespuestasDTO respuesta1) {
		this.respuesta1 = respuesta1;
	}

	/**
	 * Obtiene los parametros de la segunda respuesta
	 * 
	 * @return
	 */
	public RespuestasDTO getRespuesta2() {
		return respuesta2;
	}

	/**
	 * Asigna los parametros de la segunda respuesta
	 * 
	 * @param respuesta2
	 */
	public void setRespuesta2(RespuestasDTO respuesta2) {
		this.respuesta2 = respuesta2;
	}

	/**
	 * Obtiene los parametros de la tercera respuesta
	 * 
	 * @return
	 */
	public RespuestasDTO getRespuesta3() {
		return respuesta3;
	}

	/**
	 * Asigna los parametros de la tercera respuesta
	 * 
	 * @param respuesta3
	 */
	public void setRespuesta3(RespuestasDTO respuesta3) {
		this.respuesta3 = respuesta3;
	}

	/**
	 * Obtiene los parametros de la cuarta respuesta
	 * 
	 * @return
	 */

	public RespuestasDTO getRespuesta4() {
		return respuesta4;
	}

	/**
	 * Asigna los parametros de la cuarta respuesta
	 * 
	 * @param respuesta4
	 */
	public void setRespuesta4(RespuestasDTO respuesta4) {
		this.respuesta4 = respuesta4;
	}

	/**
	 * Sobre escribe el metodo toString
	 */
	@Override
	public String toString() {
		return "RondasPreguntas [preguntas=" + preguntas + ", respuesta1=" + respuesta1 + ", respuesta2=" + respuesta2
				+ ", respuesta3=" + respuesta3 + ", respuesta4=" + respuesta4 + "]";
	}

}
