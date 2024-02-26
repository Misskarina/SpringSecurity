package com.karina.springsecurity;

import jakarta.persistence.Embeddable;

@Embeddable
public class StudentDetails {

	String fathername;
	String address;
	int phone_no;
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

}
