package com.fin;

import java.util.ResourceBundle;

public class valuser {

	public int userlogin(String in_user,String in_id) {
	ResourceBundle rb=ResourceBundle.getBundle("config");
	String username=rb.getString("username");
	String id=rb.getString("id");
	if(in_user.equals(username) && in_id.equals(id))
		return 1;
	else 
		return 0;
	}
	
}

