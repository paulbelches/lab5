import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.mongodb.morphia.annotations.Embedded;
@Embedded
/*Valvula.class
* Raúl Monzón 17014
* Paul Belches 17088
*/
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
	
	/**
	 * @param muni
	 * @param estado
	 */
	public void activar(Municipio muni, boolean estado) {
		this.setMuni(muni); 
		this.setEstado(estado); 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		fechas.add(dtf.format(now));
	}
	/**
	 * @return
	 */
	public double getCantidad() {
		return muni.getcHabi()*0.037;
	}
	/**
	 * @return
	 */
	public boolean getEstado() {
		return estado;
	}
	/**
	 * @param estado
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	/**
	 * @return
	 */
	public ArrayList<String> getFechas() {
		return fechas;
	}
	/**
	 * @param fechas
	 */
	public void setFechas(ArrayList<String> fechas) {
		this.fechas = fechas;
	}
	/**
	 * @return
	 */
	public Municipio getMuni() {
		return muni;
	}
	/**
	 * @param muni
	 */
	public void setMuni(Municipio muni) {
		this.muni = muni;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s = "\n"+"Municipio: "+muni+"\n" +"Estado: "+((estado)?"abierta":"cerrada");
		for (int i = 0; i<fechas.size(); i++) {
			s = s + "\n"+fechas.get(i);
		}
		return s; 
	}
}
