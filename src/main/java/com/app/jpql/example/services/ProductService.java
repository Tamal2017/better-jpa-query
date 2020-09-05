/**
 * 
 */
package com.app.jpql.example.services;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.app.jpql.example.dto.Category;
import com.app.jpql.example.dto.Product;

/**
 * @author Joseph T
 *
 */
public interface ProductService {
	
	Page<Product> readProducts(Pageable pageable);
	
	Page<Product> readProductFilters(String code, Category category, String description ,Pageable pageable);
	
	Page<Product> readAllProductByExpirationDate(Date expiratioDate, Pageable pageable);

}
