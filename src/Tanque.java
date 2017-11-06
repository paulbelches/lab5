import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Entity;
//import java.util.ArrayList; 
@Entity
public abstract class Tanque {
	@Id private ObjectId Id;
	protected long id;
	protected double altura;
	protected int contador;
	
	@Embedded
	protected Valvula[] valvula;
	
	
	public abstract double capacidad();
	
	public void activar(Municipio muni, int pos,boolean estado){
		valvula[pos].activar(muni, estado);
	}
	public Tanque () {	}
	public Tanque(long id,double altura) {
		this.id=id;
		this.altura=altura;
		contador=0;
		valvula = new Valvula[10];
		for (int i=0;i<10;i++) {
			valvula[i]=new Valvula();
		}
	}
	
	public int valvulasAbiertas(){
		int cont =0;
		for (int i=0;i<10;i++) {
			if (valvula[i].getEstado()) {
				cont++;
			}
		}
		return cont;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Valvula[] getValvula() {
		return valvula;
	}

	public void setValvula(Valvula[] valvula) {
		this.valvula = valvula;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public String toString() {
		String inf_valvulas="";
		for (int i=0;i<10;i++) {
			inf_valvulas=inf_valvulas+"\n"+"Valvula "+(i+1)+valvula[i].toString();
		}
		return "Altura: "+altura+"\n"+"ID: "+id+inf_valvulas;
	}
	
	
}


