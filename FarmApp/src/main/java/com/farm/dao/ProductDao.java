package com.farm.dao;

import java.util.ArrayList;
import java.util.List;

import com.farm.model.Product;

public class ProductDao {
private List<Product> productList;

public List<Product> getProductList(){
	Product product1=new Product();
	product1.setProductName("guitar1");
	product1.setProductCategory("instrument");
	product1.setProductDescription("this is a federa guitar");
	product1.setProductPrice(200);
	product1.setProductCondition("new");
	product1.setProductStatus("Active");
	product1.setUnitInStock(112);
	product1.setProductManufacturer("feidera");
	
	productList=new ArrayList<Product>();
	productList.add(product1);
	return productList;
	
}
}
