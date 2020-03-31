package com.prft.semesters_student;
import javax.persistence.*; 
@Entity
public class Student {
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private int reg_no;  
    private String student_name;        
    @ManyToOne  
    private Semesters sem;
	public int getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Semesters getSem() {
		return sem;
	}
	public void setSem(Semesters sem) {
		this.sem = sem;
	}
	}

