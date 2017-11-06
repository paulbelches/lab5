/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.MongoClient;
import com.mongodb.operation.UpdateOperation;

import java.util.List;

/**
 *
 * @author douglas
 */
public class EjMorphia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MongoClient mongo = new MongoClient();
        Morphia morphia = new Morphia();
        morphia.map(Cubico.class); // clases a guardar
        Datastore ds = morphia.createDatastore(mongo, "Hoteles"); // Base Datos
       
        Cubico hotel = new Cubico(1,1); // objetos:
        

        // Save the POJO
        ds.save(hotel);
        /*
        // actualizar algun dato del hotel y guardarlo
        hotel.setStars(5); // promovido
        ds.save(hotel);
        
        // otro Hotel:
        hotel = new Hotel("Bonifas",2); // objetos:
        address = new Address("4ta calle","Xela","1700","Guatemala");
        //set address
        hotel.setAddress(address); 

        // Save the POJO
        ds.save(hotel);
        // recuperar los datos:
        */
        Query<Cubico> query = ds.createQuery(Cubico.class); // todos los hoteles
        
        
        List<Cubico> hoteles = query.asList();
       
        System.out.println("Todos los Hoteles");
        for (Tanque miHotel: hoteles){
            System.out.println(miHotel);
        }
        /* 
        // recuperar solo los de mÃ¡s de 3 estrellas:
        query = ds.createQuery(Hotel.class).filter("stars >",3);
        hoteles = query.asList();
        System.out.println("Hoteles con mas de tres estrellas");
        for (Hotel miHotel: hoteles){
            System.out.println(miHotel);
        }
        
        // recuperar y eliminar los hoteles con tres estrellas o menos
        query = ds.createQuery(Hotel.class).filter("stars <=",3);
        hoteles = query.asList();
        System.out.println("Eliminando Hoteles con menos de tres estrellas");
        for (Hotel miHotel: hoteles){
            System.out.println("eliminando: "+miHotel);
            ds.delete(miHotel);
        }*/
    }
    
}