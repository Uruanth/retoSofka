package retoSofka.driver;

import java.util.Timer;
import java.util.TimerTask;

public class TempoPru extends TimerTask {
	
	String ss;
	int cont=0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ss=cambS(ss);
		cont++;
		System.out.println(ss);
		if(cont>5) cancel();
	}
	
	
	private String cambS(String ss) {
		ss+="l ";
		
		return ss;
	}


	public String getSs() {
		return ss;
	}


	public void setSs(String ss) {
		this.ss = ss;
	}
	
	

}
