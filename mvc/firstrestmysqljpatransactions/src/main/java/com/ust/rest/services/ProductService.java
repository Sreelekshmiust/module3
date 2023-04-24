package com.ust.rest.services;
 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.repository.UserRepository;
import com.ust.rest.resource.Product;
import com.ust.rest.resource.User;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	@Autowired
	UserRepository userRepository;
	
	public Product getProduct(long productId) { 
			 Optional<Product> optional=productRepository.findById(productId);
			 if(optional.isPresent()) {
				 return optional.get();
			 }
			 else {
				 return null;
			 }
	}
	
	  public List<Product> getProducts(){ 
		  return productRepository.findAll(); 
		  }
	  @Transactional(propagation = Propagation.REQUIRES_NEW)
		public Product add(Product product) {

			Product productT=productRepository.save(product);
			
			return productT;
			
			
		}
	  
		@Transactional(propagation= Propagation.REQUIRES_NEW)
		public boolean addUser() {
			User user=new User();
			user.setUserId(5L);
			user.setDateTime(System.currentTimeMillis()+"767676767676767676 ");
			try {
				User userT=userRepository.save(user);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			return true;
		}
		
		/*
		 * @Transactional(propagation= Propagation.REQUIRES_NEW) public boolean
		 * addUser() { User user=new User(); user.setUserId(5L);
		 * user.setDateTime(System.currentTimeMillis()+"767676767676767676 "); User
		 * userT=userRepository.save(user); return true; }
		 */
	  
	 
//	  @Transactional
//		public Product add(Product product)
//		{
//			productRepository.save(product);
//			Product productT = productRepository.save(product);
//			User user=new User();
//			user.setUserId(5L);
//			user.setDateTime(System.currentTimeMillis()+"767676767676767676767676");
//			User userT= userRepository.save(user);
//			return productT;
//			
//	
//		}
	  public Product updateProduct(Product product) { 
	     return productRepository.save(product); 
	     
	  } 
	  public void deleteProduct(long productId) { 
		  productRepository.deleteById(productId); }
	 

}
