/**
 * 
 */
package com.app.jpql.example.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.jpql.example.dto.Product;
import com.app.jpql.example.services.ProductService;

import lombok.RequiredArgsConstructor;

/**
 * @author Joseph T
 *
 */

@RestController
@RequestMapping(value = "/v1")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;

	@GetMapping(value = "/products", produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public Page<Product> readAllProduct(Pageable pageable) {
		return productService.readProducts(pageable);
	}

}
