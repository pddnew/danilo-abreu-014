package edu.pddnew.test.bean;

import java.io.Serializable;

public class PersonPhone implements Serializable {
	
	public enum PhoneType { cellphone, home, office }
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8767771526560847063L;

	private PhoneType type;
	private String number;
	public PhoneType getType() {
		return type;
	}
	public void setType(PhoneType type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
