package com.system.inventoryrebalancing;

import java.util.*;

public class BatchOrder implements Cloneable, StockRebalanceable
{

	private String batchId;
	private String hubLocation;
	List<Item> itemList = new ArrayList<>();
	
	//deepclone
	//@Override
//	public Object clone() throws CloneNotSupportedException 
//	{
//		BatchOrder order = (BatchOrder) super.clone();
//		order.itemList = (Item) itemList.clone();
//		return Object;
//	}
}
