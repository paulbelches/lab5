import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Entity;
/*Cubico
* Raúl Monzón 17014
* Paul Belches 17088
*/
@Entity
public class Cubico extends Tanque{
	
	public Cubico() {
		id = 0; 
		altura = 0; 
	}

	/**
	 * @param id
	 * @param arista
	 */
	public Cubico(long id, double arista) {
		super(id, arista);
	}
	
	
	/* (non-Javadoc)
	 * @see Tanque#activar(Municipio, int, boolean)
	 */
	public void activar(Municipio muni, int pos,boolean estado){
		super.activar(muni, pos, estado);
	}
	
	/* (non-Javadoc)
	 * @see Tanque#toString()
	 */
	public String toString() {
		return "Tanque: Cubico"+"\n"+"largo y profundidad: "+altura+"\n"+super.toString();
	}
	
	/* (non-Javadoc)
	 * @see Tanque#capacidad()
	 */
	@Override
	public double capacidad() {
		// TODO Auto-generated method stub
		return altura*altura*altura;
	}
	
}
