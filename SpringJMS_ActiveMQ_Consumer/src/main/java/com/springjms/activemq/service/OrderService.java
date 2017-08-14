package com.springjms.activemq.service;

import com.springjms.activemq.model.Product;

/**
 * Created by krishna1bhat on 8/13/17.
 */
public interface OrderService {

	public void processOrder(Product product);
}
