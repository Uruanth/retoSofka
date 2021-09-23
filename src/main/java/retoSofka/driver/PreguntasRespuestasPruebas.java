package retoSofka.driver;

import java.util.ArrayList;

import retoSofka.model.PreguntasDAO;
import retoSofka.model.PreguntasDTO;
import retoSofka.model.RespuestasDAO;
import retoSofka.model.RespuestasDTO;

public class PreguntasRespuestasPruebas {

	public void iniciarBD() {
		System.out.println("inicio iniciarBD");
		ArrayList<RondasPreguntas> rp=new ArrayList<>();
		
		int c=1;
		System.out.println("inicio ciclo for");
		for(int i=0;i<25; i++) {
			
			if(i>5) c=2;
			if(i>10) c=3;
			if(i>15) c=4;
			if(i>20) c=5;
			String id_p="c_"+c+"_0"+i;
			String pregunta="dasd "+i+"daf dadsdasda fdsf fdsf ds fsd ffds fsadfasdf";
			int categoria=c;
					
			PreguntasDTO pd=new PreguntasDTO(id_p, pregunta, c);
			ArrayList<RespuestasDTO> rs=new ArrayList<>();
			for (int n=0; n<4;n++) {
				
				String ff="I";
				if(n==3) ff="C";
				String r="respuesta ___i_"+i+"_+_"+n;
				RespuestasDTO res=new RespuestasDTO(id_p, r, ff);
				rs.add(res);
			}
			
			RondasPreguntas rr=new RondasPreguntas(pd, rs.get(0), rs.get(1), rs.get(2) , rs.get(3));
			rp.add(rr);
		}
		System.out.println("inicio fin ciclo for");		
		//bd
		
		for(RondasPreguntas ropre: rp) {
			PreguntasDAO pdao = new PreguntasDAO();
			RespuestasDAO rdao= new RespuestasDAO();
			
			pdao.agregarPregunta(ropre.getPreguntas());
			rdao.crearRespuesta(ropre.getRespuesta1());
			rdao.crearRespuesta(ropre.getRespuesta2());
			rdao.crearRespuesta(ropre.getRespuesta3());
			rdao.crearRespuesta(ropre.getRespuesta4());
		}
		System.out.println("inicio fin ciclo for crear BD");
	}
	
	
}
