package com.prft.semesters_student;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Semesters {
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

	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
private int subject_code;  
private String subject_name;  
  public Semesters(int b_id, String b_name) {  
    super();  
    this.subject_code = subject_code;  
    this.subject_name = subject_name;  
      
}  
  
public Semesters() {  
    super();  
    // TODO Auto-generated constructor stub  
}
	

}
