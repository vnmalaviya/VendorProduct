package com.vendor.configration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VendorProductUtils {

	public static List<VendorProduct> findNonConflicts(List<VendorProduct> vendorProducts) {
		
		VendorProduct latest = null;
		List<VendorProduct> nonConflictVendorProduct = new ArrayList<VendorProduct>(vendorProducts);
		Iterator<VendorProduct> iter = vendorProducts.iterator();
		while (iter.hasNext()) {
			VendorProduct next = iter.next();
			if (latest != null && next.getStartDate() < latest.getEndDate()) {
				next.setHasConflict(true);
				latest.setHasConflict(true);
				nonConflictVendorProduct.remove(next);
			}

			if (latest == null || next.getEndDate() > latest.getEndDate()) {
				latest = next;
			}
		}
		return nonConflictVendorProduct;
	}
}
