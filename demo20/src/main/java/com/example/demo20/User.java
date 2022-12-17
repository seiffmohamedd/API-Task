package com.example.demo20;

public class User {
	String Name;
	String Password;
	int ID;
	
	public User(int ID , String Name , String Password) {
		
		this.ID=ID;
		this.Name=Name;
		this.Password=Password;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	

}
