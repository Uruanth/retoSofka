package retoSofka.driver;

import java.util.ArrayList;

import retoSofka.model.RespuestasDTO;

public class SeleccionRandom {
	/* https://es.stackoverflow.com/questions/369017/arreglos-en-java-ordenar-de-manera-aleatoria
     *  Función de barajamiento usando el algoritmo Fisher Yates
     *  Se recibe un arreglo de enteros (ordenado o no) y se aplica
     *  el algoritmo de Fisher - Yates
     *
     *  Se devuelve un arreglo de enteros desordenado aleatoriamente
     */
    public static int[] fisher_yates(int a) {
        // recorremos todo el arreglo

        int[] arreglo=arre(a);

        for(int i = arreglo.length - 1; i > 0; i--) {
            // calculamos un índice aleatorio dentro del rango permitido
            int shuffled_index = (int)Math.floor(Math.random() * (i + 1));
            //guardamos el elemento que estamos iterando
            int tmp = arreglo[i];
            // asignamos el elemento aleatorio al índice iterado
            arreglo[i] = arreglo[shuffled_index];
            // asignamos el elemento iterado al índice aleatorio
            arreglo[shuffled_index] = tmp;
        }
        return arreglo;
    }

    public static int[] arre(int a){
        int[] b= new int[a];
        for(int i=0;i<a;i++){
            b[i]=i;
        }
        return  b;
    } 
    
    
    
   public static RondasPreguntas prjuego(ArrayList<RondasPreguntas> rp) {
	   int[] ente=fisher_yates(5);
	   RondasPreguntas tp=new RondasPreguntas();
	   tp=rp.get(ente[2]);
	   
	  
	   int[] en=fisher_yates(4);
	   RondasPreguntas fp=new RondasPreguntas();
	   fp.setPreguntas(tp.getPreguntas());
	   ArrayList<RespuestasDTO> teres=new ArrayList<>();
	   ArrayList<RespuestasDTO> teres2=new ArrayList<>();
	   teres.add(tp.getRespuesta1());
	   teres.add(tp.getRespuesta2());
	   teres.add(tp.getRespuesta3());
	   teres.add(tp.getRespuesta4());
	   
	
	   
	   for(int n: en) {
		   teres2.add(teres.get(n));
	   }
	   
	   
	   
	   fp.setRespuesta1(teres2.get(0));
	   fp.setRespuesta2(teres2.get(1));
	   fp.setRespuesta3(teres2.get(2));
	   fp.setRespuesta4(teres2.get(3));
	   return fp;
   }
    
    
    
}
