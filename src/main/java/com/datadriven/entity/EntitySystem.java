package com.datadriven.entity;

public class EntitySystem {
	private String tradingName;
	private boolean isFranchise;
	public EntitySystem(String tradingName, boolean isFranchise) {
		super();
		this.tradingName = tradingName;
		this.isFranchise = isFranchise;
	}
	
	public EntitySystem() {
		
	}

	public String getTradingName() {
		return tradingName;
	}

	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}

	public boolean getIsFranchise() {
		return isFranchise;
	}

	public void setIsFranchise(boolean isFranchise) {
		this.isFranchise = isFranchise;
	}


	
	
	
	

}
