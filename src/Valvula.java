import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.mongodb.morphia.annotations.Embedded;
@Embedded
public class Valvula {
	
	private ArrayList<String> fechas; 
	private boolean estado;
	@Embedded
	private Municipio muni;
	
	public Valvula () {
		setFechas(new ArrayList<String>());
		setEstado(false);
		setMuni(null);
		//muni=new Municipio (0,"null"); 
	}
	
	public void activar(Municipio muni, boolean estado) {
		this.setMuni(muni); 
		this.setEstado(estado); 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		fechas.add(dtf.format(now));
	}
	public double getCantidad() {
		return muni.getcHabi()*0.037;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public ArrayList<String> getFechas() {
		return fechas;
	}
	public void setFechas(ArrayList<String> fechas) {
		this.fechas = fechas;
	}
	public Municipio getMuni() {
		return muni;
	}
	public void setMuni(Municipio muni) {
		this.muni = muni;
	}
	public String toString() {
		String s = "\n"+"Municipio: "+muni+"\n" +"Estado: "+((estado)?"abierta":"cerrada");
		for (int i = 0; i<fechas.size(); i++) {
			s = s + "\n"+fechas.get(i);
		}
		return s; 
	}
}
