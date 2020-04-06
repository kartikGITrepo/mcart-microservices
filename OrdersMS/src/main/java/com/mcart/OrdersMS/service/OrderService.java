package com.mcart.OrdersMS.service;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mcart.OrdersMS.exception.McartException;
import com.mcart.OrdersMS.dto.CartDTO;
import com.mcart.OrdersMS.dto.UserOrderDTO;
import com.mcart.OrdersMS.entity.Orders;
import com.mcart.OrdersMS.repository.OrdersRepository;;

@Service
public class OrderService{

	@Autowired
	private OrdersRepository orderRepo;
	
	@Autowired
	private RestTemplate template;
	
	public String placeOrder(@Valid UserOrderDTO userOrderDTO) throws McartException {
		CartDTO userCart = template.getForObject("http://CARTMS"+"/carts?username="+userOrderDTO.getUserName(), CartDTO.class);
		Orders order = new Orders();
		order.setCartId(userCart.getCartID());
		order.setDateOfOrder(new Date());
		order.setOrderAmount(userOrderDTO.getOrderAmount());
		order.setProductsInOrder(userCart.getProductsInCart().toString());
		order.setOrderId(2001);
		orderRepo.saveAndFlush(order);
		if(template.postForObject("http://CARTMS"+"/carts/close?username="+userOrderDTO.getUserName(), null, Boolean.class)==Boolean.TRUE)
		{
			return "New order placed with the ID : "+order.getOrderId();
		}
		throw new McartException("Cart does not exist.");
	}

}
