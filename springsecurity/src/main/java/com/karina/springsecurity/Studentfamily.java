package com.karina.springsecurity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Studentfamily {
	String mother;
	String brother;
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getBrother() {
		return brother;
	}
	public void setBrother(String brother) {
		this.brother = brother;
	}
	

}
