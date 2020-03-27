package com.prft.OneToManyMapping;
import java.util.ArrayList;  
import javax.persistence.*;  
public class OneToManyMapping {  
  
    public static void main(String[] args) {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.prft.OneToManyMapping");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
         Exams stud=new Exams();  
           stud.setSubject_code(101);  
           stud.setSubject_name("Physics");  
            
             
           Exams stud1=new Exams();  
           stud1.setSubject_code(102);  
           stud1.setSubject_name("Chemistry");  
           
           em.persist(stud);  
           em.persist(stud1);  
             
           ArrayList<Exams> list=new ArrayList<Exams>();  
           list.add(stud);  
           list.add(stud1);  
           
        Student st1=new Student();  
         st1.setReg_no(1);  
           st1.setS_name("Deepika");  
           st1.setStudent_exam(list);     
           em.persist(st1);        
        em.getTransaction().commit();  
        em.close();  
        emf.close();      
    }   
}  