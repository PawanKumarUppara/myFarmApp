package com.hellospring;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.farm.dao.ProductDao;
import com.farm.model.Product;
@Controller
public class HomeController {
	ProductDao prductDao=new ProductDao();
@RequestMapping("/")	
public String myApp(){
	return "home";
}


@RequestMapping("/productList")
private String getproducts(Model model){
	
	 List<Product> productList = prductDao.getProductList();
	 Product product = productList.get(0);
	 
	 model.addAttribute(product);
	 
	return "productList";
}
}
