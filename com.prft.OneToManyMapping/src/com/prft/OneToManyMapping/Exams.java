package com.prft.OneToManyMapping;

import javax.persistence.*;    
@Entity  
public class Exams {  
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
private int subject_code;  
private String subject_name; 
public Exams(int subject_code, String subject_name) {  
    super();  
    this.subject_code = subject_code;  
    this.subject_name = subject_name;  
      }  
public Exams() {  
    super();  
    // TODO Auto-generated constructor stub  
}  
  
public int getSubject_code() {  
    return subject_code;  
}  
  
public void setSubject_code(int subject_code) {  
    this.subject_code = subject_code;  
}  
  
public String getSubject_name() {  
    return subject_name;  
}  
  
public void setSubject_name(String subject_name) {  
    this.subject_name = subject_name;  
}  
}