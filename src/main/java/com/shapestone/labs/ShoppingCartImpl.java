package com.shapestone.labs;

import java.util.ArrayList;
import java.util.List;

/**
 * User: msundell
 */
public class ShoppingCartImpl implements ShoppingCart {
	 private List<ProductItem> items = new ArrayList<ProductItem>();
	 
	 @Override
	 public void addItem(ProductItem item) {
		 items.add(item);
	 }

    @Override
    public void removeItem(ProductItem item) {
    	items.remove(item);
    }

    @Override
    public double calculateTotal() {
        double total = 0D;
        for(ProductItem item : items) {
            total += item.getCount() * item.getPrice();
        }
        return total;
    }

    @Override
    public void emptyShoppingCart() {
    	items.clear();
    }

	@Override
	public Integer getOrderItemCount() {
		int count = 0;
        for(ProductItem item : items) {
            count += item.getCount();
        }
        return count;
	}

	@Override
	public Integer getProductItemCount() {
		return items.size();
	}
}
