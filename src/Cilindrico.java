
public class Cilindrico extends Tanque{
	private double radio;
	
	public Cilindrico(long id, double altura, double radio){
		super(id, altura);
		this.radio=radio;
	}
	
	public void activar(Municipio muni, int pos,boolean estado){
		super.activar(muni, pos, estado);
	}
	
	public String toString() {
		return "Tanque: Cilindrico"+"\n"+"radio: "+radio+"\n"+super.toString();
	}
	
	@Override
	public double capacidad() {
		// TODO Auto-generated method stub
		return (radio*2*Math.PI)*altura;
	}

	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
