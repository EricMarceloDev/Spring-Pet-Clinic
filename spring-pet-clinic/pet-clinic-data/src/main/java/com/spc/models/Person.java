package com.spc.models;

public class Person extends BaseEntity{
	
	private String frstName;
	private String lastname;
	
	public String getFrstName() {
		return frstName;
	}
	public void setFrstName(String frstName) {
		this.frstName = frstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
