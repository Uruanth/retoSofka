package retoSofka.driver;

import java.util.ArrayList;

import retoSofka.model.HistorialDAO;
import retoSofka.model.HistorialDTO;
import retoSofka.model.PendientesDAO;
import retoSofka.model.PendientesDTO;

public class ManejoPuntaje {
	private int id;
	private int puntaje, acumulado, nuIntento;
	ArrayList<HistorialDTO> lista;
	HistorialDAO ha=new HistorialDAO();
	HistorialDTO ht=new HistorialDTO();
	
	/*En esta clase se define el leer, asignar el puntaje de la ronda y reestablecer
	 *los datos para una nueva ronda
	 */
	
	
	//Leer la categoria en la base de datos al entrar en la pagina
	private void leerResultado() {
		
		System.out.println("leer");
		PendientesDAO pa=new PendientesDAO();
		PendientesDTO pt=new PendientesDTO();
		pt.setId_user(id);
		pt=pa.consultar(pt);
		System.out.println(pt);
		puntaje=pt.getCategoriaPregunta();
		System.out.println(puntaje);
		switch(puntaje) {
			case 2:
				puntaje=0;
				break;
			case 3:
				puntaje=1;
				acumulado=1;
				break;
			case 4:
				puntaje=2;
				acumulado=2;
				break;
			case 5:
				puntaje=3;
				acumulado=3;
				break;
			case 6:
				puntaje=4;
				acumulado=4;
				break;
			case 7:
				puntaje=5;
				acumulado=5;
				break;
			default:
				puntaje=10;
				break;
		}
		
	}

	//Agregar el resultado de la ultima partida
	private ArrayList<HistorialDTO> agregarResultado() {
		
		leerResultado();
		if(puntaje>5) return null;
		ht.setNumeroIntento(nuIntento+1);
		ht.setPuntaje(puntaje);
		ht.setAcumulado(acumulado);
		lista.add(ht);
		ha.create(ht);
		return lista;
	}

	//ArrayList de los resultados totales
	public ArrayList<HistorialDTO> historialPuntaje() {
		
		ht.setId_user(id);
		
		lista=ha.registros(ht);
		System.out.println("ll "+lista);
		nuIntento=lista.size();
		if(agregarResultado()!=null) {
		}
		
		return lista;
	}

	
	
	public void setId(int id) {
		this.id=id;
	}
}
