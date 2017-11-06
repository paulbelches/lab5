import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		db db = new db();
		ArrayList<Tanque> t = db.cargar();
		for (int i = 0; i<t.size() ;i++) {
			System.out.println(t.get(i).toString());
		}
	}
}
