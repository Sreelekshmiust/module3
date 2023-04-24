package com.ust.rest.resource;

import java.math.BigDecimal;  
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	private String _id;
	private String name;
	private String description;
	private BigDecimal price;
	private int qty;
	

}
