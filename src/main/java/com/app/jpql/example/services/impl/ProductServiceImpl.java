/**
 * 
 */
package com.app.jpql.example.services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.jpql.example.dto.Category;
import com.app.jpql.example.dto.Product;
import com.app.jpql.example.mappers.ProductMapper;
import com.app.jpql.example.repositories.ProductRepository;
import com.app.jpql.example.services.ProductService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Joseph T
 *
 */

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = false)
public class ProductServiceImpl implements ProductService {
	@Autowired
	private final ProductRepository productRepository;
	
	@Autowired
	private final ProductMapper productMapper;

	@Override
	public Page<Product> readProducts(Pageable pageable) {
		
		/* retrieving all products */
		Page<Product> products = productRepository.findAll(pageable).map(productMapper::asProduct);
		
		log.info("readProducts end ok - list: {}", products);
		log.debug("readProducts end ok - list: {}", products);
		
		return products;
	}

	@Override
	public Page<Product> readProductFilters(String code, Category category, String description, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> readAllProductByExpirationDate(Date expiratioDate, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
