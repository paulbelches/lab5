/*Ortogonal.class
 * Raúl Monzón 17014
 * Paul Belches 17088
 */
public class Ortogonal extends Tanque{
	private double largo;
	private double profundidad;
	
	/**
	 * @param id
	 * @param largo
	 * @param profundidad
	 * @param altura
	 */
	public Ortogonal(long id, double largo, double profundidad,double altura) {
		super(id,altura);
		this.largo=largo;
		this.profundidad=profundidad;
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
		return "Tanque: Ortogonal"+"\n"+"largo: "+largo+"."+"\n"+"Profundidad: "+profundidad+"\n"+super.toString();
	}
	
	/* (non-Javadoc)
	 * @see Tanque#capacidad()
	 */
	@Override
	public double capacidad() {
		// TODO Auto-generated method stub
		return largo*profundidad*altura;
	}

	/**
	 * @return
	 */
	public double getLargo() {
		return largo;
	}

	/**
	 * @param largo
	 */
	public void setLargo(double largo) {
		this.largo = largo;
	}

	/**
	 * @return
	 */
	public double getProfundidad() {
		return profundidad;
	}

	/**
	 * @param profundidad
	 */
	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	
	
	
}
