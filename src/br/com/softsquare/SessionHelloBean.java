package br.com.softsquare;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;





public class SessionHelloBean implements Serializable {
	
	private static final long serialVersionID = 1L; 
	
	private String name="Sr: ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionid() {
		return serialVersionID;
	}
	
	

}
