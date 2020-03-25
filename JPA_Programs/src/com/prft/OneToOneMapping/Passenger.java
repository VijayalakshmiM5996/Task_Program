package com.prft.OneToOneMapping;
import javax.persistence.*;
@Entity
//@Table(name="passenger")
public class Passenger{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int ticket_no;
private String Passenger_name;
public int getTicket_no() {
	return ticket_no;
}
public void setTicket_no(int ticket_no) {
	this.ticket_no = ticket_no;
}
public String getPassenger_name() {
	return Passenger_name;
}
public void setPassenger_name(String passenger_name) {
	Passenger_name = passenger_name;
}
}