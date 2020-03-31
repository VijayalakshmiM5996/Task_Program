package com.prft.ManyToMany;

import java.util.ArrayList;    
import javax.persistence.*;

import Student_Library.Library;
import Student_Library.Student;  

public class ManyToMany {  
      
    public static void main(String[] args) {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("ManyToMany");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
        Student st1=new Student(1,"Shreenath",null);  
        Student st2=new Student(2,"Sairam",null);  
          
        em.persist(st1);  
        em.persist(st2);  
          
          
        ArrayList<Student> al1=new ArrayList<Student>();  
    ArrayList<Student> al2=new ArrayList<Student>();  
          
        al1.add(st1);  
        al1.add(st2);  
          
        al2.add(st1);  
        al2.add(st2);  
          
        Library lib1=new Library(10,"OOPS",al1);  
        Library lib2=new Library(11,"Chemistry",al2);  
          
          
        em.persist(lib1);  
        em.persist(lib2);  
          
        em.getTransaction().commit();  
        em.close();  
        emf.close();  
          
    }  
  
}  