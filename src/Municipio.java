/*Municipio.class
 * Raúl Monzón 17014
 * Paul Belches 17088
 */
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Embedded;
/**
 * @author paulb
 *
 */
@Embedded
public class Municipio {
	private int cHabi;
	private String nombre;
	
	/**
	 * @param cHabi
	 * @param nombre
	 */
	public Municipio(int cHabi, String nombre) {
		this.cHabi = cHabi;
		this.nombre = nombre; 
	}
	
	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return
	 */
	public int getcHabi() {
		return cHabi;
	}
	
	/**
	 * @param cHabi
	 */
	public void setcHabi(int cHabi) {
		this.cHabi = cHabi;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Nombre: "+nombre+"\n"+"Cantidad de habitantes: "+Integer.toString(cHabi);
	}
	
}
