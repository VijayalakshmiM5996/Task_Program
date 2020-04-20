package com.prft.crud_springboot.crud_springboot.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    private long id;
    private String todayTask;
    private String status;
    private String blockers;
 
    public Employee() {
  
    }
 
    public Employee(String todayTask, String status, String blockers) {
         this.todayTask = todayTask;
         this.status = status;
         this.blockers = blockers;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "today_task", nullable = false)
    public String getTodayTask() {
        return todayTask;
    }
    public void setTodayTask(String todayTask) {
        this.todayTask = todayTask;
    }
 
    @Column(name = "status", nullable = false)
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
 
    @Column(name = "blockers", nullable = false)
    public String getBlockers() {
        return blockers;
    }
    public void setBlockers(String blockers) {
        this.blockers = blockers;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", Today's Task=" + todayTask + ", Status=" + status + ", Blockers=" + blockers
       + "]";
    }
 
}