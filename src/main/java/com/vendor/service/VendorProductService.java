package com.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendor.configration.VendorProductUtils;
import com.vendor.entityBeans.VendorProduct;
import com.vendor.repositories.VendorProductRepository;

@Service
public class VendorProductService {
	
	@Autowired
	private VendorProductRepository vendorProductRepository;
	
	public List<VendorProduct> getVendorBestPrices(){
		
		List<VendorProduct> nonConflictProducts = null;
		
		nonConflictProducts = VendorProductUtils.findNonConflicts(vendorProductRepository.getAllVendorProduct());
		
		return nonConflictProducts;
	}
}
