package br.com.softsquare;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
	

	
	private String name="Sr: ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	public String getSayWelcome(){
		if("".equals(name)|| name ==null){
			return "";
		}else{
			return "Mensagem ajax";
		}
		
	}

}
