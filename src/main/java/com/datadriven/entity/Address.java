package com.datadriven.entity;

public class Address {
	private String addressLine1;
	private String addressLine2;
	private boolean isBusinessName;
	
	
	public Address() {
		
	}
	
	
	public Address(String addressLine1, String addressLine2, boolean isBusinessName) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.isBusinessName = isBusinessName;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public boolean getIsBusinessName() {
		return isBusinessName;
	}
	public void setIsBusinessName(boolean isBusinessName) {
		this.isBusinessName = isBusinessName;
	}
	
	

}
