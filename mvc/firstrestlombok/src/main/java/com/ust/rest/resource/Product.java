package com.ust.rest.resource;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.Setter; 

public @Data class Product {
	
	@Getter
	@Setter
	private long productId;
	private String name;
	private String description;
	private BigDecimal price;
	private int qty;
	
	
	
}
