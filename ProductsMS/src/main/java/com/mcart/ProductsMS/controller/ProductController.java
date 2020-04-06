package com.mcart.ProductsMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mcart.ProductsMS.dto.ProductsDTO;
import com.mcart.ProductsMS.exception.McartException;
import com.mcart.ProductsMS.service.ProductService;

@RestController
@Validated
//@RequestMapping("/")
public class ProductController {
	@Autowired
	private ProductService productServices;
	
	@GetMapping("/tablets")
	public List<ProductsDTO> getTablets() throws McartException{
		return productServices.getTablets();
	}
	
	@GetMapping("/mobiles")
	public List<ProductsDTO> getMobiles() throws McartException{
		return productServices.getMobiles();
	}
		
	@DeleteMapping("/products/{productName}")
	public String deleteProduct(@PathVariable String productName) throws McartException{
		return productServices.deleteProduct(productName);
	}	
}
