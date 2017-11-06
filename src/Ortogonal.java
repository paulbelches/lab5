
public class Ortogonal extends Tanque{
	private double largo;
	private double profundidad;
	
	public Ortogonal(long id, double largo, double profundidad,double altura) {
		super(id,altura);
		this.largo=largo;
		this.profundidad=profundidad;
	}
	
	public void activar(Municipio muni, int pos,boolean estado){
		super.activar(muni, pos, estado);
	}
	
	public String toString() {
		return "Tanque: Ortogonal"+"\n"+"largo: "+largo+"."+"\n"+"Profundidad: "+profundidad+"\n"+super.toString();
	}
	
	@Override
	public double capacidad() {
		// TODO Auto-generated method stub
		return largo*profundidad*altura;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	
	
	
}
