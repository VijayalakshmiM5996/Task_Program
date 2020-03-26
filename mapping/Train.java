package com.prft.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;;
@Entity
public class Train {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int l_id;
	private String l_name;
	@OneToOne  
	private Passenger pass;
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public Passenger getPass() {
		return pass;
	}
	public void setPass(Passenger pass) {
		this.pass = pass;
	}
	
	
	

}
