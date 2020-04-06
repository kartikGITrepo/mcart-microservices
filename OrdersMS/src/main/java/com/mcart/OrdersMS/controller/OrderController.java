package com.mcart.OrdersMS.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcart.OrdersMS.service.OrderService;
import com.mcart.OrdersMS.dto.UserOrderDTO;
import com.mcart.OrdersMS.exception.McartException;


@RestController
@Validated
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderService orderServices;
	
	@PostMapping
	public String placeOrder(@Valid @RequestBody UserOrderDTO orderDTO) throws McartException {
		return orderServices.placeOrder(orderDTO);
	}
}
