package com.prft.ManyToOne;
import javax.persistence.*;  
import javax.persistence.EntityManagerFactory;

import com.prft.semesters_student.Semesters;
import com.prft.semesters_student.Student;  
public class ManyToOne {  
  
    public static void main(String[] args) {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
          
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
        Semesters sem=new Semesters();  
        sem.setSubject_code(101);  
        sem.setSubject_name("Data Structure");  
          
        em.persist(sem);  
          
        Student st1=new Student();  
        st1.setReg_no(1);  
        st1.setStudent_name("Vipul");  
       st1.setSem(sem);  
      
          
        Student st2=new Student();  
        st2.setReg_no(2);  
        st2.setStudent_name("Vimal");  
        st2.setSem(sem);  
          
        em.persist(st1);;  
        em.persist(st2);  
          
          
        em.getTransaction().commit();  
        em.close();  
        emf.close();  
          
    }  
      
}  