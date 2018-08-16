package com.vendor.entityBeans;

import java.io.Serializable;

public class VendorProduct implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String product;
	
	private Integer startDate;
	
	private Integer endDate;
	
	private String price;
	
	private boolean hasConflict;

	public VendorProduct(String product, Integer startDate, Integer endDate,String price) {
		super();
		this.product = product;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getStartDate() {
		return startDate;
	}

	public void setStartDate(Integer startDate) {
		this.startDate = startDate;
	}

	public Integer getEndDate() {
		return endDate;
	}

	public void setEndDate(Integer endDate) {
		this.endDate = endDate;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public boolean isHasConflict() {
		return hasConflict;
	}

	public void setHasConflict(boolean hasConflict) {
		this.hasConflict = hasConflict;
	}
}
