package com.vendor.configration;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	private VendorProductService vendorProductService; 
	
	@RequestMapping(value = "/productPrice",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<List<VendorProduct>> getProductPrice() {
		
		 List<VendorProduct> vendorProducts = vendorProductService.getVendorBestPrices();
		 
		 return new ResponseEntity<>(vendorProducts, HttpStatus.OK);
	}
}
