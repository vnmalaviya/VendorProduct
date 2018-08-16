package com.vendor.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vendor.entityBeans.VendorProduct;

@Component
public class VendorProductRepository {
	
	public List<VendorProduct> getAllVendorProduct() {
		
		List<VendorProduct> vendorProducts = new ArrayList<VendorProduct>();
		
		vendorProducts.add(new VendorProduct("NewApp", 1, 5,"$20K"));
		vendorProducts.add(new VendorProduct("AvidTech", 2, 8,"$25K"));
		vendorProducts.add(new VendorProduct("BlueSoft", 3, 6,"$15K"));
		vendorProducts.add(new VendorProduct("DataPro", 7, 12,"$11K"));
		vendorProducts.add(new VendorProduct("SureFind", 13, 31,"$22K"));
		
		return vendorProducts;
	}
}
