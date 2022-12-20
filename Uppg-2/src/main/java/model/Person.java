package model;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String username;
	private String password;
	
	public Person() {
		username = "admin";
		password = "admin";
	}

	public Person(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
