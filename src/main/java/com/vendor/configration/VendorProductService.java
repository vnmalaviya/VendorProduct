package com.vendor.configration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
