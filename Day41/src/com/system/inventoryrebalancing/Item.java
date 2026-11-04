package com.system.inventoryrebalancing;

public class Item implements Cloneable {

	private String SKU;
	private int quantity;

	public Item(String sKU, int quantity) {
		SKU = sKU;
		this.quantity = quantity;
	}

	public String getSKU() {
		return SKU;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
