package com.example.model.bean;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = -5611386225028407298L;
	
	private Integer id;
	private String name;
	private String password;
	private Integer phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
}
