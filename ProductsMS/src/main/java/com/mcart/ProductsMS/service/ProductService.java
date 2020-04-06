package com.mcart.ProductsMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcart.ProductsMS.dto.ProductsDTO;
import com.mcart.ProductsMS.entity.Products;
import com.mcart.ProductsMS.exception.McartException;
import com.mcart.ProductsMS.repository.ProductsRepository;

@Service
public class ProductService{

	@Autowired
	private ProductsRepository prdrepo;
	
	public String deleteProduct(String productName) throws McartException{
		Products prd = prdrepo.findByProductName(productName);
		if (prd==null)
			return "Product not available";
		prdrepo.delete(prd);
		return "Product removed successfully";
	}
	
	public List<ProductsDTO> getMobiles() throws McartException{
		List<Products> prodList = prdrepo.findByProductCodeStartsWith("MOB");
		List<ProductsDTO> productsList = new ArrayList<>();
		for(Products prod : prodList)
		{
			productsList.add(prod.EntityToDto(prod));
		}
		return productsList;
	}

	public List<ProductsDTO> getTablets() throws McartException{
		List<Products> prodList = prdrepo.findByProductCodeStartsWith("TAB");
		List<ProductsDTO> productsList = new ArrayList<>();
		for(Products prod : prodList)
		{
			productsList.add(prod.EntityToDto(prod));
		}
		return productsList;	}

}
