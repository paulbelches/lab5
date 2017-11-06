import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Embedded;
@Embedded
public class Municipio {
	private int cHabi;
	private String nombre;
	
	public Municipio(int cHabi, String nombre) {
		this.cHabi = cHabi;
		this.nombre = nombre; 
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getcHabi() {
		return cHabi;
	}
	
	public void setcHabi(int cHabi) {
		this.cHabi = cHabi;
	}
	
	public String toString() {
		return "Nombre: "+nombre+"\n"+"Cantidad de habitantes: "+Integer.toString(cHabi);
	}
	
}
