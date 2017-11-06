import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Entity;
@Entity
public class Cubico extends Tanque{
	
	public Cubico() {
		id = 0; 
		altura = 0; 
	}

	public Cubico(long id, double arista) {
		super(id, arista);
	}
	
	
	public void activar(Municipio muni, int pos,boolean estado){
		super.activar(muni, pos, estado);
	}
	
	public String toString() {
		return "Tanque: Cubico"+"\n"+"largo y profundidad: "+altura+"\n"+super.toString();
	}
	
	@Override
	public double capacidad() {
		// TODO Auto-generated method stub
		return altura*altura*altura;
	}
	
}
