/* Cilindrico.class
 * Raúl Monzón 17014
 * Paul Belches 17088
 */
public class Cilindrico extends Tanque{
	private double radio;
	
	/**
	 * @param id
	 * @param altura
	 * @param radio
	 */
	public Cilindrico(long id, double altura, double radio){
		super(id, altura);
		this.radio=radio;
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
		return "Tanque: Cilindrico"+"\n"+"radio: "+radio+"\n"+super.toString();
	}
	
	/* (non-Javadoc)
	 * @see Tanque#capacidad()
	 */
	@Override
	public double capacidad() {
		// TODO Auto-generated method stub
		return (radio*2*Math.PI)*altura;
	}

	
	/**
	 * @return
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
