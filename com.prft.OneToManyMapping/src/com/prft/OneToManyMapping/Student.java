package com.prft.OneToManyMapping;
import java.util.List;    
import javax.persistence.*;   
@Entity  
public class Student {  
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private int reg_no;  
    private String s_name;  
      
    @OneToMany(targetEntity=Exams.class)  
    private List student_exam;  
      
    public List getStudent_exam() {  
        return student_exam;  
    }  
    public void setStudent_exam(List student_exam) {  
        this.student_exam = student_exam;  
    }  
    public int getReg_no() {  
        return reg_no;  
    }  
    public void setReg_no(int reg_no) {  
        this.reg_no = reg_no;  
    }  
    public String getS_name() {  
        return s_name;  
    }  
    public void setS_name(String s_name) {  
        this.s_name = s_name;  
    }  
  
      
      
      
}  