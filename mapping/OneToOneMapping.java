package com.prft.mapping;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class OneToOneMapping {
	public static void main(String args[]) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory( "JPA_Program" );  
    EntityManager em = emf.createEntityManager( );  
    em.getTransaction( ).begin( );   
    Passenger st1=new Passenger();  
    st1.setId(3);  
    st1.setName("Karthick"); 
    st1.setLocation("beach");
      
    Passenger st2=new Passenger();  
    st2.setId(4);  
    st2.setName("Surya"); 
    st1.setLocation("beach");
    
    Train lib1=new Train();  
    lib1.setL_id(101);  
    lib1.setL_name("Anandhapuri"); 
    
    lib1.setPass(st1);  
    Train lib2=new Train();
    lib2.setL_id(102);  
    lib2.setL_name("Vaigai"); 

   
    lib2.setPass(st2);
    
    em.persist(st1);  
    em.persist(st2);   
    em.persist(lib1);  
    em.persist(lib2);  
      
    em.getTransaction().commit();  
      
    em.close();  
    emf.close();
}  

}
