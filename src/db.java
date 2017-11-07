import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;
/*db.class
* Raúl Monzón 17014
* Paul Belches 17088
*/
public class db {
	private MongoClient mongo;
    private Morphia morphia;
    private Datastore ds;
    private Datastore ds2;
    private Datastore ds3;
    
    public db () {
    	mongo = new MongoClient();
    	morphia = new Morphia();
    	morphia.mapPackage("(default package)");
    	ds = morphia.createDatastore(mongo, "Ortogonal");
    	ds2 = morphia.createDatastore(mongo, "Cubico");
    	ds3 = morphia.createDatastore(mongo, "Cilindrico");
    }
    /**
     * @return
     */
    public ArrayList<Tanque> cargar(){
    	morphia.mapPackage("(default package)");
    	ArrayList<Tanque> r = new ArrayList();
    	Query<Ortogonal> query = ds.createQuery(Ortogonal.class);
    	Query<Cubico> query2 = ds.createQuery(Cubico.class);
    	Query<Cilindrico> query3 = ds.createQuery(Cilindrico.class);
    	List<Ortogonal> t1 = query.asList();
    	List<Cubico> t2 = query2.asList();
    	List<Cilindrico> t3 = query3.asList();
        for (Tanque t: t1){
            r.add(t);
        }
        for (Tanque t: t2){
            r.add(t);
        }
        for (Tanque t: t3){
            r.add(t);
        }
        return r; 
    }
    /**
     * @param t
     */
    public void guardar(ArrayList<Tanque> t) {
    	for (Tanque a:t) {
    		if (a.getClass() == Ortogonal.class ) {
    			ds.save((Ortogonal)a);
    		}
    		if (a.getClass() == Cubico.class ) {
    			ds.save((Cubico)a);
    		}
    		if (a.getClass() == Cilindrico.class ) {
    			ds.save((Cilindrico)a);
    		}
    	}
    }
}
