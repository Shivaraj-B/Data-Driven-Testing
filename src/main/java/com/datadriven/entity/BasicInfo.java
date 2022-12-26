package com.datadriven.entity;

public class BasicInfo {
	private String createdDate;
	private String merchantName;
	
	public BasicInfo() {
		
	}
	
	public BasicInfo(String createdDate, String merchantName) {
		super();
		this.createdDate = createdDate;
		this.merchantName = merchantName;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	
	
	

}
