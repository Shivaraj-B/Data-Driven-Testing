package com.datadriven.entity;

public class AppType {
	private String nominatedCard;
	private boolean isMpmSheet;
	private String productType;
	private String selectedProduct;
	private String fulfilmentType;
	private String callerName;
	private String applicationCreatedFor;
	public AppType(String nominatedCard, boolean isMpmSheet, String productType, String selectedProduct,
			String fulfilmentType, String callerName, String applicationCreatedFor) {
		super();
		this.nominatedCard = nominatedCard;
		this.isMpmSheet = isMpmSheet;
		this.productType = productType;
		this.selectedProduct = selectedProduct;
		this.fulfilmentType = fulfilmentType;
		this.callerName = callerName;
		this.applicationCreatedFor = applicationCreatedFor;
	}
	
	public AppType() {
		
	}

	public String getNominatedCard() {
		return nominatedCard;
	}

	public void setNominatedCard(String nominatedCard) {
		this.nominatedCard = nominatedCard;
	}

	public boolean getIsMpmSheet() {
		return isMpmSheet;
	}

	public void setIsMpmSheet(boolean isMpmSheet) {
		this.isMpmSheet = isMpmSheet;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSelectedProduct() {
		return selectedProduct;
	}

	public void setSelectedProduct(String selectedProduct) {
		this.selectedProduct = selectedProduct;
	}

	public String getFulfilmentType() {
		return fulfilmentType;
	}

	public void setFulfilmentType(String fulfilmentType) {
		this.fulfilmentType = fulfilmentType;
	}

	public String getCallerName() {
		return callerName;
	}

	public void setCallerName(String callerName) {
		this.callerName = callerName;
	}

	public String getApplicationCreatedFor() {
		return applicationCreatedFor;
	}

	public void setApplicationCreatedFor(String applicationCreatedFor) {
		this.applicationCreatedFor = applicationCreatedFor;
	}
	
	
	
	
	

}
