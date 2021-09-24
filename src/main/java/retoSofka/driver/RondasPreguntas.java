package retoSofka.driver;



import java.util.ArrayList;

import retoSofka.model.PreguntasDTO;
import retoSofka.model.RespuestasDTO;

public class RondasPreguntas {
	
	private PreguntasDTO preguntas;
	private RespuestasDTO respuesta1, respuesta2, respuesta3, respuesta4;
	public RondasPreguntas() {
		
	}
	
	public RondasPreguntas(PreguntasDTO preguntas, RespuestasDTO respuesta1, 
			RespuestasDTO respuesta2,
			RespuestasDTO respuesta3, RespuestasDTO respuesta4) {
		super();
		this.preguntas = preguntas;
		this.respuesta1 = respuesta1;
		this.respuesta2 = respuesta2;
		this.respuesta3 = respuesta3;
		this.respuesta4 = respuesta4;
	}
	public PreguntasDTO getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(PreguntasDTO preguntas) {
		this.preguntas = preguntas;
	}
	public RespuestasDTO getRespuesta1() {
		return respuesta1;
	}
	public void setRespuesta1(RespuestasDTO respuesta1) {
		this.respuesta1 = respuesta1;
	}
	public RespuestasDTO getRespuesta2() {
		return respuesta2;
	}
	public void setRespuesta2(RespuestasDTO respuesta2) {
		this.respuesta2 = respuesta2;
	}
	public RespuestasDTO getRespuesta3() {
		return respuesta3;
	}
	public void setRespuesta3(RespuestasDTO respuesta3) {
		this.respuesta3 = respuesta3;
	}
	public RespuestasDTO getRespuesta4() {
		return respuesta4;
	}
	public void setRespuesta4(RespuestasDTO respuesta4) {
		this.respuesta4 = respuesta4;
	}

	@Override
	public String toString() {
		return "RondasPreguntas [preguntas=" + preguntas + ", respuesta1=" + respuesta1 + ", respuesta2=" + respuesta2
				+ ", respuesta3=" + respuesta3 + ", respuesta4=" + respuesta4 + "]";
	}
	
	
}
