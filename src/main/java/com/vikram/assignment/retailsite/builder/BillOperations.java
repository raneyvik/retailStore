/**
 * 
 */
package com.vikram.assignment.retailsite.builder;

import java.util.List;

import com.vikram.assignment.retailsite.entity.Bill;
import com.vikram.assignment.retailsite.entity.ShoppingItem;
import com.vikram.assignment.retailsite.entity.User;

public interface BillOperations {

	public void collectUserInfo(User user);

	public Double getGroceriedItemCost(List<ShoppingItem> shoopingItemList);

	public Double collectPurchasedItems(List<ShoppingItem> shoopingItemList);

	public Double userTypeDiscountApply(Double cost);

	public Double totalBillDiscountApply(Double cost);
	
	public String printBillDetails(Bill bill);

}
