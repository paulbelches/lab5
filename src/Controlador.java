import java.util.ArrayList;
/*Controlador.class
 * Ra�l Monz�n 17014
 * Paul Belches 17088
 */
public class Controlador {
	
	private ArrayList<Tanque> tanques;
	private ArrayList<Municipio> muni;
	private db db; 
	private int contador;
	
	/**
	 * Constructor
	 */
	public Controlador() {
		tanques = new ArrayList<Tanque>();
		muni = new ArrayList<Municipio>();
		db = new db();
		tanques = db.cargar();
		muni.add(new Municipio(123400, "Guatemala"));
	}
	
	/**
	 * @return
	 */
	public ArrayList<Tanque> getTanques() {
		return tanques;
	}
	
	/**
	 * @param posTanque
	 * @param posMuni
	 * @param posValvula
	 * @param estado
	 */
	public void cambiarEstado(int posTanque, int posMuni, int posValvula, boolean estado) {
		tanques.get(posTanque).activar(muni.get(posMuni), posValvula, estado);
		db.guardar(tanques);
	}
	
	/**
	 * @param tanques
	 */
	public void setTanques (ArrayList<Tanque> tanques) {
		this.tanques = tanques;
	}
	
	/**
	 * @return
	 */
	public String tanques() {
		String s = "";
		for (int i = 0; i<tanques.size();i++) {
			s = s + tanques.get(i).toString();
		}
		return s;
	}
	
	/**
	 * @return
	 */
	public int cantidadV() {
		/*String s = "";
		for (int i = 0; i<tanques.size();i++) {
			for (int j = 0; i<tanques.get(i).getValvula().length;j++) {
				s = s + tanques.get(i).getValvula()[j].toString();
			}
		}
		return s;*/
		int s=0;
		for (int i = 0; i<tanques.size();i++) {
			if(tanques.get(i).getClass()==Cilindrico.class) {
				s=s+tanques.get(i).valvulasAbiertas();
			}
		}
		return s;
	}
	
	/**
	 * @return
	 */
	public double cantidadR() {
		double vt = 0;
		for (int i = 0; i<tanques.size();i++) {
			double v = 0 ;
			for (int j = 0; i<tanques.get(i).getValvula().length;j++) {
				v = v + tanques.get(i).getValvula()[j].getCantidad();
			}
			v = tanques.get(i).capacidad() - v;
			vt = vt + v;
		}
		return vt;
	}
	
	/**
	 * @param tipo_tanque
	 * @param altura
	 * @param radio
	 * @param ancho
	 * @param profundidad
	 * @param id
	 */
	public void AgregarTanque(int tipo_tanque,double altura, double radio, double ancho, double profundidad, long id) {
		if (contador<10) {
				if (tipo_tanque==2) {
					Tanque cuadrado=new Cubico(id, altura);
					tanques.add(cuadrado);
				}
				if (tipo_tanque==3) {
					Tanque rectangulo=new Ortogonal(id,ancho,profundidad, altura);
					tanques.add(rectangulo);
				}
				if (tipo_tanque==1) {
					Tanque circulo=new Cilindrico(id,altura, radio);
					tanques.add(circulo);
				}
				contador++;
				db.guardar(tanques);
		}
	}
	
	public String getTanqueEsp(int pos) {
		return tanques.get(pos).toString();
		
	}
	
	/**
	 * @param tipo_tanque
	 * @param altura
	 * @param radio
	 * @param ancho
	 * @param profundidad
	 * @param id
	 * @param pos
	 */
	public void modificar(int tipo_tanque,double altura, double radio, double ancho, double profundidad, long id,int pos) {
		if (tipo_tanque==1) {
			Tanque circulo=new Cilindrico(id,altura, radio);
			tanques.set(pos, circulo);
		}
		if (tipo_tanque==2) {
			Tanque cuadrado=new Cubico(id, altura);
			tanques.set(pos, cuadrado);
		}
		if (tipo_tanque==3) {
			Tanque rectangulo=new Ortogonal(id,ancho,profundidad, altura);
			tanques.set(pos, rectangulo);
		}
		db.guardar(tanques);
	}
	
	
}
