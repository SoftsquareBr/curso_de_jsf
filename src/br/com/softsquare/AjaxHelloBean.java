package br.com.softsquare;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class AjaxHelloBean implements Serializable {
	

	
	private String name;

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
			return "Mensagem ajax "+name;
		}
		
	}
	

}
