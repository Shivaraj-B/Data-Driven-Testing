package com.datadriven.entity;

public class TestDataMapper {
	private String description;
	private BasicInfo basicInfo;
	private EntitySystem entitySystem;
	private Address address;
	private AppType appType;
	
	
	public TestDataMapper() {
		
	}
	
	public TestDataMapper(String description, BasicInfo basicInfo, EntitySystem entitySystem, Address address,
			AppType appType) {
		super();
		this.description = description;
		this.basicInfo = basicInfo;
		this.entitySystem = entitySystem;
		this.address = address;
		this.appType = appType;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BasicInfo getBasicInfo() {
		return basicInfo;
	}
	public void setBasicInfo(BasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}
	public EntitySystem getEntitySystem() {
		return entitySystem;
	}
	public void setEntitySystem(EntitySystem entitySystem) {
		this.entitySystem = entitySystem;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public AppType getAppType() {
		return appType;
	}
	public void setAppType(AppType appType) {
		this.appType = appType;
	}
	
	
}
