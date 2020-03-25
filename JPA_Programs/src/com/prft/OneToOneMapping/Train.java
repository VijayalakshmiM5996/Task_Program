package com.prft.OneToOneMapping;
import javax.persistence.*;
@Entity
//@Table(name="Train")
public class Train{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int Train_id;
private String Train_name;
@OneToOne
private Passenger pass;
public Train(int Train_id , String Train_name, Passenger pass) {
	super();
	this.Train_name=Train_name;
	this.Train_id=Train_id;
	this.pass=pass;
}
public Passenger getPass() {
	return pass;
}
public void setPass(Passenger pass) {
	this.pass = pass;
}
public Train() {
	super();
}


public int getTrain_id() {
	return Train_id;
}
public void setTrain_id(int train_id) {
	Train_id = train_id;
}
public String getTrain_name() {
	return Train_name;
}
public void setTrain_name(String train_name) {
	Train_name = train_name;
}


}